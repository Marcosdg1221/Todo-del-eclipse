package ejersisios;

import java.util.*;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner all = new Scanner(System.in); // Abro scanner
	int opciones[]=new int[3];
	System.out.println("Ponga el primer nº");
	opciones[0]= all.nextInt();
	System.out.println("Ponga el segundo nº que será su incremento");
	opciones[1]= all.nextInt();
	System.out.println("¿Cuántas veces quieres incrementar?");
	opciones[2]= all.nextInt();
	for (;opciones[2]>0;opciones[2]--) {
	System.out.println(opciones[0]);
	opciones[0]=opciones[0]+opciones[1];
	}
}
}