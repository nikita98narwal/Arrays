import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t --> 0) {
			long sum = 0;
			int  n = sc.nextInt();
			long arr[] = new long[n-1];
			long total = ((long)n*(n+1))/2;
			for(int i = 0; i < n-1; i++) {
				arr[i] = sc.nextLong();
				sum += arr[i];
			}
			System.out.println(total-sum);
		}
    }
  }