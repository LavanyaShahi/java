package Sample;

public class copy1 {
	int x;
	int y;
	int z;
	public copy1() {
		System.out.println("welcome to my profile");
	}
	public copy1(int x) {
		this.x=x;
		System.out.println("x marks"+x);
	} 
	public copy1(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("x marks:"+x+",y marks:" +y);
	}
	public copy1(int x,int y,int z) {
		this.x=x;
		this.y=y;
		this.z=z;
		System.out.println("x marks:"+x+",y marks:"+y+", marks:"+z);
	}
	

	public static void main(String[] args) {
		copy1 t1=new copy1();
		copy1 t2=new copy1(98); 
		copy1 t3=new copy1(98,63);
		copy1 t4=new copy1(98,63,75);
		

	}

}
