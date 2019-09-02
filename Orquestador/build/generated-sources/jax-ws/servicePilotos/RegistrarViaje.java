
package servicePilotos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Registrar_viaje complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Registrar_viaje"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idPiloto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="coordA" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="coordB" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Registrar_viaje", propOrder = {
    "idPiloto",
    "coordA",
    "coordB"
})
public class RegistrarViaje {

    protected int idPiloto;
    protected double coordA;
    protected double coordB;

    /**
     * Obtiene el valor de la propiedad idPiloto.
     * 
     */
    public int getIdPiloto() {
        return idPiloto;
    }

    /**
     * Define el valor de la propiedad idPiloto.
     * 
     */
    public void setIdPiloto(int value) {
        this.idPiloto = value;
    }

    /**
     * Obtiene el valor de la propiedad coordA.
     * 
     */
    public double getCoordA() {
        return coordA;
    }

    /**
     * Define el valor de la propiedad coordA.
     * 
     */
    public void setCoordA(double value) {
        this.coordA = value;
    }

    /**
     * Obtiene el valor de la propiedad coordB.
     * 
     */
    public double getCoordB() {
        return coordB;
    }

    /**
     * Define el valor de la propiedad coordB.
     * 
     */
    public void setCoordB(double value) {
        this.coordB = value;
    }

}
