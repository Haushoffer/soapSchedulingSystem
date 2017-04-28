
package bo.edu.ucbcba.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "retrieveClassResponse", namespace = "http://ws.ucbcba.edu.bo/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveClassResponse", namespace = "http://ws.ucbcba.edu.bo/")
public class RetrieveClassResponse {

    @XmlElement(name = "return", namespace = "")
    private bo.edu.ucbcba.model.Clase _return;

    /**
     * 
     * @return
     *     returns Clase
     */
    public bo.edu.ucbcba.model.Clase getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(bo.edu.ucbcba.model.Clase _return) {
        this._return = _return;
    }

}
