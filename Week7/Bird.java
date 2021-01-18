package Week7;

public class Bird extends Pet {
    public static void main(String[] args){
    Pet Bird = new Pet();
    System.out.println("My bird");
    System.out.println("Bitrh in Japan");
    Bird.information("Jack", "parrot","Green",4,"fly");
    Bird.data();
    Bird.fly();
    Bird.speak();
    }
}