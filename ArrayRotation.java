import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			if(k>n)
			  k = k%n;
			int arr[] = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			rightRotate(arr, k, n);
			printArray(arr,n);
		}
	}
	
	static void reverseArray(int arr[],int start,int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	static void rightRotate(int arr[], int k, int n) {
		reverseArray(arr, 0, n-1);
		reverseArray(arr, 0, k-1);
		reverseArray(arr, k, n-1);
	}
	
	static void printArray(int arr[], int n) {
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
    }