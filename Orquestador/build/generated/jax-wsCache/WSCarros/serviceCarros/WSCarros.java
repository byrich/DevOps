
package serviceCarros;

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
@WebService(name = "WSCarros", targetNamespace = "http://serverCarros/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSCarros {


    /**
     * 
     * @param coordA
     * @param coordB
     * @return
     *     returns int
     */
    @WebMethod(operationName = "Autos_cercanos")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Autos_cercanos", targetNamespace = "http://serverCarros/", className = "serviceCarros.AutosCercanos")
    @ResponseWrapper(localName = "Autos_cercanosResponse", targetNamespace = "http://serverCarros/", className = "serviceCarros.AutosCercanosResponse")
    @Action(input = "http://serverCarros/WSCarros/Autos_cercanosRequest", output = "http://serverCarros/WSCarros/Autos_cercanosResponse")
    public int autosCercanos(
        @WebParam(name = "coordA", targetNamespace = "")
        double coordA,
        @WebParam(name = "coordB", targetNamespace = "")
        double coordB);

}
