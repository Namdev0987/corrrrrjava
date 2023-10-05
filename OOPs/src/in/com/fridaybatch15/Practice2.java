package in.com.fridaybatch15;

public class Practice2 {
public static void main(String[] args) {
	int num = 1300;
	int [] note = {2000,500,200,100,50,20,10,5,1};
	int count = 0;
	for (int i = 0; i < note.length; i++) {
		count = num / note[i];
		
		if (count > 0) {
			System.out.println(note[i] + "=" + count);
		}
		
		num = num % note[i];
	}
}
}
