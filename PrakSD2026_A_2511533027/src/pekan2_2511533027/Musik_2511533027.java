package pekan2_2511533027;

public class Musik_2511533027 {
	String judulLagu_3027;
	String penyanyi_3027;
	int durasi_3027;
	
	// Constructor
	public Musik_2511533027(String judulLagu_3027, String penyanyi_3027, int durasi_3027) {
		this.judulLagu_3027 = judulLagu_3027;
		this.penyanyi_3027 = penyanyi_3027;
		this.durasi_3027 = durasi_3027;
	}
	
	// Getter
	public String getJudul() {
		return judulLagu_3027;
	}
	public String getPenyanyi() {
		return penyanyi_3027;
	}
	public int getDurasi() {
		return durasi_3027;
	}
	
	// Setter
	public void setJudul(String judulLagu) {
		this.judulLagu_3027 = judulLagu;
	}
	public void setPenyanyi(String penyanyi) {
		this.penyanyi_3027 = penyanyi;
	}
	public void setDurasi(int durasi) {
		this.durasi_3027 = durasi;  
	}
	
	// toString
	@Override
	public String toString() {
		return "Judul Lagu: " + judulLagu_3027 + ", Penyanyi: " + penyanyi_3027 + ", Durasi: " + durasi_3027 + "detik";
	}

}
