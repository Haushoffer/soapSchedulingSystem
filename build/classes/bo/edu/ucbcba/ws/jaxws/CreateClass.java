
package bo.edu.ucbcba.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "createClass", namespace = "http://ws.ucbcba.edu.bo/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createClass", namespace = "http://ws.ucbcba.edu.bo/", propOrder = {
    "code",
    "title",
    "description"
})
public class CreateClass {

    @XmlElement(name = "code", namespace = "")
    private int code;
    @XmlElement(name = "title", namespace = "")
    private String title;
    @XmlElement(name = "description", namespace = "")
    private String description;

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

    /**
     * 
     * @return
     *     returns String
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * 
     * @param title
     *     the value for the title property
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * 
     * @param description
     *     the value for the description property
     */
    public void setDescription(String description) {
        this.description = description;
    }

}
