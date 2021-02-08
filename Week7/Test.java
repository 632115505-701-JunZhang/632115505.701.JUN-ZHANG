package Week7;

public class Test {

 public static int myMethod(int x,int n){
  if(n==0){
      return 1;
  }
  if(n==1){
    return x;
  }
    return x*myMethod(x, n-1);
  }
}