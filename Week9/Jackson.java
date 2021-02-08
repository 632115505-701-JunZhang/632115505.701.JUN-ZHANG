package Week9;

public class Jackson extends Person {
    String workState;

    public Jackson(String name,int bornYear,String workState){
        super(name, bornYear);
        this.workState =workState;
    }

    //overiding method
    public void introduce(){
        super.introduce();
        System.out.println("I'm a superhero and work in "+workState+".");
    }
}
