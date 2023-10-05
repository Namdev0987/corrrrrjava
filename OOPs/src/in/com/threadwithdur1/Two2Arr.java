package in.com.threadwithdur1;

import java.util.Scanner;

public class Two2Arr {
	public static void main(String[] args) {
		//int num [] = new int [10];
		// type [][] arrayname = new type[rows][colums]
//		int [][] table = new int [5] [5];
//		for (int i = 0; i < table.length; i++) {
//			for (int j = 0; j < table.length; j++) {
//				table [i][j] = (i+1) * (j+1);
//				System.out.print(table[i][j]+"\t");
//			}
//			System.out.println( );
//		}
		
		int [][] table = new int [10][10];
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table.length; j++) {
				table[i][j] = (i + 1) * ( j+1);
				System.out.print(table[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
	}
}
