package Arrays;

import java.util.Scanner;

public class ReverseArray {
	static void reverseArray(int[] arr, int start, int end) {
		int temp;
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	static void printArray(int[] arr, int n) {
		for(int i = 0; i <n; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int start = 0;
		int end = n-1;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		reverseArray(arr, start, end);
		printArray(arr, n);

	}

}
