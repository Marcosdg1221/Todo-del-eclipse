package ejersisios;

import java.util.*;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner all = new Scanner(System.in); // Abro scanner
		int tablacien[]=new int[100];
		int tablareves[]=new int[100];
		for (int num=1; num<100;num++) {
			tablacien[num-1]=num;
		}
		tablacien[99]=100;
		System.out.println( Arrays.toString(tablacien));
		for (int num=0, n=99;num<100;num++,n--) {
			tablareves[num]=tablacien[n];
		}
		System.out.println( Arrays.toString(tablareves));
	}
}