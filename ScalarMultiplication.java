import java.util.*;
  import java.io.*;
  

  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[][] = new int[m][n];
		int c[][] = new int[m][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
			arr[i][j] = sc.nextInt();
		}
			}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
			c[i][j] = arr[i][j] * k;
		}}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
		System.out.print(" "+ c[i][j]);
		}
		System.out.println();
		}
    }
  }
Notes