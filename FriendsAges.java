import java.util.*;
  import java.io.*;
  
  public class Main {
    	static void compute(int[] arr) {
		int count[] = new int[121];
		int k = 0, ans = 0;
		for(int i = 0; i < arr.length; i++) {
			k = arr[i];
			count[k]++;
		}
		for(int ageA = 0; ageA <= 120; ageA++) {
			int countA = count[ageA];
			for(int ageB = 0; ageB <= 120; ageB++) {
				int countB = count[ageB];
				if (ageA * 0.5 + 7 >= ageB) continue;
                if (ageA < ageB) continue;
                if (ageA < 100 && 100 < ageB) continue;
                ans += countA * countB;
                if (ageA == ageB) ans -= countA;
			}
		}
		System.out.print(ans);
	}


    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		compute(arr);
    }
  }