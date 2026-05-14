package pekan6_2511533027;

import java.util.Scanner;

public class Musik_2511533027 {
	// head dan tail DLL
    Lagu_2511533027 head_3027 = null;
    Lagu_2511533027 tail_3027 = null;

    // method tambah lagu di akhir
    public void tambahLagu_3027(String judul_3027, String penyanyi_3027) {
        Lagu_2511533027 laguBaru_3027 = new Lagu_2511533027(judul_3027, penyanyi_3027);
    
        // jika playlist kosong
        if (head_3027 == null) {
            head_3027 = laguBaru_3027;
            tail_3027 = laguBaru_3027;
        }
    
    
	 // tambah di akhir
	    else {
	        tail_3027.next_3027 = laguBaru_3027;
	        laguBaru_3027.prev_3027 = tail_3027;
	        tail_3027 = laguBaru_3027;
	    }
	
	    System.out.println("\nLagu berhasil ditambahkan!");
    }     
	 // method hapus lagu awal
	    public void hapusLaguAwal_3027() {
	        // jika playlist kosong
	        if (head_3027 == null) {
	            System.out.println("Playlist masih kosong!\n");
	            return;
	        }

	        System.out.println("Lagu " + head_3027.judul_3027 + " berhasil dihapus!\n");
	     
	        // pindahkan head
	        head_3027 = head_3027.next_3027;

	        if (head_3027 != null) {
	            head_3027.prev_3027 = null;
	        }

	        else {
	            tail_3027 = null;
	        }
	    }
	    
	 // tampil playlist maju
	    public void tampilMaju_3027() {
	        // cek playlist kosong
	        if (head_3027 == null) {
	            System.out.println("Playlist kosong!\n");
	            return;
	        }
	        
	        Lagu_2511533027 curr_3027 = head_3027;

	        System.out.println("=== Playlist Maju ===");

	        while (curr_3027 != null) {
	            System.out.println(curr_3027.judul_3027 + " - " + curr_3027.penyanyi_3027);
	            curr_3027 = curr_3027.next_3027;
	        }

	        System.out.println();
	    }
	    
	 // tampil playlist mundur
	    public void tampilMundur_3027() {
	        // cek playlist kosong
	        if (tail_3027 == null) {
	            System.out.println("Playlist kosong!\n");
	            return;
	        }
	        
	        Lagu_2511533027 curr_3027 = tail_3027;

	        System.out.println("=== Playlist Mundur ===");

	        while (curr_3027 != null) {
	            System.out.println(curr_3027.judul_3027 + " - " + curr_3027.penyanyi_3027);
	            curr_3027 = curr_3027.prev_3027;
	        }

	        System.out.println();
	    }
	    
	 // cari lagu berdasarkan judul
	    public void cariLagu_3027(String judulCari_3027) {
	        // cek playlist kosong
	        if (head_3027 == null) {
	            System.out.println("Playlist kosong!\n");
	            return;
	        }
	        
	        Lagu_2511533027 curr_3027 = head_3027;
	        boolean ditemukan_3027 = false;

	        while (curr_3027 != null) {
	            if (curr_3027.judul_3027.equalsIgnoreCase(judulCari_3027)) {
	                System.out.println("Lagu ditemukan!");
	                System.out.println("Judul    : " + curr_3027.judul_3027);
	                System.out.println("Penyanyi : " + curr_3027.penyanyi_3027 + "\n");
	                ditemukan_3027 = true;
	                break;
	            }

	            curr_3027 = curr_3027.next_3027;
	        }
	        
	        if (!ditemukan_3027) {
	            System.out.println("Lagu tidak ditemukan!\n");
	        }
	    }

	    // method utama
	    public static void main(String[] args) {
	        Scanner input_3027 = new Scanner(System.in);
	        Musik_2511533027 playlist_3027 = new Musik_2511533027();

	        int pilihan_3027;
	        
	        do {
	            System.out.println("=== Playlist Musik NIM: 2511533027 ===");
	            System.out.println("1. Tambah Lagu");
	            System.out.println("2. Hapus Lagu Pertama");
	            System.out.println("3. Lihat Playlist (Maju)");
	            System.out.println("4. Lihat Playlist (Mundur)");
	            System.out.println("5. Cari Lagu");
	            System.out.println("6. Keluar");
	            System.out.print("Pilihan: ");

	            pilihan_3027 = input_3027.nextInt();
	            input_3027.nextLine();
	            
	         switch (pilihan_3027) {
                case 1:
                    System.out.print("Judul Lagu : ");
                    String judul_3027 = input_3027.nextLine();

                    System.out.print("Penyanyi   : ");
                    String penyanyi_3027 = input_3027.nextLine();

                    playlist_3027.tambahLagu_3027(judul_3027, penyanyi_3027);
                    break;

                case 2:
                    playlist_3027.hapusLaguAwal_3027();
                    break;

                case 3:
                    playlist_3027.tampilMaju_3027();
                    break; 
                    
                case 4:
                    playlist_3027.tampilMundur_3027();
                    break;

                case 5:
                    System.out.print("Masukkan judul lagu yang dicari: ");
                    String cari_3027 = input_3027.nextLine();
                    playlist_3027.cariLagu_3027(cari_3027);
                    break;

                case 6:
                    System.out.println("Program selesai 🌷");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!\n");
            }
	         
	       } while (pilihan_3027 != 6);

	        input_3027.close(); 
	}
	    
}
