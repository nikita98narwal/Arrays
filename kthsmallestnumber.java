package Arrays;

import java.util.Scanner;

public class kthsmallestnumber {
	public static int partition(int[] arr, int l,  int r){
		 int pivot = arr[r], pos = l;
		 for (int j = l; j <= r - 1; j++) {
			 if (arr[j] <= pivot) {
				 int temp = arr[pos];
				 arr[pos] = arr[j];
				 arr[j] = temp;
				 pos++;
				 }
			 }
		 int temp = arr[pos];
		 arr[pos] = arr[r];
		 arr[r] = temp;
		 return pos;
}
	
	public static int kthSmallest(int[] arr, int l, int r, int k){
		if (k > 0 && k <= r - l + 1) {
			int position = partition(arr, l, r);
			if (position - l == k - 1)
				return arr[position];
			if (position - l > k - 1)
				return kthSmallest(arr, l, position - 1, k);
			return kthSmallest(arr, position + 1, r, k - position + l - 1);
			}
		return Integer.MAX_VALUE;
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
		System.out.print(kthSmallest(arr, 0, n-1, k));
		scanner.close();
	}

}
