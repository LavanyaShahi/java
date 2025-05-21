package cdc1;



public class th extends Object {
	int a=89;
	void add() {
		int a=89;
		System.out.println(a);
	}
	void sub() {
		System.out.println(this.a);
		this.add();
		
	}

	public static void main(String[] args) {
		th t1=new th();
		// TODO Auto-generated method stub

	}

}
