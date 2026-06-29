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

class Sophomore extends UndergraduateStudent{

    public Sophomore(String studentId, String name, int age, String faculty) {
        super(studentId, name, age, faculty);
    }
    public void level(){
        System.out.println("Second year");
        undergraduateStudentInfo();
    }
}

class Junior extends UndergraduateStudent{

    public Junior(String studentId, String name, int age, String faculty) {
        super(studentId, name, age, faculty);
    }
    public void level(){
        System.out.println("Third year");
        undergraduateStudentInfo();
    }
}

class Senior extends UndergraduateStudent{

    public Senior(String studentId, String name, int age, String faculty) {
        super(studentId, name, age, faculty);
    }
    public void level(){
        System.out.println("Fourth year");
        undergraduateStudentInfo();
    }
}

class GraduateStudent extends Student{
    String researchArea;

    GraduateStudent(String researchArea, String studentId, String name, int age) {
        super(studentId, name, age);
        this.researchArea = researchArea;
    }
    
    public void graduateStudentInfo(){
        System.out.println("Research Area : "+researchArea);
        getInfo();
    }
    
    public void level(){
        System.out.println("Graduate Level");
    }
}

class DoctoralStudent extends GraduateStudent{
    
    public DoctoralStudent(String researchArea, String studentId, String name, int age) {
        super(researchArea, studentId, name, age);
    }
    
    public void level(){
        System.out.println("Level : Doctaral Student");
        graduateStudentInfo();
    }
}

class MastersStudent extends GraduateStudent{
    
    public MastersStudent(String researchArea, String studentId, String name, int age) {
        super(researchArea, studentId, name, age);
    }
    
    public void level(){
        System.out.println("Level : Master Student");
        graduateStudentInfo();
    }
}

class Demo{
    public static void main(String args[]){
        System.out.println("----------------------------------");
        UndergraduateStudent u1 = new UndergraduateStudent("U001", "Kalum", 0, "IT");
        u1.undergraduateStudentInfo();
        System.out.println("----------------------------------");
        Freshman f1 = new Freshman("U002", "Jagath", 19, "Art");
        f1.level();
        System.out.println("----------------------------------");
        Sophomore s1 = new Sophomore("U003", "Kawinda", 23, "Agry");
        s1.level();
        System.out.println("----------------------------------");
        Junior j1 = new Junior("U005", "Sanduni", 21, "Agry");
        j1.level();
        System.out.println("----------------------------------");
        Senior s2 = new Senior("U005", "Sanduni", 21, "Agry");
        s2.level();
        System.out.println("----------------------------------");
        DoctoralStudent d1 = new DoctoralStudent("Cyber seacurity", "D001", "Pathum", 32);
        d1.level();
        System.out.println("----------------------------------");
        MastersStudent m1 = new MastersStudent("North Buddhism", "M001", "Rev.Amitha", 29);
        m1.level();
        
    }
    
    
}



