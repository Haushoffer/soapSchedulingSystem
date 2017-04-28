
package bo.edu.ucbcba.ws.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getAllClassesResponse", namespace = "http://ws.ucbcba.edu.bo/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllClassesResponse", namespace = "http://ws.ucbcba.edu.bo/")
public class GetAllClassesResponse {

    @XmlElement(name = "return", namespace = "")
    private List<bo.edu.ucbcba.model.Clase> _return;

    /**
     * 
     * @return
     *     returns List<Clase>
     */
    public List<bo.edu.ucbcba.model.Clase> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<bo.edu.ucbcba.model.Clase> _return) {
        this._return = _return;
    }

}
