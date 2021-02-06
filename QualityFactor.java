import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long arr[] = new long[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextLong();
		}
		long count = 0,  d = 0;
		long p = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i] != p) {
				d = arr[i]-p;
				count = count + Math.abs(d);
				p = arr[i];
			}
			else {
				continue;
			}
		}
		System.out.print(count);
	}
}