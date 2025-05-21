package cdc1;
class test{
void add() {
	System.out.println("hi");
}
}

public class override extends test{
	void add() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
	
		override o1=new override();
		o1.add();

	}

}
