package Week11;

public class StudentData{
    public static void main(String[] args){
        //Student object include name,age,gpa
        Student stud01 = new Student("Mark",18,4.00);
        Student stud02 = new Student("Jane",18,2.00);
        Student stud03 = new Student("Peter",19,4.00);
        Student stud04 = new Student("Mark",22,1.75);
        
        System.out.println("----Name----");
        System.out.println(stud01.Name().equals(stud02.Name()));
        System.out.println(stud01.Name().equals(stud03.Name()));
        System.out.println(stud02.Name().equals(stud04.Name()));
        System.out.println(stud01.Name().equals(stud04.Name()));
        
        System.out.println("----age----");
        System.out.println(stud01.Age()==(stud02.Age()));
        System.out.println(stud03.Age()==(stud04.Age()));
        System.out.println(stud01.Age()==(stud03.Age()));

        System.out.println("----gpa----");
        System.out.println(stud01.Gpa()==(stud03.Gpa()));
        System.out.println(stud02.Gpa()==(stud04.Gpa()));
        System.out.println(stud02.Gpa()==(stud03.Gpa()));
    }
}