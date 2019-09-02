
package serviceCliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serviceCliente package. 
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

    private final static QName _VerificacionDeCuenta_QNAME = new QName("http://serverCliente/", "Verificacion_de_cuenta");
    private final static QName _VerificacionDeCuentaResponse_QNAME = new QName("http://serverCliente/", "Verificacion_de_cuentaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serviceCliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VerificacionDeCuenta }
     * 
     */
    public VerificacionDeCuenta createVerificacionDeCuenta() {
        return new VerificacionDeCuenta();
    }

    /**
     * Create an instance of {@link VerificacionDeCuentaResponse }
     * 
     */
    public VerificacionDeCuentaResponse createVerificacionDeCuentaResponse() {
        return new VerificacionDeCuentaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificacionDeCuenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverCliente/", name = "Verificacion_de_cuenta")
    public JAXBElement<VerificacionDeCuenta> createVerificacionDeCuenta(VerificacionDeCuenta value) {
        return new JAXBElement<VerificacionDeCuenta>(_VerificacionDeCuenta_QNAME, VerificacionDeCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificacionDeCuentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serverCliente/", name = "Verificacion_de_cuentaResponse")
    public JAXBElement<VerificacionDeCuentaResponse> createVerificacionDeCuentaResponse(VerificacionDeCuentaResponse value) {
        return new JAXBElement<VerificacionDeCuentaResponse>(_VerificacionDeCuentaResponse_QNAME, VerificacionDeCuentaResponse.class, null, value);
    }

}
