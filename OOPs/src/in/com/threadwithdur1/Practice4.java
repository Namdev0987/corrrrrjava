package in.com.threadwithdur1;

import java.util.Scanner;

public class Practice4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int numbers [] = new int [size];
	
	for (int i = 0; i < numbers.length; i++) {
		numbers[i] = sc.nextInt();
	}
	
	int x = sc.nextInt();
	
	for (int i = 0; i < numbers.length; i++) {
		//System.out.println(numbers[i]);
		
		if (numbers[i] == x) {
			System.out.println("index of tha value=" + i);
		}
	}
}
}
