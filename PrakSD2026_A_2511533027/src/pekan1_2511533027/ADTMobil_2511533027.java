package pekan1_2511533027;

public class ADTMobil_2511533027 {
	// atribut
    String nama;
    int tahun;
    int cc;
    long harga;
    String merk;

    // konstruktor
    public ADTMobil_2511533027(String nama, int tahun, int cc, long harga, String merk) {
        this.nama = nama;
        this.tahun = tahun;
        this.cc = cc;
        this.harga = harga;
        this.merk = merk;
    }
    
 // selektor (getter)
    public String getNama() {
        return nama;
    }

    public int getTahun() {
        return tahun;
    }

    public int getCc() {
        return cc;
    }

    public long getHarga() {
        return harga;
    }

    public String getMerk() {
        return merk;
    }

    // method tampil (opsional, biar gampang)
    public void tampil() {
        System.out.println("Nama Mobil: " + nama);
        System.out.println("Tahun: " + tahun);
        System.out.println("cc: " + cc);
        System.out.println("Harga: " + harga);
        System.out.println("Merk: " + merk);
    }
}
