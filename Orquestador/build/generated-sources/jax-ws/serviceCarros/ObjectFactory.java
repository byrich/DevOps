
package serviceCarros;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serviceCarros package. 
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

    private final static QName _AutosCercanos_QNAME = new QName("http://serverCarros/", "Autos_cercanos");
    private final static QName _AutosCercanosResponse_QNAME = new QName("http://serverCarros/", "Autos_cercanosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serviceCarros
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AutosCercanos }
     * 
     */
    public AutosCercanos createAutosCercanos() {
        return new AutosCercanos();
    }

    /**
     * Create an instance of {@link AutosCercanosResponse }
     * 
     */
    public AutosCercanosResponse createAutosCercanosResponse() {
        return new AutosCercanosResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutosCercanos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverCarros/", name = "Autos_cercanos")
    public JAXBElement<AutosCercanos> createAutosCercanos(AutosCercanos value) {
        return new JAXBElement<AutosCercanos>(_AutosCercanos_QNAME, AutosCercanos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutosCercanosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverCarros/", name = "Autos_cercanosResponse")
    public JAXBElement<AutosCercanosResponse> createAutosCercanosResponse(AutosCercanosResponse value) {
        return new JAXBElement<AutosCercanosResponse>(_AutosCercanosResponse_QNAME, AutosCercanosResponse.class, null, value);
    }

}
