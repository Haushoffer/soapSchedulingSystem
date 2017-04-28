
package bo.edu.ucbcba.ws.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getAllStudentsResponse", namespace = "http://ws.ucbcba.edu.bo/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllStudentsResponse", namespace = "http://ws.ucbcba.edu.bo/")
public class GetAllStudentsResponse {

    @XmlElement(name = "return", namespace = "")
    private List<bo.edu.ucbcba.model.Student> _return;

    /**
     * 
     * @return
     *     returns List<Student>
     */
    public List<bo.edu.ucbcba.model.Student> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<bo.edu.ucbcba.model.Student> _return) {
        this._return = _return;
    }

}
