package Week10;

public class Human{
    public void hit(Animal animal){
        System.out.println(animal.roar());
    }


    public static void main(String[] args){
        Animal dog= new Dog();//question
        Animal cat =new Cat();
        Animal fish =new Fish();
        Human human =new Human();
        System.out.println("The first calling hit(Animal)");
        human.hit(dog);//Question

        dog =new Cat();
        System.out.println("The second calling hit(Animal)");

        human.hit(cat);

        dog = new Fish();
        human.hit(fish);
    }
}