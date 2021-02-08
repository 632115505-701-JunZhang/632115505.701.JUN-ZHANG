package Week9;

public class Student {
    private String firstname ="hello";
    private String lastname ="world";
    //overiding toString()
    public String toString(){
        return "My first name "+firstname+" last name "+lastname;
    }

    public static void main(String[]args){
         Student p =new Student();
         System.out.println(p.toString());
    }
}