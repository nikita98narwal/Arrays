
//A simple problem statement with no stories: Given an array of positive integer,
// find out all the elements that are greater than or equal to all the elements to it's right side.

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int max = arr[n-1];
			System.out.print(max+" ");
			for(int i = n-2; i >= 0; i--) {
				if(max <= arr[i]) {
					max = arr[i];
					System.out.print(max+" ");
				}
			}
			System.out.println();
		}
    }
  }