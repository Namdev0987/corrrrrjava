package in.com.practiceoopbatch;

public class Pratice {

	public void sum(int a , int b) {
		int c = a + b;
		System.out.println("sum ="+ c);
	}
	public void mult(int a , int b) {
		int c = a * b;
		System.out.println("mult ="+ c);
	}
	public void noteCount(int number) {
		int [] note = {500,200,100,50,20,10,5,2,1};
		int count = 0;
		for (int i = 0; i < note.length; i++) {
			count = number / note[i];
			if(count > 0) {
				System.out.println(note[i] + "="+ count);
			}
			number = number % note[i];
		}
		
	}
	public void largest(int arr[]) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if(max > arr[i]) {
				arr[i] = max;
			}
		}
		System.out.println("max="+max);
	}
	
	public static void main(String[] args) {
		Pratice p = new Pratice();
		int [] arr = {100,200,300};
		p.noteCount(8908);
		p.sum(10, 56);
		p.mult(10, 90);
		p.largest(arr); 
		
		
		
	}
	
}
