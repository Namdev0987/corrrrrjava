package in.com.deepakclon;

public class NoteCount {
	public static void main(String[] args) {
		int number = 2390;
		int [] note = {2000,1000,500,200,100,50,20,10,5};
		int count = 0;
		
		for (int i = 0; i < note.length; i++) {
			count = number / note[i];
			
			if(count > 0) {
				System.out.println(note[i] + "=" + count);
			}
			number = number % note[i];
		}
	}
}
