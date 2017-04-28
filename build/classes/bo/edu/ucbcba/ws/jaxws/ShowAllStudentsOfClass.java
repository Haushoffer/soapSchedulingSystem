
package bo.edu.ucbcba.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "showAllStudentsOfClass", namespace = "http://ws.ucbcba.edu.bo/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "showAllStudentsOfClass", namespace = "http://ws.ucbcba.edu.bo/")
public class ShowAllStudentsOfClass {

    @XmlElement(name = "code", namespace = "")
    private int code;

    /**
     * 
     * @return
     *     returns int
     */
    public int getCode() {
        return this.code;
    }

    /**
     * 
     * @param code
     *     the value for the code property
     */
    public void setCode(int code) {
        this.code = code;
    }

}
