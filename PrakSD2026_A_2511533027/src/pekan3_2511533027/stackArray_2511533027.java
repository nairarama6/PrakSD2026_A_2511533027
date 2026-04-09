package pekan3_2511533027;

public class stackArray_2511533027 {
	static final int MAX = 1000;
	int top_3027;
	int a_3027[] = new int [MAX];
	boolean isEmpty_3027()
	{
		return (top_3027 < 0);
	}
	stackArray_2511533027()
	{
		top_3027 = -1;
	}
	boolean push_3027(int x)
	{
		if (top_3027 >= (MAX - 1)) {
			 System.out.println("Stack Overflow");
			 return false;
		}
		else {
			a_3027[++top_3027] = x;
			 System.out.println(x + "dimasukkan dalam stack");
			 return true;
		}
	}
	int pop_3027()
	{
		if (top_3027 < 0) {
			 System.out.println("Stack Underflow");
			 return 0;
		}
		else {
			int x = a_3027[top_3027--];
			return x;
	}
	
	}
	int peek_3027()
	{
		if (top_3027 < 0) {
			 System.out.println("Stack Underflow");
			 return 0;
		}
		else {
			int x = a_3027[top_3027];
			return x;
		}
	}
	void print() {
		for(int i = top_3027;i>-1;i--) {
			 System.out.print(" "+ a_3027[i]);
		}
	}
}
