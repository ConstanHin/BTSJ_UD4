package pk_TA4_3;

public class TresMostrarPorPantalla {

	public static void main(String[] args) {

		// Mostrar por consola los valores

		int X = 1;
		int Y = 2;

		double N = 3.3;
		double M = 3.4;

		// Operaciones de X $ Y
		System.out.println("La suma de X + Y" + (X + Y));
		System.out.println("La diferencia de X - Y" + (X - Y));
		System.out.println("El producto de X * Y" + (X * Y));
		System.out.println("El cociente de X / Y" + (X / Y));
		System.out.println("El resto de X % Y" + (X % Y));

		// Operaciones de N % M
		System.out.println("La suma de N + M" + (N + M));
		System.out.println("La diferencia de N - M" + (N - M));
		System.out.println("El producto de N * M" + (N * M));
		System.out.println("El cociente de N / M" + (N / M));
		System.out.println("El resto de N % M" + (N % M));

		System.out.println("La suma de X + N" + (X + N));
		System.out.println("El cociente de Y / M" + (Y / M));
		System.out.println("El resto de Y % M" + (Y % M));

		// El doble de cada variable
		
		System.out.println("El doble de X:" + (X*2));
		System.out.println("El doble de Y:" + (Y*2));
		System.out.println("El doble de N:" + (N*2));
		System.out.println("El doble de M:" + (M*2));
		
		// La suma de todas las variables
		// El producto de todas las variables
		System.out.println("La suma de todas las variables:" + (X + Y + N + M));
		System.out.println("El producto de todas las variables:" + (X * Y * N * M));
		

	}

}
