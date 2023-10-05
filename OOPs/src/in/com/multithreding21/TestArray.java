package in.com.multithreding21;

import java.util.Scanner;

public class TestArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int number [] = new int[size];
	
	
	for (int i = 0; i < number.length; i++) {
		number[i] = sc.nextInt();
	}
	
	int x = sc.nextInt();
	
	
	for (int i = 0; i < number.length; i++) {
		System.out.println(number[i]);
		if (number[i] == x) {
			System.out.println("index of value=" + i);
		}
	}
}
}
