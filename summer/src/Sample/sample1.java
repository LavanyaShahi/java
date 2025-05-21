package Sample;

public class sample1 {
	int a=10,b=20;
	static int c=20,d=30;
	void and()
	{
		System.out.println((a>b)&&(a<=b));
		
	}
	void or() {
		System.out.println((c>d)||(c>=d));
	}
	void not() {
		int e=60,f=50;
		System.out.println(!(e<f));
		
	}
	public static void main (String[] args) {
		sample1 s=new sample1();
		s.and();
		s.or();
		s.not();
	}
}


