
package serviceCliente;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WSClientes", targetNamespace = "http://serverCliente/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSClientes {


    /**
     * 
     * @param id
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "Verificacion_de_cuenta")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Verificacion_de_cuenta", targetNamespace = "http://serverCliente/", className = "serviceCliente.VerificacionDeCuenta")
    @ResponseWrapper(localName = "Verificacion_de_cuentaResponse", targetNamespace = "http://serverCliente/", className = "serviceCliente.VerificacionDeCuentaResponse")
    @Action(input = "http://serverCliente/WSClientes/Verificacion_de_cuentaRequest", output = "http://serverCliente/WSClientes/Verificacion_de_cuentaResponse")
    public boolean verificacionDeCuenta(
        @WebParam(name = "Id", targetNamespace = "")
        String id);

}
