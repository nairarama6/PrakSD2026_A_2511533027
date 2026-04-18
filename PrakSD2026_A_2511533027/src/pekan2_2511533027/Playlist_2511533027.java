package pekan2_2511533027;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511533027 {
	// 1. Method untuk menampilkan menu
	public static void tampilkanMenu_3027() {
		System.out.println("\n=== Playlist Musik ===");
		System.out.println("1. Tambah Lagu");
		System.out.println("2. Lihat Playlist");
		System.out.println("3. Hapus Lagu");
		System.out.println("4. Keluar");
	}
	
	// 2. Method untuk tambah lagu
	public static void tambahLagu_3027(ArrayList<Musik_2511533027> list, Scanner sc) {
		System.out.print("Masukkan Judul Lagu: ");
		String judulLagu_3027 = sc.nextLine();
		
		System.out.print("Masukkan Penyanyi: ");
		String penyanyi_3027 = sc.nextLine();
		
		System.out.print("Masukkan Durasi: ");
		int durasi_3027 = sc.nextInt();
		sc.nextLine();
		
		list.add(new Musik_2511533027(judulLagu_3027, penyanyi_3027, durasi_3027));
		System.out.println("Lagu berhasil ditambahkan.");
	}
	
	// 3. Method untuk tampilkan playlist
	public static void tampilkanSemuaDaftarLagu_3027(ArrayList<Musik_2511533027> list) {
		if (list.isEmpty()) {
			System.out.println("Daftar lagu kosong.");
		} else {
			System.out.println("\nDaftar Lagu:");
			int no = 1;
			for (Musik_2511533027 m : list) {
				System.out.println(no + ". " + m);
				no++;
			}
		}
	}
	
	// 4. Method untuk hapus lagu berdasarkan nomor indeks
	public static void hapusLagu_3027(ArrayList<Musik_2511533027> list, Scanner sc) {
		tampilkanSemuaDaftarLagu_3027(list);
		
		if (!list.isEmpty()) {
			System.out.print("Masukkan nomor lagu yang ingin dihapus: ");
			int index = sc.nextInt();
			sc.nextLine();
			
			if (index > 0 && index <= list.size()) {
				list.remove(index - 1);
				System.out.println("Lagu berhasil dihapus.");
			} else {
				System.out.println("Nomor tidak valid.");
			}
		}
	}
	
	// 5. Method untuk cek jumlah lagu
	public static void cekJumlah_3027(ArrayList<Musik_2511533027> list) {
		System.out.println("Jumlah lagu dalam playlist: " + list.size());
	}
	
	public static void main(String[] args) {
		ArrayList<Musik_2511533027> playlist = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int pilihan;
	do {
		tampilkanMenu_3027();
		System.out.print("Pilih Menu: ");
		pilihan = scanner.nextInt();
		scanner.nextLine(); // Consume newline
		
		switch (pilihan) {
		case 1:
			tambahLagu_3027(playlist, scanner);
			break;
		case 2:
			tampilkanSemuaDaftarLagu_3027(playlist);
			break;
		case 3:
			hapusLagu_3027(playlist, scanner);
			break;
		case 4:
			System.out.println("Keluar dari program.");
			break;
		default:
			System.out.println("Pilihan tidak valid.");
		}
		
	} 
	while (pilihan !=5);
	scanner.close();
	}

}
