
package servicePilotos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicePilotos package. 
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

    private final static QName _RegistrarViaje_QNAME = new QName("http://serverPiloto/", "Registrar_viaje");
    private final static QName _RegistrarViajeResponse_QNAME = new QName("http://serverPiloto/", "Registrar_viajeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicePilotos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistrarViaje }
     * 
     */
    public RegistrarViaje createRegistrarViaje() {
        return new RegistrarViaje();
    }

    /**
     * Create an instance of {@link RegistrarViajeResponse }
     * 
     */
    public RegistrarViajeResponse createRegistrarViajeResponse() {
        return new RegistrarViajeResponse();
    }

    /**
     * Create an instance of {@link Piloto }
     * 
     */
    public Piloto createPiloto() {
        return new Piloto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarViaje }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverPiloto/", name = "Registrar_viaje")
    public JAXBElement<RegistrarViaje> createRegistrarViaje(RegistrarViaje value) {
        return new JAXBElement<RegistrarViaje>(_RegistrarViaje_QNAME, RegistrarViaje.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarViajeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverPiloto/", name = "Registrar_viajeResponse")
    public JAXBElement<RegistrarViajeResponse> createRegistrarViajeResponse(RegistrarViajeResponse value) {
        return new JAXBElement<RegistrarViajeResponse>(_RegistrarViajeResponse_QNAME, RegistrarViajeResponse.class, null, value);
    }

}
