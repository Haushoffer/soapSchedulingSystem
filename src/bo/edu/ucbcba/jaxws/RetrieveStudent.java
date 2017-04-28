
package bo.edu.ucbcba.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "retrieveStudent", namespace = "http://ws.ucbcba.edu.bo/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrieveStudent", namespace = "http://ws.ucbcba.edu.bo/")
public class RetrieveStudent {

    @XmlElement(name = "studentId", namespace = "")
    private int studentId;


    public int getStudentId() {
        return this.studentId;
    }


    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

}
