package in.com.endstreamaoi20;

public class Pratice3 {
public static void main(String[] args) {
	int num [] = new int[5];
	
	num[0] = 100;
	num[1] = 101;
	num[2] = 102;
	num[3] = 104;
	num[4] = 105;
	
	for (int i = 0; i < num.length; i++) {
		//System.out.println(num[i]);
		if (num[i] % 2 == 1) {
			System.out.println(num[i]);
		}
	}
}
}
