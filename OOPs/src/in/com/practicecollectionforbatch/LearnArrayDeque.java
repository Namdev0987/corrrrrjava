package in.com.practicecollectionforbatch;

import java.util.ArrayDeque;

public class LearnArrayDeque {
public static void main(String[] args) {
	ArrayDeque<Integer> adq = new ArrayDeque();
	
	adq.offer(23);
	adq.offer(12);
	adq.offer(45);
	adq.offer(26);
	System.out.println(adq);
	adq.offerFirst(45);
	System.out.println(adq);
	adq.offerLast(91);
	System.out.println(adq);
	
	System.out.println(adq.peek());
	System.out.println();
	System.out.println(adq.peekFirst());
	
	System.out.println(adq.poll());
}
}
