package bo.edu.ucbcba.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Student")
public class Student {
    
    @XmlElement(name = "atudentid")
    private int studentid;
    @XmlElement(name = "lastname")
    private String lastname;
    @XmlElement(name = "firstname")
    private String firstname;
 

    public Student(int studentid, String firstname, String lastname) {
        this.studentid = studentid;
        this.lastname = lastname;
        this.firstname = firstname;
        
    }
    
    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public void show() {
        System.out.println(studentid +" - "+ firstname+" " + lastname );
    }
}
