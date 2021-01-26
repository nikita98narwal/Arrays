import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      		Scanner sc = new Scanner(System.in);

      int t = sc.nextInt();
		while(t --> 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int min = arr[0];
			for(int i = 0; i < n; i++) {
				if(min > arr[i])
					min = arr[i];
			}
			for(int i = 0; i < n; i++) {
				if(min == arr[i])
					System.out.print(i);
			}
			System.out.println();
		}
    }
  }