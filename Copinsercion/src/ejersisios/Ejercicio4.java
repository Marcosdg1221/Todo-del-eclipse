package ejersisios;

import java.util.*;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner all = new Scanner(System.in);
		int tablaenteros[]=new int [10];
		for (int cont=0;cont<10;cont++) {
		System.out.println("pon un numero");
		tablaenteros[cont]=all.nextInt();
		}
		System.out.println(Arrays.toString(tablaenteros)); //Imprimo el resultado.
		Arrays.sort(tablaenteros);
		int nuevatabla[]=new int [10];
		for (int cont=0;cont<10;cont++) {
			nuevatabla[cont]=tablaenteros[cont];
			Arrays.binarySearch(tablaenteros, cont);
				}
		System.out.println(Arrays.toString(nuevatabla)); //Imprimo el resultado.
	}
}