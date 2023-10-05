package in.com.practicecollectionforbatch;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
public static void main(String[] args) {
	Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
	pq.add(100);
	pq.add(10);
	pq.add(20);
	pq.add(30);
	pq.add(40);
	pq.add(50);
	pq.add(60);
	pq.add(70);
	System.out.println(pq);
	
	pq.poll();
	System.out.println(pq);
	
	System.out.println(pq.peek());
	
	
}
}
