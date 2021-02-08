package Week9;

public class Ball extends Person {
    String workState;

    public Ball(String name,int bornYear,String workState){
        super(name, bornYear);
        this.workState =workState;
    }

    //overiding method
    public void introduce(){
        super.introduce();
        System.out.println("I'm a teacher and teach in"+workState+".");
    }
}
