
package ru.portretnyy.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.portretnyy.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetTest_QNAME = new QName("http://service.portretnyy.ru/", "getTest");
    private final static QName _GetTestResponse_QNAME = new QName("http://service.portretnyy.ru/", "getTestResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.portretnyy.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTest }
     * 
     */
    public GetTest createGetTest() {
        return new GetTest();
    }

    /**
     * Create an instance of {@link GetTestResponse }
     * 
     */
    public GetTestResponse createGetTestResponse() {
        return new GetTestResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portretnyy.ru/", name = "getTest")
    public JAXBElement<GetTest> createGetTest(GetTest value) {
        return new JAXBElement<GetTest>(_GetTest_QNAME, GetTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.portretnyy.ru/", name = "getTestResponse")
    public JAXBElement<GetTestResponse> createGetTestResponse(GetTestResponse value) {
        return new JAXBElement<GetTestResponse>(_GetTestResponse_QNAME, GetTestResponse.class, null, value);
    }

}
