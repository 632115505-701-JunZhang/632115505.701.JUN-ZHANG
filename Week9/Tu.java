package Week9;

public class Tu extends Person {
    String workState;

    public Tu(String name,int bornYear,String workState){
        super(name, bornYear);
        this.workState =workState;
    }

    //overiding method
    public void introduce(){
        super.introduce();
        System.out.println("I'm a primeminister and work in"+workState+".");
    }
}
