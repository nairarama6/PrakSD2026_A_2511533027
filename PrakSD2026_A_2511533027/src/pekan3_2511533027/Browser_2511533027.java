package pekan3_2511533027;

import java.util.Scanner;
import java.util.Stack;

public class Browser_2511533027 {
	public static void main(String[] args) {
		Stack<Website_2511533027> history_3027 = new Stack<>();
		Scanner input_3027 = new Scanner(System.in);
		int choice_3027;
		
		do {
			System.out.println("\n=== Browser History NIM: 2511533027 ===");
			System.out.println("1. Kunjungi Website (Push).");
			System.out.println("2. Tombol Back (Pop).");
			System.out.println("3. Lihat Halaman Aktif (Peek).");
			System.out.println("4. Cek Status History.");
			System.out.println("5. Keluar.");
			System.out.print("Pilihan : ");
			choice_3027 = input_3027.nextInt();
			input_3027.nextLine();
			
			switch (choice_3027) {
			case 1:
				System.out.print("Masukkan Judul Website: ");
				String judul_3027 = input_3027.nextLine();
				System.out.print("Masukkan URL Website: ");
				String url_3027 = input_3027.nextLine();
				
				Website_2511533027 web = new Website_2511533027(judul_3027, url_3027);
				history_3027.push(web);

				System.out.println("Berhasil Mengunjungi Halaman!");
				break;
				
			case 2:
				if (history_3027.isEmpty()) {
					System.out.println("History Kosong, tidak bisa kembali.");
				} else {
					Website_2511533027 hapus = history_3027.pop();
					System.out.println("Kembali dari halaman: " + hapus.getJudul_3027());
				}
				break;
				
			case 3:
				if (history_3027.isEmpty()) {
					System.out.println("Tidak ada halaman yang sedang dibuka.");
				} else {
					System.out.println("Halaman aktif:");
					System.out.println(history_3027.peek());
				}
				break;
				
			case 4:
				if (history_3027.isEmpty()) {
					System.out.println("History masih kosong.");
				} else {
					System.out.println("Jumlah history tersimpan: " + history_3027.size());
				}
				break;
				
			case 5:
				System.out.println("Terimakasih, browser ditutup.");
				break;
				
			default:
				System.out.println("Pilihan tidak valid.");
			}
			
		} while (choice_3027 !=5);
		
		input_3027.close();
	}

}
