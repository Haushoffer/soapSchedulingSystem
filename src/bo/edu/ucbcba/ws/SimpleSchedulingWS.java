package bo.edu.ucbcba.ws;

import bo.edu.ucbcba.model.Clase;
import bo.edu.ucbcba.model.Student;
import java.util.List;
import java.util.stream.Collectors;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


@WebService
public class SimpleSchedulingWS {
    private final SimpleSchedulingResource resource = new SimpleSchedulingResource();
    
    @WebMethod
    public Student createStudent(@WebParam(name = "studentId") int studentId, 
            @WebParam(name = "lastName") String lastName, 
            @WebParam(name = "firstName") String firstName) {
        return resource.createStudent(studentId, firstName, lastName);
    }
    
    @WebMethod
    public Student retrieveStudent(@WebParam(name = "studentId") int studentId) {
        return resource.retrieveStudent(studentId);
    }
    @WebMethod
    public Student editStudent (@WebParam(name = "studentId") int studentId, 
            @WebParam(name = "lastName") String lastName, 
            @WebParam(name = "firstName") String firstName){
        return resource.editStudent(studentId, firstName, lastName);
    }
    
    @WebMethod
    public Clase createClass(@WebParam(name = "code") int code, 
            @WebParam(name = "title") String title, 
            @WebParam(name = "description") String description) {
        return resource.createClass(code, title, description);
    }
    
    @WebMethod
    public Clase retrieveClass(@WebParam(name = "code") int code) {
        return resource.retrieveClass(code);
    }
    @WebMethod
    public Student editClass (@WebParam(name = "code") int code, 
            @WebParam(name = "title") String title, 
            @WebParam(name = "description") String description){
        return resource.editStudent(code, title, description);
    }
    @WebMethod
    public void deleteClass (@WebParam(name = "code") int code){
        resource.deleteStudent(code);
    }
    
    @WebMethod
    public void deleteStudent (@WebParam(name = "studentId") int studentId){
        resource.deleteStudent(studentId);
    }
    
    @WebMethod
    public List<Student> getAllStudents(){
        return resource.getStudentsMap().entrySet().stream().map(x->x.getValue()).collect(Collectors.toList());
    }
    @WebMethod
    public List<Clase> getAllClasses(){
        return resource.getClassMap().entrySet().stream().map(x->x.getValue()).collect(Collectors.toList());
    }
    @WebMethod
    public void showAllStudentsOfClass(@WebParam(name = "code") int code){
       resource.showAllStudentsOfClass(code);
    }
    @WebMethod
    public void showAllClassesOfStudent(@WebParam(name = "studentId") int studentId){
        resource.showAllClassesOfStudent(studentId);
    }
    @WebMethod
    public void showClass(@WebParam(name = "code") int code){
        resource.showClass(code);
    }
    @WebMethod
    public void showStudent(@WebParam(name = "studentId") int studentId){
       resource.showStudent(studentId);
    }
    
    @WebMethod
    public void addStudentToClass(int studentId,int code){
        resource.addStudentToClass(studentId, code);
    }
}
