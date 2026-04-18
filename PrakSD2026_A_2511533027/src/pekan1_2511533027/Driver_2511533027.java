package pekan1_2511533027;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver_2511533027 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ADTMobil_2511533027> list = new ArrayList<>();

     // ================= TAMBAH DATA =================
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

            ADTMobil_2511533027 m = new ADTMobil_2511533027(nama, tahun, cc, harga, merk);
            list.add(m);
        }

        // ================= TAMPIL AWAL =================
        System.out.println("\n=== DATA MOBIL ===");
        tampil(list);

        // ================= HAPUS DATA =================
        System.out.print("\nMasukkan nomor mobil yang ingin dihapus: ");
        int hapus = input.nextInt();

        if (hapus >= 1 && hapus <= list.size()) {
            list.remove(hapus - 1);
            System.out.println("Data berhasil dihapus!");
        } else {
            System.out.println("Index tidak valid!");
        }

        // ================= TAMPIL SETELAH HAPUS =================
        System.out.println("\n=== DATA SETELAH DIHAPUS ===");
        tampil(list);
        
        // tutup scanner
        input.close();
    }

    // method tampil
    public static void tampil(ArrayList<ADTMobil_2511533027> list) {
        for (int i = 0; i < list.size(); i++) {
            ADTMobil_2511533027 m = list.get(i);

            System.out.println("\nData Mobil ke-" + (i + 1));
            System.out.println("Nama Mobil: " + m.getNama());
            System.out.println("Tahun: " + m.getTahun());
            System.out.println("cc: " + m.getCc());
            System.out.println("Harga: " + m.getHarga());
            System.out.println("Merk: " + m.getMerk());
            
        }
    }
}
