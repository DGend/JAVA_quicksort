public class Quicksort {
	static int sorting(int[] arr, int left, int right) {
		int pivot = arr[(left + right) / 2];

		while (left < right) {
			while (arr[left] < pivot && left < right) {
				left++;
			}
			while (arr[right] > pivot && left < right) {
				right--;
			}
			if (left < right) {
				arr[left] ^= arr[right];
				arr[right] ^= arr[left];
				arr[left] ^= arr[right];
			}
		}
		return left;
	}

	static void sort(int[] arr, int left, int right) {
		int pivot = sorting(arr, left, right);
		if (left < right) {
			sort(arr, left, pivot - 1);
			sort(arr, pivot + 1, right);
		}
	}
}