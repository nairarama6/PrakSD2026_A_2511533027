package pekan7_2511533027;

public class Mahasiswa_2511533027 {
	private String nama_3027;
	private String nim_3027;
	private String prodi_3027;
	
	// Constructor
	public Mahasiswa_2511533027(String nama_3027, String nim_3027, String prodi_3027) {
        this.nama_3027 = nama_3027;
        this.nim_3027 = nim_3027;
        this.prodi_3027 = prodi_3027;
	}
	
	// Getter
	public String getNama_3027() {
        return nama_3027;
    }
	public String getNim_3027() {
		return nim_3027;
	}
	public String getProdi_3027() {
		return prodi_3027;
	}
	
	// Setter
	public void setNama_3027(String nama_3027) {
        this.nama_3027 = nama_3027;
    }
	public void setNim_3027(String nim_3027) {
		this.nim_3027 = nim_3027;
	}
	public void setProdi_3027(String prodi_3027) {
		this.prodi_3027 = prodi_3027;
	}
	
	// toString
	@Override
	public String toString() {
		return nama_3027;
	}

}
