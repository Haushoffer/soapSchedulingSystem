
package bo.edu.ucbcba.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "retrieveStudentResponse", namespace = "http://ws.ucbcba.edu.bo/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveStudentResponse", namespace = "http://ws.ucbcba.edu.bo/")
public class RetrieveStudentResponse {

    @XmlElement(name = "return", namespace = "")
    private bo.edu.ucbcba.model.Student _return;

   
    public bo.edu.ucbcba.model.Student getReturn() {
        return this._return;
    }


    public void setReturn(bo.edu.ucbcba.model.Student _return) {
        this._return = _return;
    }

}
