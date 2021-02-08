package Week9;

public class Cube extends Rectangle{
    int length;
    
    public Cube(int width,int heigh,int length){
        super(width,heigh);
        this.length =length;
    }
        
        public String toString(){
          return String.format("This is a cube with %d sides", length);
        }
}
