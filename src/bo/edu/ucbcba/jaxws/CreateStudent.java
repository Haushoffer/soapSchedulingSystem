
package bo.edu.ucbcba.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "createStudent", namespace = "http://ws.ucbcba.edu.bo/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createStudent", namespace = "http://ws.ucbcba.edu.bo/", propOrder = {
    "studentId",
    "lastName",
    "firstName"
})
public class CreateStudent {

    @XmlElement(name = "studentId", namespace = "")
    private int studentId;
    @XmlElement(name = "lastName", namespace = "")
    private String lastName;
    @XmlElement(name = "firstName", namespace = "")
    private String firstName;

 
    public int getStudentId() {
        return this.studentId;
    }


    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


    public String getLastName() {
        return this.lastName;
    }

 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getFirstName() {
        return this.firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}
