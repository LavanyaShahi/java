package Day8;
import java.util.*;
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer>q1=new PriorityQueue<Integer>();
		q1.add(12);
		q1.offer(45);
		q1.offer(70);
		q1.offer(50);
		System.out.println(q1);
		q1.poll();
		System.out.println(q1);

	}

}
