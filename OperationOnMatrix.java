import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int A[][] = new int[m][n];
		int B[][] = new int[m][n];
		int C[][] = new int[m][n];
		int D[][] = new int[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				D[i][j] = 0;
				for(int k = 0; k < n; k++) {
				D[i][j] += A[i][k] * B[k][j];
			}
			}
		}
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(" "+ C[i][j]);
			}
			System.out.println();
		}
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(" "+ D[i][j]);
			}
			System.out.println();
		}

    }
  }
