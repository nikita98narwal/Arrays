import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int index = 0;
			int arr[] = new int[n];
			boolean flag = true;
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			for(int i = n-1; i >= 0; i--) {
				if(arr[i] == 1) {
					index = i;
					System.out.print(i);
					flag = false;
					break;
				}
			}
				if(flag){
					System.out.print("-1");
				}
				System.out.println();
			}
    }
  }