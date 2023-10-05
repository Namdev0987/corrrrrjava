package in.com.deamon22;

import java.util.Arrays;

public class Parallelshort {
public static void main(String[] args) {
	int[] arr =  {100,1,2,50,30,25,40};
	Arrays.parallelSort(arr);
	for (int i : arr) {
		System.out.println(i);
	}
	
}
}
