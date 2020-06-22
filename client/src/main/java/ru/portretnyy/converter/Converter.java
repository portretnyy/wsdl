package ru.portretnyy.converter;

/**
 * @author Rakhmankulov Ed
 * @version 1
 */
public interface Converter<S,T> {
    T convert(S s);
}
