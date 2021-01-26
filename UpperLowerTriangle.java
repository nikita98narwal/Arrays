import java.util.*;
  import java.io.*;
  
  public class Main {
      //write your code here
      static void lower(int matrix[][],  
				int row, int col) 
		{ 
			int i, j; 
			for (i = 0; i < row; i++) 
			{ 
				for (j = 0; j < col; j++) 
				{ 
					if (i < j) 
					{ 
						System.out.print("0" + " "); 
					} 
					else
						System.out.print(matrix[i][j] + " "); 
				} 
				System.out.println(); 
			} 
		} 


static void upper(int matrix[][],  
             int row, int col) 
{ 
int i, j; 
for (i = 0; i < row; i++) 
{ 
   for (j = 0; j < col; j++) 
   { 
       if (i > j) 
       { 
           System.out.print("0" + " "); 
       } 
       else
       System.out.print(matrix[i][j] + " "); 
   } 
   System.out.println(); 
} 
} 
public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int arr1[][] = new int[row][col];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				arr1[i][j] = sc.nextInt(); 
			}
		}
	        lower(arr1, row, col);  
	        upper(arr1, row, col); 

    }
  }