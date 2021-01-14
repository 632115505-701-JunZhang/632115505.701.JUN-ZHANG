package Week5;
public class NerfGun {
	private int a;
	private int number;
	public NerfGun() {
		this.number++;
	}
	public NerfGun(int b) {
		this.number++;
		this.a = b;
	}
    public void fire() {
		if(a<=0) {
			System.out.println("There is no ammuition");
		}
		else {
			System.out.println("BANG !!!");
			this.a--;
		}
	}
    public void reload(int i) {
		if(this.a+i>15){
			System.out.println("Error!! the ammunition is overload");
		}
		else{
			this.a += i;
		}
		}
    public void displayNumOfAmmunition() {
		System.out.println(a+" bullet left");
	}
    public void displayGunID() {
		System.out.println("the ID of this gun is " + number);
	}
}