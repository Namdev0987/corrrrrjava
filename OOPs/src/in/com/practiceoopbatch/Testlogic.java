package in.com.practiceoopbatch;

public class Testlogic {

	public void sum(int a, int b) {
		int c = a + b;
		System.out.println("sum "+ c);
		
	}
	public void mult(int a, int b) {
		int c = a * b;
		System.out.println("mult" + c);
	}
	
	public void noteCount(int number) {
		int [] note = {500,200,100,50,20,10,5,2,1};
		int count = 0;
		for(int i =0; i < note.length; i++) {
			count = number / note[i];
			if(count > 0) {
				System.out.println(note[i] + " = " + count);
			}
			number = number % note[i];
		}
		
}
	public void largest(int arr[]) {
		int max = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]> max) {
				max = arr[i];
			}
		}
		System.out.println("max="+ max);
	}
	
	public static void main(String[] args) {
		Testlogic t = new Testlogic();
		int [] arr = {900,300,500};
		t.largest(arr);
		t.sum(10, 200);
		t.noteCount(1200);
		t.mult(10, 10 );
	}
}
