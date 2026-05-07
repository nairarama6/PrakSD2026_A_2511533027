package pekan5_2511533027;

import java.util.Scanner;

public class RumahSakit_2511533027 {
	static Pasien_2511533027 head_3027 = null;
	static int counter_3027 = 0;
	
	// method insert at tail
	public static void daftarkanPasien_3027(String nama_3027, String penyakit_3027) {
		counter_3027++;
		Pasien_2511533027 pasienBaru_3027 = new Pasien_2511533027(nama_3027, penyakit_3027, counter_3027);
		
		// jika antrian (linked list) kosong
		if (head_3027 == null) {
			head_3027 = pasienBaru_3027;
		} else {
			Pasien_2511533027 temp_3027 = head_3027;
			while (temp_3027.next_3027 != null) {
				temp_3027 = temp_3027.next_3027;
			}
			// sambungkan node terakhir ke node baru
			temp_3027.next_3027 = pasienBaru_3027;
		}
		
		System.out.println("Pasien Berhasil Didaftarkan!");
		System.out.println("Nomor Antrian: " + pasienBaru_3027.nomorAntrian_3027);
	}
	// method delete head
	public static void panggilPasien_3027() {
		// jika antrian kosong
		if (head_3027 == null) {
			System.out.println("Antrian Masih Kosong.");
			return;
		}
		System.out.println("Pasien Dipanggil: ");
		System.out.println("Nomor Antrian   : " + head_3027.nomorAntrian_3027);
		System.out.println("Nama Pasien     : " + head_3027.namaPasien_3027);
		System.out.println("Keluhan         : " + head_3027.penyakit_3027);
		// geser head ke node berikutnya
		head_3027 = head_3027.next_3027;
	}
	
	// method display
	public static void tampilkanAntrian_3027() {
		if (head_3027 == null) {
			System.out.println("Antrian Masih Kosong.");
			return;
		}
		
		Pasien_2511533027 temp_3027 = head_3027;
		int posisi_3027 = 1;
		System.out.println("=== DAFTAR ANTRIAN PASIEN ===");
		while (temp_3027 != null) {
			System.out.println("Posisi Antrian: " + posisi_3027);
			System.out.println("Nomor Antrian : " + temp_3027.nomorAntrian_3027);
			System.out.println("Nama Pasien   : "+ temp_3027.namaPasien_3027);
			System.out.println("Keluhan       :" + temp_3027.penyakit_3027);
			System.out.println();
			
			temp_3027 = temp_3027.next_3027;
			posisi_3027++;
		}
	}
	
	// method search
	public static void cariPasien_3027(String namaCari_3027) {
		if (head_3027 == null) {
			System.out.println("Antrian Masih kosong.");
			return;
		}
		
		Pasien_2511533027 temp_3027 = head_3027;
		boolean ketemu_3027 = false;
		while (temp_3027 != null) {
			if (temp_3027.namaPasien_3027.equalsIgnoreCase(namaCari_3027)) {
				System.out.println("Pasien Ditemukan!");
				System.out.println("Nomor Antrian: " + temp_3027.nomorAntrian_3027);
				System.out.println("Nama Pasien  : " + temp_3027.namaPasien_3027);
				System.out.println("Keluhan      : " + temp_3027.penyakit_3027);
				ketemu_3027 = true;
				break;
			}
			temp_3027 = temp_3027.next_3027;
		}
		if (!ketemu_3027) {
			System.out.println("Pasien Tidak Ditemukan.");
		}
	}
	
	// method cek status antrian
	public static void cekStatusAntrian_3027() {
		if (head_3027 == null) {
			System.out.println("Antrian Masih Kosong.");
			return;
		}
		
		Pasien_2511533027 temp_3027 = head_3027;
		int jumlah_3027 = 0;
		while(temp_3027 != null) {
			jumlah_3027++;
			temp_3027 = temp_3027.next_3027;
		}
		System.out.println("Jumlah Pasien Dalam Antrian: ");
		System.out.println("Nomor Antrian              : " + head_3027.nomorAntrian_3027);
		System.out.println("Nama Pasien                : " + head_3027.namaPasien_3027);
		System.out.println("Keluhan                    : " + head_3027.penyakit_3027);
	}
	
	// main program
	public static void main (String[] args) {
		Scanner input_3027 = new Scanner(System.in);
		int pilihan_3027;
		do {
			System.out.println();
			System.out.println("=== Antrian Rumah Sakit NIM: 2511533027 ===");
			System.out.println("1. Daftarkan Pasien");
			System.out.println("2. Panggil Pasien");
			System.out.println("3. Tampilkan Antrian");
			System.out.println("4. Cari Pasien");
			System.out.println("5. Cek Status Antrian");
			System.out.println("6. Keluar");
			System.out.print("Pilihan: ");
			
			pilihan_3027 = input_3027.nextInt();
			input_3027.nextLine();
			
			switch (pilihan_3027) {
			case 1:
				System.out.println("Masukkan Nama Pasien: ");
				String nama_3027 = input_3027.nextLine();
				System.out.println("Masukkan Keluhan: ");
				String penyakit_3027 = input_3027.nextLine();
				daftarkanPasien_3027(nama_3027, penyakit_3027);
				break;
			case 2:
				panggilPasien_3027();
				break;
			case 3:
				tampilkanAntrian_3027();
				break;
			case 4:
				System.out.print("Masukkan Nama Pasien Yang Dicari: ");
				String cari_3027 = input_3027.nextLine();
				cariPasien_3027(cari_3027);
				break;
			case 5:
				cekStatusAntrian_3027();
				break;
			case 6:
				System.out.println("Program Selesai.");
				break;
			default:
				System.out.println("Pilihan Tidak Tersedia.");
			}
		}
		while (pilihan_3027 != 6);
		input_3027.close();
	}

}
