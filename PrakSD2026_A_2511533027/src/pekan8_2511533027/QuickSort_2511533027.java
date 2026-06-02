package pekan8_2511533027;

public class QuickSort_2511533027 {
	static void swap_3027(int[] arr_3027, int i_3027, int j_3027) {
		int temp_3027 = arr_3027[i_3027];
		arr_3027[i_3027] = arr_3027 [j_3027];
		arr_3027[j_3027] = temp_3027;
	}
	
	// Metode tambahan untuk mengatur pivot menggunakan Median-of-Three
	static void medianOfThree_3027(int[] arr_3027, int low_3027, int high_3027) {
		int mid_3027 = low_3027 + (high_3027 - low_3027) / 2;
		
		// Urutkan elemen low, mid, dan high
		if (arr_3027[low_3027] > arr_3027[mid_3027]) {
			swap_3027(arr_3027, low_3027, mid_3027);
		}
		if (arr_3027[low_3027] > arr_3027[high_3027]) {
			swap_3027(arr_3027, low_3027, high_3027);
		}
		if (arr_3027[mid_3027] > arr_3027[high_3027]) {
			swap_3027(arr_3027, mid_3027, high_3027);
		}
		swap_3027(arr_3027, mid_3027, high_3027);
	}
	
	static int partition_3027(int[] arr_3027, int low_3027, int high_3027) {
		// Panggil fungsi medianOfThree sebelum menentukan pivot
		medianOfThree_3027(arr_3027, low_3027, high_3027);
		
		int pivot_3027 = arr_3027[high_3027]; // Sekarang arr[high] sudah berisi nilai median
		int i_3027 = (low_3027 - 1);
		
		for (int j_3027 = low_3027; j_3027 <= high_3027 - 1; j_3027++) {
			// Jika elemen saat ini lebih kecil dari atau sama dengan pivot
			if (arr_3027[j_3027] < pivot_3027) {
				// Increment indeks elemen yang lebih kecil
				i_3027++;
				swap_3027(arr_3027, i_3027, j_3027);
			}
		}
		swap_3027(arr_3027, i_3027 + 1, high_3027);
		return (i_3027 + 1);
	}
	
	static void quickSort_3027(int[] arr_3027, int low_3027, int high_3027) {
		if (low_3027 < high_3027) {
			int pi_3027 = partition_3027(arr_3027, low_3027, high_3027);
			quickSort_3027(arr_3027, low_3027, pi_3027 - 1);
			quickSort_3027(arr_3027, pi_3027 + 1, high_3027);
		}
	}
	
	public static void printArr_3027(int[] arr_3027) {
		for (int i_3027 = 0; i_3027 < arr_3027.length; i_3027++) {
			System.out.print(arr_3027[i_3027] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr_3027 = { 10, 7, 8, 9, 1, 5 };
		int N_3027 = arr_3027.length;
		System.out.print("Data Sebelum di Urutkan: ");
		printArr_3027(arr_3027);
		
		quickSort_3027(arr_3027, 0, N_3027 - 1);
		
		System.out.print("Data Terurut quicksort: ");
		printArr_3027(arr_3027);
	}

}
