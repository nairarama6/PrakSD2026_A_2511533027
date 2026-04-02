package pekan1_2511533027;

import java.util.Scanner;
public class Driver_2511533027 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU DATA MOBIL ===");
            System.out.println("1. Tambah Mobil");
            System.out.println("2. Hapus Mobil");
            System.out.println("3. Tampilkan Mobil");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Tambah Mobil ---");
                    System.out.print("Nama Mobil  : ");
                    String nama = input.nextLine();

                    System.out.print("Tahun       : ");
                    int tahun = input.nextInt();

                    System.out.print("CC          : ");
                    int cc = input.nextInt();

                    System.out.print("Harga       : ");
                    int harga = input.nextInt();
                    input.nextLine();

                    System.out.print("Merk        : ");
                    String merk = input.nextLine();

                    Mobil_2511533027 mobilBaru = 
                        new Mobil_2511533027(nama, tahun, cc, harga, merk);

                    Mobil_2511533027.tambahMobil(mobilBaru);
                    System.out.println("Mobil berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n--- Hapus Mobil ---");
                    Mobil_2511533027.tampilkanMobil();
                    System.out.print("Masukkan nomor mobil yang ingin dihapus: ");
                    int index = input.nextInt();
                    input.nextLine(); // biar bersih

                    Mobil_2511533027.hapusMobil(index - 1);
                    break;

                case 3:
                    System.out.println("\n--- Daftar Mobil ---");
                    Mobil_2511533027.tampilkanMobil();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);

        input.close();
    }

}
