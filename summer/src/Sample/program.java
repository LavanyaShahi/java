package Sample;

public class program {
	int a=10,b=20;
	static int c=30,d=40;
	void mod() {
		System.out.println(a%b);
		
	}
void div()
{
	int e=60,f=80;
	System.out.println(e/f);
	
}
	public static void main(String[] args) {
		program t1=new program();
		System.out.println(program.c*program.d);
		t1.mod();
		t1.div();

	}

}
