package Arrays;

import java.util.Scanner;

public class DutchNationalFlagAlgo {
	
	static void sortArray(int[] arr, int n) {
		int low = 0, mid = 0, temp = 0;
		int high = n - 1;
		while(mid <= high) {
			switch (arr[mid]) {
			case 0: {
				temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
				break;
			}
			case 1 :
				mid++;
				break;
			case 2 :{
				temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + arr[mid]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		sortArray(arr, n);
		for(int i = 0; i < n; i++)
			System.out.print(arr[i]);
		sc.close();
	}

}
