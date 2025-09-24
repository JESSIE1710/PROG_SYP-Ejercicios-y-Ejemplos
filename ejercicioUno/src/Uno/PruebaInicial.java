package Uno;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaInicial {
	/*
	 * crea un programa que les introduzca un numero entero con la
	 * clase Scanner. si se introduce un numero de otro tipo o un caracter,
	 * se llama una excepcion InputInputMismatchException...., que sera xapturada por el bloque catch.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Intrduzca un numero entero");
		try {
		int elentero = sc.nextInt();
		System.out.println(" has introducido : " + elentero);
		} catch (InputMismatchException IE) {
			System.out.println("Ha introducido algo que no es un entero . ");
			
		}
		//
	}

}
