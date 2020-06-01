package ru.portretnyy.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author Rakhmankulov Ed
 * @version 1
 */
@WebService
public interface HelloService {

    @WebMethod
    String getTest(int id);
}
