package pekan8_2511533027;

public class MergeSort_2511533027 {
		void merge_3027(int arr_3027[], int l_3027, int m_3027, int r_3027) {
	        /* Find sizes of two subsrrays to be merged */
	        int n1_3027 = m_3027 - l_3027 + 1;
	        int n2_3027 = r_3027 - m_3027;

	        /* Create temp arrays */
	        int L_3027[] = new int[n1_3027];
	        int R_3027[] = new int[n2_3027];

	        /* Copy data to temp arrays */
	        for (int i_3027 = 0; i_3027 < n1_3027; ++i_3027)
	            L_3027[i_3027] = arr_3027[l_3027 + i_3027];
	        for (int j_3027 = 0; j_3027 < n2_3027; ++j_3027)
	            R_3027[j_3027] = arr_3027[m_3027 + 1 + j_3027];

	        int i_3027 = 0, j_3027 = 0;
	        int k_3027 = l_3027;
	        while (i_3027 < n1_3027 && j_3027 < n2_3027) {
	            if (L_3027[i_3027] <= R_3027[j_3027]) {
	                arr_3027[k_3027] = L_3027[i_3027];
	                i_3027++;
	            } else {
	                arr_3027[k_3027] = R_3027[j_3027];
	                j_3027++;
	            }
	            k_3027++;
	        }
	        while (i_3027 < n1_3027) {
	            arr_3027[k_3027] = L_3027[i_3027];
	            i_3027++;
	            k_3027++;
	        }

	        
	        while (j_3027 < n2_3027) {
	            arr_3027[k_3027] = R_3027[j_3027];
	            j_3027++;
	            k_3027++;
	        }
	    }
	    void sort(int arr_3027[], int l_3027, int r_3027) {
	        if (l_3027 < r_3027) {
	            // Find the middle point
	            int m_3027 = (l_3027 + r_3027) / 2;

	            // Sort first and second halves
	            sort(arr_3027, l_3027, m_3027);
	            sort(arr_3027, m_3027 + 1, r_3027);

	            // Merge the sorted halves
	            merge_3027(arr_3027, l_3027, m_3027, r_3027);
	        }
	    }

	    /* A utility function to print array of size n */
	    static void printArray(int arr_3027[]) {
	        int n_3027 = arr_3027.length;
	        for (int i_3027 = 0; i_3027 < n_3027; i_3027++)
	            System.out.print(arr_3027[i_3027] + " ");
	        System.out.println();
	    }

	    public static void main(String args_3027[]) {
	        int arr_3027[] = { 12, 11, 13, 5, 6, 7 };
	        System.out.println("Sebelum terurut");
	        printArray(arr_3027);

	        MergeSort_2511533027 ob_3027 = new MergeSort_2511533027();
	        ob_3027.sort(arr_3027, 0, arr_3027.length - 1);
	        System.out.println("\nSesudah Terurut menggunakan merge Sort");
	        printArray(arr_3027);
	    }

	}



