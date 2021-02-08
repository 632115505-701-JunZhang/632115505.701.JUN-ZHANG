package Week9;

public class Rectangle extends Shape {
    int width;
    int heigh;
    
    public Rectangle(int width,int heigh) {
        this.width =width;
        this.heigh =heigh;
    }
    public String toString(){
        return String.format("The width of this rectangle is %d and the height is %d", width,heigh);
    }
}