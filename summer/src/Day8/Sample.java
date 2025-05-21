package Day8;
import java.util.*;


public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> l1=new Vector<Integer>();
		l1.add(12);
		l1.add(45);
		l1.add(78); 
		System.out.println(11);
		Enumeration il=l1.elements();
		//Iterator i1=l1.iterator(); 
		while(il.hasMoreElements()) {
			//System.out.println(i1.next());
		
		//while(i1.hasPrevious()) 
			System.out.println(il.nextElement());
		}

	}}



