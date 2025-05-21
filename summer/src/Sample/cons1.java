package Sample;

public class cons1 {
	int a=20;
	int b=50;
	public cons1(int x,int y) {
		a=x;
		b=y;
		System.out.println(x+y);	
	}
	public void add() {
		System.out.println(this.a-this.b);
		

	}

	public static void main(String[] args) {
		cons1 c1=new cons1(20,50);
	}
		

}
