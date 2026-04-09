package pekan3_2511533027;

import java.util.ArrayList;

 class Siswa_2511533027 {
	String nama_3027;
	int nim_3027;
	
	public Siswa_2511533027(String nama_3027, int nim_3027) {
		this.nama_3027 = nama_3027;
		this.nim_3027 = nim_3027;
	}
	
	@Override
	public String toString() {
		return "Nim: " + nim_3027 + ", Nama: " + nama_3027;
	}

}
public class SiswaStack_2511533027 {
	private ArrayList<Siswa_2511533027> stack;
	
	public SiswaStack_2511533027() {
		stack = new ArrayList<>();
	}
	
	public void push_3027(Siswa_2511533027 mhs) {
		stack.add(mhs);
	}
	
	public Siswa_2511533027 pop_3027() {
		if (!isEmpty_3027()) {
			return stack.remove(stack.size() - 1);
		}
		return null;
	}
	
	public Siswa_2511533027 peek_3027() {
		if (!isEmpty_3027()) {
			return stack.get(stack.size() - 1);
		}
		return null;
	}
	
	public boolean isEmpty_3027() {
		return stack.isEmpty();
	}
	
	public void tampilkanSiswa_2511533027() {
		for (int i = stack.size() - 1; i >= 0; i--) {
			 System.out.println(stack.get(i));
		}
	}
	public static void main(String[] args) {
		SiswaStack_2511533027 studentStack = new SiswaStack_2511533027();
		
		Siswa_2511533027 mhs1 = new Siswa_2511533027("Ali", 1);
		Siswa_2511533027 mhs2 = new Siswa_2511533027("Boby", 2);
		Siswa_2511533027 mhs3 = new Siswa_2511533027("Charles", 3);
		
		studentStack.push_3027(mhs1);
		studentStack.push_3027(mhs2);
		studentStack.push_3027(mhs3);
		
		 System.out.println("Siswa di dalam stack:");
		 studentStack.tampilkanSiswa_2511533027();
		 
		 System.out.println("siswa teratas " + studentStack.peek_3027());
		 System.out.println("mengeluarkan siswa teratas dari stack: " + studentStack.pop_3027());
		 System.out.println("daftar siswa setelah di pop :");
		 studentStack.tampilkanSiswa_2511533027();
	}
}
