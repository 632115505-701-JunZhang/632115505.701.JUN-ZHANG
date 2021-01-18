package Week7;

public class Pet {
    private String name;
    private String species;
    private String color;
    private int age;
    private String data;

public void information(String name,String species,String color,int age,String data){
    this.name =name;
    this.species =species;
    this.color =color;
    this.age =age;
    this.data =data;
}
public void data(){
    System.out.println("Name:"+name+" "+"Special:"+species+" color:"+color+" Age:"+age);
}
public void run(){
    System.out.println("My dog "+name+" is run to the jungle");
}
public void box(){
    System.out.println(data+"Box Box!!");
}
public void Hair(){
    System.out.println("Short hair: true");
}
public void swim(){
    System.out.println("My fish "+name+" is swim in the sea");
}
public void water(){
    System.out.println("Salt water: true");
}
public void fast(){
    System.out.println("Swim speed is :"+data);
}
public void fly(){
    System.out.println("My bird "+name+" fly in the sky");
}
public void speak(){
    System.out.println("Can speak :true");
}
}