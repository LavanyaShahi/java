package cdc1;

public class poly {
	void add()
	{
		System.out.println("hi");
	}
	void add(int a) {
		System.out.println(a);
	}
	void add(int a,int b) {
		System.out.println();
	}
	void add(int a,int b, double d1) {
		System.out.println(a+b-d1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		poly p1=new poly();
		 p1.add();
		 p1.add(25);
		 p1.add(2,9);
		 p1.add(2,6,9);

	}

}
