
package wsdl.cxf.tutorial.generatedskliton;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsdl.cxf.tutorial.v1 package. 
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

    private final static QName _GetUser_QNAME = new QName("http://tutorial.cxf.wsdl/v1", "getUser");
    private final static QName _UserNotFoundException_QNAME = new QName("http://tutorial.cxf.wsdl/v1", "UserNotFoundException");
    private final static QName _GetUserResponse_QNAME = new QName("http://tutorial.cxf.wsdl/v1", "getUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsdl.cxf.tutorial.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckFaultBean }
     * 
     */
    public CheckFaultBean createCheckFaultBean() {
        return new CheckFaultBean();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tutorial.cxf.wsdl/v1", name = "getUser")
    public JAXBElement<String> createGetUser(String value) {
        return new JAXBElement<String>(_GetUser_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckFaultBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tutorial.cxf.wsdl/v1", name = "UserNotFoundException")
    public JAXBElement<CheckFaultBean> createUserNotFoundException(CheckFaultBean value) {
        return new JAXBElement<CheckFaultBean>(_UserNotFoundException_QNAME, CheckFaultBean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tutorial.cxf.wsdl/v1", name = "getUserResponse")
    public JAXBElement<User> createGetUserResponse(User value) {
        return new JAXBElement<User>(_GetUserResponse_QNAME, User.class, null, value);
    }

}
