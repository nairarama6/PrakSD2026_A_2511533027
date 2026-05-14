package pekan6_2511533027;

public class Lagu_2511533027 {
	// atribut lagu
    String judul_3027;
    String penyanyi_3027;

    // pointer next dan prev
    Lagu_2511533027 next_3027;
    Lagu_2511533027 prev_3027;

    // constructor
    public Lagu_2511533027(String judul_3027, String penyanyi_3027) {
        this.judul_3027 = judul_3027;
        this.penyanyi_3027 = penyanyi_3027;
        this.next_3027 = null;
        this.prev_3027 = null;
    }
    
    // getter judul
    public String getJudul_3027() {
        return judul_3027;
    }

    // setter judul
    public void setJudul_3027(String judul_3027) {
        this.judul_3027 = judul_3027;
    }

    // getter penyanyi
    public String getPenyanyi_3027() {
        return penyanyi_3027;
    }

    // setter penyanyi
    public void setPenyanyi_3027(String penyanyi_3027) {
        this.penyanyi_3027 = penyanyi_3027;
    }

}
