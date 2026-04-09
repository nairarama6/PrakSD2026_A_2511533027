package pekan3_2511533027;

public class stackArrayDriver_2511533027 {
	public static void main(String[] args) {
		stackArray_2511533027 s = new stackArray_2511533027();
		s.push_3027(10);
		s.push_3027(20);
		s.push_3027(30);
		 System.out.println(s.pop_3027() + " dikeluarkan dari stack");
		 System.out.println("Elemen teratas adalah :" + s.peek_3027());
		 System.out.println("Elemen pada stack :");
		 s.print();
	}

}
