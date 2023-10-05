package in.com.practiceoopbatch;

public class Practice2 {
	public void sum(int a, int b, int e) {
		int c = a + b + e;
		System.out.println("Sum ="+ c);
	}
	public void mult(int a , int b) {
		int c = a * b;
		System.out.println("Mult=" + c);
	}
	public void noteCount(int number) {
		int [] note = {500,200,100,50,20,10,5,2,1};
		int count = 0;
		for (int i = 0; i < note.length; i++) {
			count = number / note[i];
			if(count > 0) {
				System.out.println(note[i] + "=" +count);
			}
			number = number % note[i];
		}
		
	
	}
	public void largest(int [] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if( arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("max=" + max);
	}
	
	
	public static void main(String[] args) {
		int [] arr = {100,200,300};
		Practice2 p = new Practice2 ();
		p.noteCount(78978);
		p.mult(10, 4);
		p.largest(arr);
		
	}
	
	
}
