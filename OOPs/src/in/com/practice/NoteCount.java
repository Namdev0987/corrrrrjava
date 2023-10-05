package in.com.practice;

public class NoteCount {
	public static void main(String[] args) {
	
		int num = 4567;
		int [] note = {500,200,100,10,20,5,2,1};
		int count = 0;
		
		for(int i = 0; i < note.length; i++) {
			count = num/note[i];
			
			if(count > 0) {
				System.out.println(note[i] + "=" + count);
			}
			num = num % note[i];
		}
		
	}
}