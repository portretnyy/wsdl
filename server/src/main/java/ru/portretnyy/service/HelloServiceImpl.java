package ru.portretnyy.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * todo описание
 *
 * @author Rakhmankulov Ed
 * @version 1
 */
@WebService(name = "ru.portretnyy.service.HelloService")
public class HelloServiceImpl implements HelloService {
    @WebMethod
    public String getTest(int id) {
        return "test";
    }
}
