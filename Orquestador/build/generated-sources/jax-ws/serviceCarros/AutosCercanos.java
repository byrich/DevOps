
package serviceCarros;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Autos_cercanos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Autos_cercanos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
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
@XmlType(name = "Autos_cercanos", propOrder = {
    "coordA",
    "coordB"
})
public class AutosCercanos {

    protected double coordA;
    protected double coordB;

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
