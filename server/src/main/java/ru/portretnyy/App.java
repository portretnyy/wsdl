package ru.portretnyy;

import ru.portretnyy.service.HelloServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * @author Rakhmankulov Ed
 * @version 1
 */
public class App {
    public static void main(String[] args) {
        Endpoint.publish(
                "http://localhost:8080/HelloService",
                new HelloServiceImpl()
        );
    }
}
