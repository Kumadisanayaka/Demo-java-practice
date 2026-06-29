package demo;

public class Student {
    private String studentId;
    private String name;
    private int age;

    public Student(String studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }
    
    public void getInfo(){
        System.out.println("Student ID : "+studentId);
        System.out.println("Name : "+name);
        System.out.println("age : "+age);
    }
    
}

class UndergraduateStudent extends Student{
    private String faculty;
    
    UndergraduateStudent(String studentId, String name, int age, String faculty){
        super(studentId,name,age);
        this.faculty = faculty;
    }
    
    public void undergraduateStudentInfo(){
        System.out.println("faculty : "+faculty);
        getInfo();
    }
    
    public void level(){
        System.out.println("Undergraduate Level");
    }
}

class Freshman extends UndergraduateStudent{

    public Freshman(String studentId, String name, int age, String faculty) {
        super(studentId, name, age, faculty);
    }
    public void level(){
        System.out.println("First year");
        undergraduateStudentInfo();
    }
}

class Demo{
    public static void main(String args[]){
        UndergraduateStudent u1 = new UndergraduateStudent("U001", "Kalum", 0, "IT");
        u1.undergraduateStudentInfo();
        Freshman f1 = new Freshman("U002", "Jagath", 19, "Art");
        f1.level();
    }
}



