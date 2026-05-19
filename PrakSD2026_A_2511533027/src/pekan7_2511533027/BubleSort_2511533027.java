package pekan7_2511533027;

public class BubleSort_2511533027 {
	public static void bubbleSort_3027(int[] arr_3027) {
		int n_3027 = arr_3027.length;
		for (int i_3027 = 0; i_3027 < n_3027; i_3027++) {
			for (int j_3027 = 0; j_3027 < n_3027 - i_3027 - 1; j_3027++) {
				if (arr_3027[j_3027] > arr_3027[j_3027 + 1]) {
					int temp_3027 = arr_3027[j_3027];
					arr_3027[j_3027] = arr_3027[j_3027 + 1];
					arr_3027[j_3027 + 1] = temp_3027;
				//  System.out.println("data:"+arr_3027[j]+" "+arr[j+1});
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr_3027[] = { 23, 78, 45, 8, 32, 56, 1 };
		int n_3027 = arr_3027.length;
		System.out.print("array yang belum terurut:");
		for (int i_3027 = 0; i_3027 < n_3027; i_3027++)
			System.out.print(arr_3027[i_3027] + " ");
		System.out.println("");
		bubbleSort_3027(arr_3027);
		System.out.print("array yang terurut menggunakan BubleSort:");
		for (int i_3027 = 0; i_3027 < n_3027; i_3027++)
			System.out.print(arr_3027[i_3027] + " ");
		System.out.println("");
	}

}
