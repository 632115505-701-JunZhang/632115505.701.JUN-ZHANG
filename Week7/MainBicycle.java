package Week7;

public class MainBicycle {
    public static void main(String[] args){
        Bicycle b =new Bicycle();
        b.setspeed("add",5);//Here can input add or reduce/and times
        b.speed();

        MountainBike c =new MountainBike();
        c.getMountainbikespeed(2, 5);//gear and speed
        c.result();
    }
}
