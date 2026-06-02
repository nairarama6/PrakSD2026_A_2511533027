package pekan8_2511533027;

public class ShellSort_2511533027 {
	public static void shellSort_2511533027(int[] A_3027) {
		int n_3027 = A_3027.length;
		int gap_3027 = n_3027 / 2;
		while (gap_3027 > 0) {
			for (int i_3027 = gap_3027; i_3027 < n_3027; i_3027++) {
				int temp_3027 = A_3027[i_3027];
				int j_3027 = i_3027;
				while (j_3027 >= gap_3027 && A_3027[j_3027 - gap_3027] > temp_3027) {
					A_3027[j_3027] = A_3027[j_3027 - gap_3027];
					j_3027 = j_3027 - gap_3027;
				}
				A_3027[j_3027] = temp_3027;
			}
			gap_3027 = gap_3027 / 2;
		}
	}
	
	public static void main(String[] args) {
		int[] data_3027 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		
		System.out.print("Sebelum: ");
		printArray_3027(data_3027);
		
		shellSort_2511533027(data_3027);
		
		System.out.print("Sesudah (Shell Sort): ");
		printArray_3027(data_3027);
	}
	
	public static void printArray_3027(int[] arr_3027) {
		for (int i_3027 : arr_3027) System.out.print(i_3027 + " ");
		System.out.println();
	}
	
}
