package ru.portretnyy.converter;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Rakhmankulov Ed
 * @version 1
 */
public class ConversionService {
    Map<Class<?>, Map<Class<?>, Converter<?, ?>>> converters = new HashMap<>();

    public <S, T> Converter<S, T> getConverter(Class<S> sType, Class<T> tType) {
        if (converters.containsKey(sType) && converters.get(sType).containsKey(tType)) {
            @SuppressWarnings("unchecked")
            Converter<S, T> stConverter = (Converter<S, T>) converters.get(sType).get(tType);
            return stConverter;
        }
        throw new RuntimeException(String.format("no suitable converter for %s->%s found", sType, tType));
    }

    public <S, T> T convert(S s, Class<T> tType) {
        return getConverter((Class<S>) s.getClass(), tType).convert(s);
    }

    public <S, T> List<T> listConvert(List<S> sList, Class<S> sType, Class<T> tType) {
        List<T> tList = new ArrayList<>();
        for (S s : sList) {
            tList.add(
                    getConverter(sType, tType).convert(s)
            );
        }
        return tList;
    }

    public <S,T> void registerConverter(Converter<S,T> converter, Class<S> sType, Class<T> tType) {
        converters.getOrDefault(sType, new HashMap<>()).put(tType, converter);
    }
}
