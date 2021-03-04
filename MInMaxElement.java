package Arrays;

import java.util.Scanner;

public class MInMaxElement {
	
	static class MinMax{
		int min;
		int max;
	}
	
	static MinMax getMinMax(int arr[], int n) {
		MinMax obj = new MinMax();
		int i;
		//if there is only one element
		if(n==1) {
			obj.max = arr[0];
			obj.min = arr[0];
		}
		
		//if there are more than two elements
		if(arr[0] > arr[1]) {
			obj.max = arr[0];
			obj.min = arr[1];
		}
		else {
			obj.max = arr[1];
			obj.min = arr[0];  
		}
		
		for(i = 2; i < n; i++) {
			if(arr[i] > obj.max) {
				obj.max = arr[i];
			}
			else if(arr[i] < obj.min) {
				obj.min = arr[i];
			}
		}
		
		return obj;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		MinMax obj = getMinMax(array, n);
		System.out.printf("Maximum element :%d",obj.max);
		System.out.printf("\nMinimum Element :%d",obj.min);
		sc.close();
		
	}

}
