package pekan3_2511533027;

public class Website_2511533027 {
	private String judul_3027;
	private String url_3027;
	
	// Constructor
	public Website_2511533027(String judul_3027, String url_3027) {
		this.judul_3027 = judul_3027;
		this.url_3027 = url_3027;
	}
	
	// Getter
	public String getJudul_3027() {
		return judul_3027;
	}
	public String getUrl_3027() {
		return url_3027;
	}
	
	// Setter
	public void setJudul_3027(String judul_3027) {
		this.judul_3027 = judul_3027;
	}
	public void setUrl_3027(String url_3027) {
		this.url_3027 = url_3027;
	}
	
	@Override
	public String toString() {
		return "Judul: " + judul_3027 + ", URRL: " + url_3027;
	}

}
