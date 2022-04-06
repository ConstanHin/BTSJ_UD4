package pk_TA4_5;

public class Cinco {

	public static void main(String[] args) {
		// Reasignación de variables
		
		int A = 0;
		int B = 1;
		int C = 2;
		int D = 3;
		
		B = C;
		C = A;
		A = D;
		D = B;
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
		
	}

}
