package ejersisios;

import java.util.*;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner all = new Scanner(System.in); //Abro scanner
		/*
		 * Las variables que crees en el for, no deberías poner un cambio de este dentro de las operaciones del for, si no dentro de ()
		 * Deberían usar las variables al revés (Pos++ y posit1++ están a la reversa
		 */
		int pos=0;
		int tabla[]=new int [10];
		int tabla2[]=new int [10];
		int pares[]=new int[10]; //tabla solo pares
		int impares[]=new int[10]; //tabla solo impares
		int cpar=0; //numero de pares
		int cimpar=0; //numero de impares
		int guardarcpar=0; //Guarda el valor inicial del par
		int cero=0; //Para impares 
		for (;pos<10;pos++) { //Guardan en dos tablas distintas los pares y los impares
			//También cuentan cúantos pares e impares hay
						tabla[pos]=(int)(Math.random()*100);
					if (tabla[pos]%2==0) {
						pares[cpar]=tabla[pos];
						cpar++;
					}
					else {
						impares[cimpar]=tabla[pos];
						cimpar++;
					}
					guardarcpar=cpar;
					
		}
		for (;cpar>-1;cpar--) {
			tabla2[cpar]=pares[cpar];
		}
		for (;guardarcpar<10;guardarcpar++,cero++) { //Sólo te falta esto, imprimir los impares desde su espacio 0 (de la tabla impares) a la tabla2 
			tabla2[guardarcpar]=impares[cero];
		}
		//Idea: Poner dos arrays más que tenga uno sólo los pares y otro los impares
		//Y luego juntarlos (Usando arrays.lenght)

		System.out.println( Arrays.toString(pares));
		System.out.println( Arrays.toString(impares));
		System.out.println( Arrays.toString(tabla2));
		
	
}}