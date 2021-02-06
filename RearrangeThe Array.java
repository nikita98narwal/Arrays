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
	        	int temp[] = new int[n];
	        	int i = 0;
	        	int j = n-1;
	        	for(int k = 0; k < n; k++) {
	        		if(k % 2 == 0) {
	        			temp[k] = arr[j--];
	        		}
	        		else {
	        			temp[k] = arr[i++];
	        		}
	        	}
	        	for(int k = 0; k < n; k++) {
	        		System.out.print(temp[k] +" ");
	        	}
	        }

    }
  }