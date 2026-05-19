package pekan7_2511533027;

public class InsertionSort_2511533027 {
	public static void insertionSort_3027 (int[] arr_3027) {
		int n_3027 = arr_3027.length;
		for (int i_3027 = 1; i_3027 < n_3027; i_3027++) {
			int key_3027 = arr_3027[i_3027];
			int j_3027 = i_3027 - 1;
			while (j_3027 >= 0 && arr_3027[j_3027] > key_3027) {
				arr_3027[j_3027 + 1] = arr_3027[j_3027];
				j_3027--;
			}
			arr_3027[j_3027 + 1] = key_3027;
		}
		
	}
	public static void main(String[] args) {
	    int arr_3027[] = { 23, 78, 45, 8, 32, 56, 1 };
	    int n_3027 = arr_3027.length;
	    System.out.println("array yang belum terurut:");
	    for (int i_3027 = 0; i_3027 < n_3027; i_3027++) 
	        System.out.print(arr_3027[i_3027] + " ");
	    System.out.println("");
	    insertionSort_3027(arr_3027); 
	    System.out.println("array yang terurut:");
	    for (int i_3027 = 0; i_3027 < n_3027; i_3027++) 
	        System.out.print(arr_3027[i_3027] + " ");
	    System.out.println("");
	}

}
