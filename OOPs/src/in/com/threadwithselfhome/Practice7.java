package in.com.threadwithselfhome;

import java.util.Scanner;

public class Practice7 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int numbers [] = new int[size];
	
	for (int i = 0; i < numbers.length; i++) {
		numbers[i] = sc.nextInt(); 
	}
	
	int x = sc.nextInt();
	
	for (int i = 0; i < numbers.length; i++) {
		//System.out.println(numbers[i]);
		if (numbers[i] == x) {
			System.out.println("index of value =" + i);
		}
	}
	
	
}
}
