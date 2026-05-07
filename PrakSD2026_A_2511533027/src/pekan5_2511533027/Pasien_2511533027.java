package pekan5_2511533027;

public class Pasien_2511533027 {
	String namaPasien_3027;
	String penyakit_3027;
	int nomorAntrian_3027;
	
	// pointer ke pasien berikutnya
	Pasien_2511533027 next_3027;
	
	// constructor
	public Pasien_2511533027 (String namaPasien_3027, String penyakit_3027, int nomorAntrian_3027) {
		this.namaPasien_3027 = namaPasien_3027;
		this.penyakit_3027 = penyakit_3027;
		this.nomorAntrian_3027 = nomorAntrian_3027;
	}
	
	// getter
	public String getNamaPasien_3027() {
		return namaPasien_3027;
	}
	
	public String getPenyakit_3027() {
		return penyakit_3027;
	}
	
	public int getNomorAntrian_3027() {
		return nomorAntrian_3027;
	}
	
	// setter
	public void setNamaPasien_3027(String namaPasien_3027) {
		this.namaPasien_3027 = namaPasien_3027;
	}
	
	public void setPenyakit_3027(String penyakit_3027) {
		this.penyakit_3027 = penyakit_3027;
	}
	
	public void setNomorAntrian_3027(int nomorAntrian_3027) {
		this.nomorAntrian_3027 = nomorAntrian_3027;
	}

}
