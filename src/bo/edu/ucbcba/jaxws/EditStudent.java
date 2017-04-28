
package bo.edu.ucbcba.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "editStudent", namespace = "http://ws.ucbcba.edu.bo/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "editStudent", namespace = "http://ws.ucbcba.edu.bo/", propOrder = {
    "studentId",
    "lastName",
    "firstName"
})
public class EditStudent {

    @XmlElement(name = "studentId", namespace = "")
    private int studentId;
    @XmlElement(name = "lastName", namespace = "")
    private String lastName;
    @XmlElement(name = "firstName", namespace = "")
    private String firstName;

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

    /**
     * 
     * @return
     *     returns String
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * 
     * @param lastName
     *     the value for the lastName property
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * 
     * @param firstName
     *     the value for the firstName property
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}
