package Week9;

public class Messi extends Person{
    String workState;

    public Messi(String name,int bornYear,String workState){
        super(name, bornYear);
        this.workState =workState;
    }

    //overiding method
    public void introduce(){
        super.introduce();
        System.out.println("I'm a foodball player and work in"+workState+".");
    }
}
