package Week11;

public class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name,int age,double gpa){
     this.name =name;
     this.age =age;
     this.gpa =gpa;
    } 
    public String Name(){
        return name;
    }
    public int Age(){
        return age;
    }
    public double Gpa(){
        return gpa;
    }
}