package ejersisios;

import java.util.*;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner all = new Scanner(System.in); // Abro scanner
		int tabla2[]= new int[11];
		int tabla[] = new int[11]; // Creo una tabla llamada jugadores, las cuales serán 10
		for (int pos = 0; pos < 10; pos++) {// Bucle que identifica la posición y la suma en 1 con cada vuelta hasta
											// llegar a 10
			System.out.println("Introduce un número ");
			tabla[pos] = all.nextInt();
		}
		int pos=0;
		int finale=9;
		 for (;pos<10;) {
			 for (int a = 1; a <=9; a++) {
				    // Si es divisible por cualquiera de estos números, no es primo
				    if (tabla[pos] % a == 0) {
				    tabla2[pos]=tabla[finale];
				    finale=finale-1;
				  }
				  // Si no se pudo dividir por ninguno de los de arriba, sí es primo
			 else {
				tabla2[pos]=tabla[pos];
				pos++;}
			 }
			System.out.println(Arrays.toString(tabla2));
		 }
	}
	}