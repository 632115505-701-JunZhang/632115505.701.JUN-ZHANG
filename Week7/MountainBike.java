package Week7;

public class MountainBike extends Bicycle {
    private int gear;
    private int speed =10;
    private int setspeed;

public int getMountainbikespeed(int a,int b){
    this.gear =a;
    this.setspeed =b;
    this.speed =speed+(gear*setspeed);
    return speed;
}
public void result(){
System.out.println("Now Mountatinbike speed is "+speed);
}
}