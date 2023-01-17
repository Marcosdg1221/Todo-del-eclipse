package ejersisios;

import java.util.*;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner all = new Scanner(System.in); // Abro scanner
		String opcion;
		int tabla[] = new int[10];
		for (int n = 0; n < 10; n++) {
			tabla[n] = (int) (Math.random() * 100);
		}
		System.out.println("Ponga a, b o c para mostrar valor, pedir valores o salir, respectivamente");
		opcion = all.next();

		if (opcion.equals("a")) {
			System.out.println(Arrays.toString(tabla));
		}
		if (opcion.equals("b")) {
			for (int pos = 1; pos < tabla.length; pos++) {// Bucle que identifica la posición y la suma en 1 con cada
															// vuelta hasta llegar a lenght
				System.out.println("Introduce el número para la posición " + pos);
				tabla[pos] = all.nextInt();

			}
		} 
		else if (opcion.equals("c")) {
			System.out.println("Salida");
		} 
		else {
			System.out.println("Letra incorrecta.");
		}
	}
}