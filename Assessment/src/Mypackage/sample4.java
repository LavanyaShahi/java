package Mypackage;
interface I1{
	void add();
}
interface I2{
	void sub();
}
interface I3{
	void mul();
}
public class sample4 implements I1,I2,I3{
	public void add() {
		System.out.println("get");
	}
	public void sub() {
		System.out.println("set");
	}
	public void mul() {
		System.out.println("go");
	}
	public void div() {
		System.out.println("finish");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample4 t=new sample4();
		t.add();
		t.sub();
		t.mul();
		t.div();

	}

}
