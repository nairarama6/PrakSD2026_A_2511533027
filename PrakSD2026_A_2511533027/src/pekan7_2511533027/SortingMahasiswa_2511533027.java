package pekan7_2511533027;

import java.util.ArrayList;

import javax.swing.JTextArea;

public class SortingMahasiswa_2511533027 {
	public static void bubbleSort_3027(ArrayList<Mahasiswa_2511533027> data_3027, JTextArea log_3027) {
		int n_3027 = data_3027.size();
		for (int i_3027 = 0; i_3027 < n_3027; i_3027++) {
			for (int j_3027 = 0; j_3027 < n_3027 - i_3027 - 1; j_3027++) {
				if (data_3027.get(j_3027).getNama_3027().compareToIgnoreCase(data_3027.get(j_3027 + 1).getNama_3027()) > 0) {
					Mahasiswa_2511533027 temp_3027 = data_3027.get(j_3027);
					data_3027.set(j_3027, data_3027.get(j_3027 + 1));
					data_3027.set(j_3027 + 1, temp_3027);
				}
			}
			log_3027.append("Pass " + (i_3027 + 1) + " : " + data_3027 + "\n");
		}
	}
	
	public static void selectionSort_3027(ArrayList<Mahasiswa_2511533027> data_3027, JTextArea log_3027) {
		for (int i_3027 = 0; i_3027 < data_3027.size() - 1; i_3027++) {
			int min_3027 = i_3027;
			for (int j_3027 = i_3027 + 1; j_3027 < data_3027.size(); j_3027++) {
				if (data_3027.get(j_3027).getNama_3027().compareToIgnoreCase(data_3027.get(min_3027).getNama_3027()) < 0) {
					min_3027 = j_3027;
				}
			}
			Mahasiswa_2511533027 temp_3027 = data_3027.get(min_3027);
			data_3027.set(min_3027, data_3027.get(i_3027));
			data_3027.set(i_3027, temp_3027);
			log_3027.append("Pass " + (i_3027 + 1) + " : " + data_3027 + "\n");
		}
	}
	
	public static void insertionSort_3027(ArrayList<Mahasiswa_2511533027> data_3027, JTextArea log_3027) {
		for (int i_3027 = 1; i_3027 < data_3027.size(); i_3027++) {
			Mahasiswa_2511533027 key_3027 = data_3027.get(i_3027);
			int j_3027 = i_3027 - 1;
			while (j_3027 >= 0 && data_3027.get(j_3027).getNama_3027().compareToIgnoreCase(key_3027.getNama_3027()) > 0) {
				data_3027.set(j_3027 + 1, data_3027.get(j_3027));
				j_3027--;
			}
			data_3027.set(j_3027 + 1, key_3027);
			log_3027.append("Langkah " + i_3027 + " : " + data_3027 + "\n");
		}
	}
}
