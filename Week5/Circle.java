package Week5;
import java.lang.Math;
public class Circle {
    private double r =1;
    private double area;
    private double cir;
    private double a = 0;
  
    //Circle 1
    public void setr1(int r){
        this.r =r;
    }
    public double  getArea() {
        a= 3.1415926*r*r;
        this.area = a;
        return area; 
    }
    public double getCir() {
        a =2*3.1415926*r;
        this.cir = a;
        return cir;
    }

    //Circle 2
    public void setr2(int r){
        this.r =r;
    }
    public double  getArea2() {
        a= 3.1415926*r*r;
        this.area = a;
        return area; 
    }
    public double getCir2() {
        a =2*3.1415926*r;
        this.cir = a;
        return cir;
    }    

    //Circle 3
    public void setr3(int r){
        this.r =r;
    }
    public double  getArea3() {
        a= 3.1415926*r*r;
        this.area = a;
        return area; 
    }
    public double getCir3() {
        a =2*3.1415926*r;
        this.cir = a;
        return cir;
    }  
    
    //Circle 4
    public void setr4(int r){
        if(r<0){
            this.r =0;
        }
    }
    public double  getArea4() {
        a= 3.1415926*r*r;
        this.area = a;
        return area; 
    }
    public double getCir4() {
        a =2*3.1415926*r;
        this.cir = a;
        return cir;
    } 
    
    //Determine if they intersect
    // Circle 1 and Circle 2
    public void De2(int b ,int c){
     if(Math.sqrt(Math.pow(b, 2)+Math.pow(c, 2))<5){
        System.out.println("Is circle 1 intersec circle 2 :true");
     }
     else {
        System.out.println("Is circle 1 intersec circle 2 :false");
     }
    }

    //Circle 1 and Circle 3
    public void De3(int d ,int e){
        if(Math.sqrt(Math.pow(d, 2)+Math.pow(e, 2))<3){
            System.out.println("Is circle 1 intersec circle 3 :true");
         }
         else {
            System.out.println("Is circle 1 intersec circle 3 :false");
        }
    }
}