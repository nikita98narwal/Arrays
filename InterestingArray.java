//You are given an array of N integers in ascending order and a number N. You have to print indexes of 
//two numbers in the array such that the sum equals to number K. In case no such pair exists print "no answer"(without quotes).

import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int l = 0;
			int r = n-1;
			int k = sc.nextInt();
			boolean flag = true;
			if(flag){
			while(l < r) {
				if(arr[l] + arr[r] == k) {
				System.out.print(l +" "+ r);
				flag = false;
				break;
				}
				else if(arr[l] + arr[r] < k) {
					l++;
				}
				else {
					r--;
				}
			}
			}
			if(flag == true){
			  System.out.print("no answer");
			}
			System.out.println();
	}
}}