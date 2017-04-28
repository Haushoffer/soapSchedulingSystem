
package bo.edu.ucbcba.ws;


import bo.edu.ucbcba.model.Clase;
import bo.edu.ucbcba.model.Student;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.HashMap;
import java.util.List;

import java.util.Map;


public class SimpleSchedulingResource {
    
   private Map<Integer, Student> studentsMap;
   
   private Map<Integer,Clase> classMap;
   
   private Map<Integer, List<Student>> studentsByClass;
   
   private Map<Integer, List<Clase>> classesByStudent;

    public Map<Integer, List<Student>> getStudentsByClass() {
        return studentsByClass;
    }

    public void setStudentsByClass(Map<Integer, List<Student>> studentsByClass) {
        this.studentsByClass = studentsByClass;
    }

    public Map<Integer, List<Clase>> getClassesByStudent() {
        return classesByStudent;
    }

    public void setClassesByStudent(Map<Integer, List<Clase>> classesByStudent) {
        this.classesByStudent = classesByStudent;
    }
   

    public Map<Integer, Student> getStudentsMap() {
        return studentsMap;
    }

    public void setStudentsMap(Map<Integer, Student> studentsMap) {
        this.studentsMap = studentsMap;
    }

    public Map<Integer, Clase> getClassMap() {
        return classMap;
    }

    public void setClassMap(Map<Integer, Clase> classMap) {
        this.classMap = classMap;
    }
   

    public SimpleSchedulingResource() {
        studentsMap = new HashMap<>();
        classMap = new HashMap<>();
        studentsByClass = new HashMap<>();
        classesByStudent = new HashMap<>();
    }
    
    public Student createStudent(int studentId, String lastName, String firstName) {
        Student student = new Student(studentId, firstName, lastName);
        if(studentsMap.get(studentId)==null){
            studentsMap.put(studentId, student);
            classesByStudent.put(studentId, new ArrayList<>());
        }
        return student;
    }

    
    public Student editStudent (int studentId, String lastName, String firstName) {
        Student student = studentsMap.get(studentId);
        if (student!=null){
            student.setFirstname(firstName);
            student.setLastname(lastName);
            studentsMap.put(studentId, student);
        }
        return student;
    }
    
    public void deleteStudent (int studentId){
        studentsMap.remove(studentId);
    }
    
    public Student retrieveStudent(int studentId) {
        return studentsMap.get(studentId);
    }
    
    public Clase createClass(int code, String title, String description) {
        Clase clase = new Clase(code, title, description);
        if(classMap.get(code)==null){
            classMap.put(code, clase);
            studentsByClass.put(code, new ArrayList<>());
        }
        return clase;
    }

    public Clase retrieveClass(int code) {
        return classMap.get(code);
    }
    
    public Clase editClass (int code, String title, String description) {
        // TODO validate input data
        Clase clase = classMap.get(code);
        if (clase!=null){
            clase.setTitle(title);
            clase.setDescription(description);
            classMap.put(code, clase);
        }
        return clase;
    }
    
    public void deleteClass (int code){
        classMap.remove(code);
    }
    
    public void addStudentToClass(int studentId,int code){
        Student student = studentsMap.get(studentId);
        Clase clase = classMap.get(code);
        if(student!=null && clase!=null){
            studentsByClass.get(code).add(student);
            classesByStudent.get(studentId).add(clase);
        }
    }
    
    public void showAllStudentsOfClass(int code){
        Clase clase = classMap.get(code);
        if (clase!=null){
            clase.show();
         System.out.println(Arrays.asList(studentsByClass.get(code)));
        }
    }
    
    public void showAllClassesOfStudent(int studentId){
        Student student = studentsMap.get(studentId);
        if (student!=null){
            student.show();
            System.out.println(Arrays.asList(classesByStudent.get(studentId)));
        }
    }
    
    public void showClass(int code){
        Clase clase = classMap.get(code);
        clase.show();
    }
    
    public void showStudent(int studentId){
        Student student = studentsMap.get(studentId);
        student.show();
    }
}
