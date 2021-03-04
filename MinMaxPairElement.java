package Arrays;

import java.util.Scanner;

//Compare in Pairs
//if n is odd 3*(n-1)/2
//if n is even 3n/2 - 2

public class MinMaxPairElement {
	
	static class MinMax{
		int max;
		int min;
	}
	
	static MinMax getMinMax(int arr[], int n) {
		MinMax obj = new MinMax();
		int i;
		
		//if array has even elements then initialize first two elements as min max
		if(n%2==0) {
			if (arr[0] > arr[1]) {
				obj.max = arr[0];
				obj.min = arr[1];
			}
		else {
			obj.max = arr[1];
			obj.min = arr[0];
		}
			i = 2;
		}
		else {
			//if array has odd elements
			obj.max = arr[0];
			obj.min = arr[0];
			i = 1;
		}
		
		while (i < n-1) { //pick pairs
			if(arr[i] > arr[i+1]) {
				if (arr[i] > obj.max) {
					obj.max = arr[i];
				}
				if (arr[i+1] < obj.min) {
					obj.min = arr[i+1];
				}
			}
			else {
				if (arr[i+1] > obj.max) {
					obj.max = arr[i+1];
				}
				if (arr[i] < obj.min) {
					obj.min = arr[i];
				}
			}
			i = i+2;
		}
		return obj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		MinMax obj = getMinMax(array, n);
		System.out.printf("Maximum Element %d", obj.max);
		System.out.printf("\nMinimum Element %d", obj.min);
		sc.close();
	}

}
