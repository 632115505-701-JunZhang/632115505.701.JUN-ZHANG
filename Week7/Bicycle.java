package Week7;

public class Bicycle {
    private int speed =10;
    private int b =5;
    String n= "add";

public int setspeed(String m,int c){
    if(m==n) {
    for(int e =1;e<=c;e++)
    this.speed = speed+b;
    return speed;
    }
    else{
    for(int e =1;e<=c;e++)
    this.speed= speed-b;
    return speed;
     }
}

public void speed(){
    if(speed>99){
        System.out.print("The max of speed is 99km/h");
    }
    else{
        System.out.println("Now speed is "+speed);
    }
}
}