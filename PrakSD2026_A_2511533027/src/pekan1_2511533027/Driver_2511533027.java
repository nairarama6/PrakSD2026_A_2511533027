package pekan1_2511533027;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver_2511533027 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ADTMobil_2511533027> list = new ArrayList<>();

        System.out.print("Masukkan jumlah mobil: ");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nData Mobil ke-" + (i + 1));

            System.out.print("Nama Mobil: ");
            String nama = input.nextLine();

            System.out.print("Tahun: ");
            int tahun = input.nextInt();

            System.out.print("cc: ");
            int cc = input.nextInt();

            System.out.print("Harga: ");
            long harga = input.nextLong();
            input.nextLine();

            System.out.print("Merk: ");
            String merk = input.nextLine();

            // buat objek mobil
            ADTMobil_2511533027 m = new ADTMobil_2511533027(nama, tahun, cc, harga, merk);
            // tambah ke ArrayList
            list.add(m);
        }

        // OUTPUT
        System.out.println("\n=== DATA MOBIL ===");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("\nData Mobil ke-" + (i + 1));
            list.get(i).tampil();
        }
    }

}
