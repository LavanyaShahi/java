package cdc1;
interface I1{
	void add();
	void sub();
}

public class inter implements I1 {
	public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inter i1=new inter();
		i1.add();
		i1.sub();

	}

}
 