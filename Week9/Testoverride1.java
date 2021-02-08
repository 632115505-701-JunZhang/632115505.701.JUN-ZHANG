package Week9;

public class Testoverride1 {
    public static void main(String[] args){
        Person person1;
        person1 = new Person("Mark",2001);

        person1.introduce();

        Sheriff person2 = new Sheriff("Mateo", 1988, "California");
        person2.introduce();

        Ball person3 =new Ball("Ball",1977,"CMU");
        person3.introduce();

        Tu person4 =new Tu("Tu",1954,"Thailand");
        person4.introduce();

        Messi person5 =new Messi("Messi", 1987, "Barcelona football club");
        person5.introduce();

        Jackson person6 =new Jackson("Jackson",2060,"Space");
        person6.introduce();
    

    }
}