
package bo.edu.ucbcba.endpoint;

import bo.edu.ucbcba.ws.SimpleSchedulingWS;
import javax.xml.ws.Endpoint;

public class WSPublisher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/simplescheduling", new SimpleSchedulingWS());
        System.out.println("Service listening at: http://localhost:9999/simplescheduling?wsdl");
    }
    
}
