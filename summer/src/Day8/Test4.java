package Day8;
import java.util.*;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>l1=new LinkedList<Integer>();
		l1.add(35);
		l1.add(3);
		l1.add(37);
		System.out.println(l1);
		l1.addFirst(3);
		System.out.println(l1);
		l1.addLast(4);
		System.out.println(l1);
		l1.removeFirst();
		l1.removeLast();
		l1.removeFirstOccurrence(45);
		System.out.println(l1);

	}

}
