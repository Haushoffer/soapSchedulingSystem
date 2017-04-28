
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

    public List<bo.edu.ucbcba.model.Student> getReturn() {
        return this._return;
    }

    public void setReturn(List<bo.edu.ucbcba.model.Student> _return) {
        this._return = _return;
    }

}
