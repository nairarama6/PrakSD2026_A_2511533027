package pekan4_2511533027;

import java.util.Scanner;
import java.util.Stack;

public class AntrianLoket_2511533027 {
	int front_3027, rear_3027, max_3027;
	String queue_3027[];
	
	// konstruktor 
	public AntrianLoket_2511533027(int max_3027) {
		this.max_3027 = max_3027;
		queue_3027 = new String[max_3027];
		front_3027 = -1;
		rear_3027 = -1;
	}
	
	// cek kondisi antrian kosong
	boolean isEmpty_3027() {
		return (front_3027 == -1);
	}
	
	// cek antrian penuh
	boolean isFull_3027() {
		return (rear_3027 == - 1);
	}
	
	// enqueue (tambah pelanggan ke antrian)
	void enqueue_3027(String data) {
			if (isEmpty_3027()) {
				front_3027 = 0;
			}
			rear_3027++;
			queue_3027[rear_3027] = data;
			 System.out.println("Data berhasil ditambahkan ke antrian");
		
	}
	
	// dequeue (hapus data pelanggan dari antrian)
	void dequeue_3027() {
		if (isEmpty_3027()) {
			 System.out.println("Antrian Kosong!");
		} else {
			 System.out.println(queue_3027[front_3027] + " Telah Dilayani");
			 if (front_3027 == rear_3027) {
				 front_3027 = rear_3027 = -1;
			 } else {
				 front_3027++;
			 }
		}
	}
	
	// tampilkan antrian pelanggan
	void display_3027() {
		if (isEmpty_3027()) {
			 System.out.println("Antrian Kosong!");
		} else {
			 System.out.println("Isi Antrian:");
			 int no_3027 = 1;
			 for (int i = front_3027; i <= rear_3027; i++) {
				 System.out.println(no_3027 + "." + queue_3027[i]);
				 no_3027++;
			 }
		}
	}
	
	// reverse data antrian pelanggan
	void reverse_3027() {
		if (isEmpty_3027()) {
			 System.out.println("Antrian Kosong!");
			 return;
		}
		
		Stack<String> stack_3027 = new Stack<>();
		for (int i = front_3027; i <= rear_3027; i++) {
			stack_3027.push(queue_3027[i]); // Q -> stack
		}
		
		int i = front_3027;
		while (!stack_3027.isEmpty()) {
			queue_3027[i] = stack_3027.pop();
			i++; // stack -> Q
		}
		 System.out.println("Antrian Berhasil Dibalik");
		 // tampilkan setelah dibalik
		 System.out.println("Isi Antrian:");
		 display_3027();
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AntrianLoket_2511533027 antrian_3027 = new AntrianLoket_2511533027(10);
		int pilih_3027;
		do {
			 System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
			 System.out.println("1. Tambah Antrian");
			 System.out.println("2. Hapus Antrian");
			 System.out.println("3. Tampilkan Antrian");
			 System.out.println("4. Reverse");
			 System.out.println("5. Keluar");
			 System.out.print("Pilih Menu: ");
			 pilih_3027 = input.nextInt();
			 input.nextLine();
			 
			 switch (pilih_3027) {
			 case 1:
				 System.out.print("Masukkan Nama Pelanggan: ");
				 String nama_3027 = input.nextLine();
				 antrian_3027.enqueue_3027(nama_3027);
				 break;
				 
			 case 2:
				 antrian_3027.dequeue_3027();
				 break;
				 
			 case 3:
				 antrian_3027.display_3027();
				 break;
				 
			 case 4:
				 antrian_3027.reverse_3027();
				 break;
				 
			 case 5:
				 System.out.println("Program Selesai.");
				 break;
				 
			default:
				 System.out.println("Pilihan Tidak Valid.");
			 }
		} while (pilih_3027 != 5);
		
		input.close();
	}

}
