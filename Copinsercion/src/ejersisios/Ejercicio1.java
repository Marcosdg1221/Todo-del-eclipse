package ejersisios;

import java.util.*;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner all = new Scanner(System.in); //Abro scanner
		int tabla[]=new int [15];
		for (int pos=1;pos<tabla.length;pos++) {//Bucle que identifica la posición y la suma en 1 con cada vuelta hasta llegar a 8
			System.out.println("Introduce el número para la posición " + pos);
			tabla[pos]=all.nextInt();
			
}
		int tabla2[]=Arrays.copyOfRange(tabla, 1, tabla.length-1);
		tabla2[(0)]=tabla[14];
	System.out.println("Orden de las puntuaciones de los jugadores: " + Arrays.toString(tabla2)); 
}
}
//Imprime lo que vayas construyendo en las tablas
//USA TABLA.LENGTH, en lugar de los números
// Copy of copia solo desde la posicion 0, pero array copy desde la que quieras.