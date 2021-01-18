package Week7;

public class Fish extends Pet {
    public static void main(String[] args){
        Pet Fish = new Pet();
        System.out.println("My fish");
        Fish.information("Bad", "colwnfish", "orange and white", 3,"3m/s");
        Fish.data();
        Fish.swim();
        Fish.fast();
        Fish.water();
    }
}