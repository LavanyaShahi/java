package Sample;

public class Demo12 {

	public static void main(String[] args) {
		String s1="khushi";
		String s2="queen";
		String s3=new String("khushi");
		String s4=new String("prince");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		System.out.println(s2.equals(s4));
		System.out.println(s1.compareTo(s4));
	}

}
