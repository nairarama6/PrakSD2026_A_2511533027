package pekan1_2511533027;

import java.util.ArrayList;
import java.util.Scanner;

public class Mobil_2511533027 {
	private String nama; 
	private int tahun; 
	private int cc; 
	private int harga;
	private String merk;
	public static void tampilkanMobil() {
		
	}
	// menyimpan daftar Mobil_2511533027
    private static ArrayList<Mobil_2511533027> daftarMobil = new ArrayList<>();

    // --- Konstruktor ---
    public Mobil_2511533027(String nama, int tahun, int cc, int harga, String merk) {
        this.nama = nama;
        this.tahun = tahun;
        this.cc = cc;
        this.harga = harga;
        this.merk = merk;
    }
    
	 // --- Selektor (Getter) ---
	    public String getNama() { return nama; }
	    public int getTahun() { return tahun; }
	    public int getCc() { return cc; }
	    public int getHarga() { return harga; }
	    public String getMerk() { return merk; }
	
	    // --- Mutator (Setter) ---
	    public void setNama(String nama) { this.nama = nama; }
	    public void setTahun(int tahun) { this.tahun = tahun; }
	    public void setCc(int cc) { this.cc = cc; }
	    public void setHarga(int harga) { this.harga = harga; }
	    public void setMerk(String merk) { this.merk = merk; }
	    
	    // --- Method tambah mobil ---
	    public static void tambahMobil(Mobil_2511533027 m) {
	        daftarMobil.add(m);
	    }
	    
	    // --- Method hapus mobil ---
	    public static void hapusMob(int index) {
	        if (index >= 0 && index < daftarMobil.size()) {
	            daftarMobil.remove(index);
	        } else {
	            System.out.println("Index tidak valid!");
	        }
	    }
	    
	    // --- Method hapus mobil ---
	    public static void hapusMobil(int index) {
	        if (index >= 0 && index < daftarMobil.size()) {
	            daftarMobil.remove(index);
	        } else {
	            System.out.println("Index tidak valid!");
	        }
	    }
	
	}
