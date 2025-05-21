package Sample;

public class copy {
	int x;
	int y;
	public copy(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public copy(copy c1) {
		this.x=c1.x;
		this.y=c1.y;
		System.out.println(x-y);
		
	}

	public static void main(String[] args) {
		copy c1=new copy(45,23);
		copy c2=new copy(c1);
	}

}
