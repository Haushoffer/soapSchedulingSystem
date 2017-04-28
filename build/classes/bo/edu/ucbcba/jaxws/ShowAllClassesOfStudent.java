
package bo.edu.ucbcba.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "showAllClassesOfStudent", namespace = "http://ws.ucbcba.edu.bo/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "showAllClassesOfStudent", namespace = "http://ws.ucbcba.edu.bo/")
public class ShowAllClassesOfStudent {

    @XmlElement(name = "studentId", namespace = "")
    private int studentId;

    /**
     * 
     * @return
     *     returns int
     */
    public int getStudentId() {
        return this.studentId;
    }

    /**
     * 
     * @param studentId
     *     the value for the studentId property
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

}
