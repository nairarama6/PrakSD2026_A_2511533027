package pekan8_2511533027;

import java.util.Scanner;

public class Sorting_2511533027 {
	Lagu_2511533027[] dataLagu_3027 = new Lagu_2511533027[20];
    int jumlah_3027 = 0;

    public void inputData_3027() {
        Scanner input_3027 = new Scanner(System.in);
        System.out.print("Masukkan jumlah lagu (minimal 7): ");
        jumlah_3027 = input_3027.nextInt();
        input_3027.nextLine();
        if (jumlah_3027 < 7) {
            System.out.println("Jumlah lagu minimal 7!");
            System.exit(0);
        }
        for (int i_3027 = 0; i_3027 < jumlah_3027; i_3027++) {
            System.out.println("\nData Lagu ke-" + (i_3027 + 1));
            System.out.print("Judul Lagu    : ");
            String judul_3027 = input_3027.nextLine();
            System.out.print("Penyanyi      : ");
            String penyanyi_3027 = input_3027.nextLine();
            System.out.print("Durasi (detik): ");
            int durasi_3027 = input_3027.nextInt();
            input_3027.nextLine();
            dataLagu_3027[i_3027] = new Lagu_2511533027(judul_3027, penyanyi_3027, durasi_3027);
        }
    }

    public void tampilData_3027() {
        for (int i_3027 = 0; i_3027 < jumlah_3027; i_3027++) {
            System.out.println((i_3027 + 1) + ". " + dataLagu_3027[i_3027].judul_3027 + " - " + dataLagu_3027[i_3027].durasi_3027 + " detik");
        }
    }

    public void swap_3027(int i_3027, int j_3027) {
        Lagu_2511533027 temp_3027 = dataLagu_3027[i_3027];
        dataLagu_3027[i_3027] = dataLagu_3027[j_3027];
        dataLagu_3027[j_3027] = temp_3027;
    }

    // ================= SHELL SORT =================

    public void shellSort_3027() {
        int gap_3027 = jumlah_3027 / 2;
        while (gap_3027 > 0) {
            for (int i_3027 = gap_3027; i_3027 < jumlah_3027; i_3027++) {
                Lagu_2511533027 temp_3027 = dataLagu_3027[i_3027];
                int j_3027 = i_3027;
                while (j_3027 >= gap_3027 &&
                        dataLagu_3027[j_3027 - gap_3027].judul_3027.compareToIgnoreCase(temp_3027.judul_3027) > 0) {
                    dataLagu_3027[j_3027] =
                            dataLagu_3027[j_3027 - gap_3027];
                    j_3027 -= gap_3027;
                }
                dataLagu_3027[j_3027] = temp_3027;
            }
            gap_3027 /= 2;
        }
    }

    // ================= QUICK SORT =================

    public int partition_3027(int low_3027, int high_3027) {
        int pivot_3027 = dataLagu_3027[high_3027].durasi_3027;
        int i_3027 = low_3027 - 1;
        for (int j_3027 = low_3027; j_3027 < high_3027; j_3027++) {
            if (dataLagu_3027[j_3027].durasi_3027 <= pivot_3027) {
                i_3027++;
                swap_3027(i_3027, j_3027);
            }
        }
        swap_3027(i_3027 + 1, high_3027);
        return i_3027 + 1;
    }

    public void quickSort_3027(int low_3027, int high_3027) {
        if (low_3027 < high_3027) {
            int pi_3027 =
            partition_3027(low_3027, high_3027);
            quickSort_3027(low_3027, pi_3027 - 1);
            quickSort_3027(pi_3027 + 1, high_3027);
        }
    }

    // ================= MERGE SORT =================

    public void merge_3027(int left_3027, int mid_3027, int right_3027) {
        int n1_3027 = mid_3027 - left_3027 + 1;
        int n2_3027 = right_3027 - mid_3027;
        Lagu_2511533027[] L_3027 =
                new Lagu_2511533027[n1_3027];
        Lagu_2511533027[] R_3027 = new Lagu_2511533027[n2_3027];
        for (int i_3027 = 0; i_3027 < n1_3027; i_3027++) {
            L_3027[i_3027] = dataLagu_3027[left_3027 + i_3027];
        }
        for (int j_3027 = 0; j_3027 < n2_3027; j_3027++) {
            R_3027[j_3027] = dataLagu_3027[mid_3027 + 1 + j_3027];
        }
        int i_3027 = 0;
        int j_3027 = 0;
        int k_3027 = left_3027;
        while (i_3027 < n1_3027 &&
                j_3027 < n2_3027) {
            if (L_3027[i_3027].judul_3027.compareToIgnoreCase( R_3027[j_3027].judul_3027) <= 0) {
                dataLagu_3027[k_3027] = L_3027[i_3027];
                i_3027++;
            } else {
                dataLagu_3027[k_3027] = R_3027[j_3027];
                j_3027++;
            }
            k_3027++;
        }
        while (i_3027 < n1_3027) {
            dataLagu_3027[k_3027++] = L_3027[i_3027++];
        }
        while (j_3027 < n2_3027) {
            dataLagu_3027[k_3027++] = R_3027[j_3027++];
        }
    }

    public void mergeSort_3027(int left_3027, int right_3027) {
        if (left_3027 < right_3027) {
            int mid_3027 = (left_3027 + right_3027) / 2;
            mergeSort_3027(left_3027, mid_3027);
            mergeSort_3027(mid_3027 + 1, right_3027);
            merge_3027(left_3027,
                    mid_3027,
                    right_3027);
        }
    }

    // ================= MAIN =================

    public static void main(String[] args) {
        Scanner input_3027 = new Scanner(System.in);
        Sorting_2511533027 playlist_3027 = new Sorting_2511533027();
        playlist_3027.inputData_3027();
        boolean ulang_3027 = true;
        while (ulang_3027) {
            System.out.println("\n=========================");
            System.out.println("Pilih Algoritma Sorting");
            System.out.println("1. Shell Sort");
            System.out.println("2. Quick Sort");
            System.out.println("3. Merge Sort");
            System.out.print("Pilihan: ");
            int pilihan_3027 = input_3027.nextInt();
            System.out.println("\nData Sebelum Sorting:");
            playlist_3027.tampilData_3027();
            switch (pilihan_3027) {
            case 1:
                    playlist_3027.shellSort_3027();
                    System.out.println("\nData Setelah Shell Sort (Judul A-Z):");
                    playlist_3027.tampilData_3027();
            break;
            case 2:
                    playlist_3027.quickSort_3027(0, playlist_3027.jumlah_3027 - 1);
                    System.out.println("\nData Setelah Quick Sort (Durasi Asc):");
                    playlist_3027.tampilData_3027();
            break;
            case 3:
                    playlist_3027.mergeSort_3027(0, playlist_3027.jumlah_3027 - 1);
                    System.out.println("\nData Setelah Merge Sort (Judul A-Z):");
                    playlist_3027.tampilData_3027();
            break;
            default:
                    System.out.println("Pilihan tidak valid!");
            }
            System.out.println("\nIngin mencoba algoritma lain?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            System.out.print("Pilihan: ");
            int jawab_3027 = input_3027.nextInt();
            if (jawab_3027 != 1) {
                ulang_3027 = false;
            }
        }
        System.out.println("\nProgram selesai.");
    }

}
