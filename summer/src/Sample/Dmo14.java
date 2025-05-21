package Sample;

abstract class Test5{
	abstract void add();
	abstract void sum();
}
public class Dmo14 extends Test5 {
	public void add() {
		System.out.println("hi");
		
		
	}
public void sum() {
	System.out.println("hello");
}

	public static void main(String[] args) {
		Dmo14 d1=new Dmo14();
		d1.add();
		d1.sum();
		
	}
	

}
