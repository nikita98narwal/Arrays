package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Kthlargest {
	public static int kthlargest(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[k-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.print("Kth largest element :" + kthlargest(arr, k));
		scanner.close();
	}

}
