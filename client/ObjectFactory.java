
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
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

    private final static QName _GetHelloWorldString_QNAME = new QName("http://server/", "getHelloWorldString");
    private final static QName _GetHelloWorldStringResponse_QNAME = new QName("http://server/", "getHelloWorldStringResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetHelloWorldString }
     * 
     */
    public GetHelloWorldString createGetHelloWorldString() {
        return new GetHelloWorldString();
    }

    /**
     * Create an instance of {@link GetHelloWorldStringResponse }
     * 
     */
    public GetHelloWorldStringResponse createGetHelloWorldStringResponse() {
        return new GetHelloWorldStringResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHelloWorldString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getHelloWorldString")
    public JAXBElement<GetHelloWorldString> createGetHelloWorldString(GetHelloWorldString value) {
        return new JAXBElement<GetHelloWorldString>(_GetHelloWorldString_QNAME, GetHelloWorldString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHelloWorldStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getHelloWorldStringResponse")
    public JAXBElement<GetHelloWorldStringResponse> createGetHelloWorldStringResponse(GetHelloWorldStringResponse value) {
        return new JAXBElement<GetHelloWorldStringResponse>(_GetHelloWorldStringResponse_QNAME, GetHelloWorldStringResponse.class, null, value);
    }

}
