package Week5;
public class MainCircle {
    //StudentID:632115505
    //Name:JUN ZHANG
    public static void main(String[] args){
        Circle cir1 = new Circle();
        cir1.setr1(2);        
        System.out.println("Area of cir1 ="+cir1.getArea());
        System.out.println("Circumferrene of cir1 ="+cir1.getCir());


        Circle cir2 = new Circle();
        cir2.setr2(3);
        System.out.println("Area of cir2 ="+cir2.getArea2());
        System.out.println("Circumferrene of cir2 ="+cir2.getCir2());

        
        Circle cir3 = new Circle();
        cir3.setr3(1);
        System.out.println("Area of cir3 ="+cir3.getArea3());
        System.out.println("Circumferrene of cir3 ="+cir3.getCir3());

        Circle cir4 = new Circle();
        cir4.setr4(-1);
        System.out.println("Area of cir4 ="+cir4.getArea4());
        System.out.println("Circumferrene of cir4 ="+cir4.getCir4());

        cir2.De2(1, 2);
        cir3.De3(3, 5);
    }
}
