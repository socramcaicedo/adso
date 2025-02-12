package nuevoAño;

import java.util.Scanner;

public class placa {

	public static void main(String[] args) {
		var lt = new Scanner(System.in);
		var placa = "";
		var uso = "";
		var numPlaca = 0;
		int[] lunes = { 1, 2, 3, 4 };
		int[] martes = { 5, 6, 7, 8 };
		int[] miercoles = { 9, 0, 1, 2 };
		int[] jueves = { 3, 4, 5, 6 };
		int[] viernes = { 7, 8, 9, 0 };

		System.out.println("DIGITE SU PLACA");
		placa = lt.next();
		uso = placa.substring(4, 5);
		numPlaca = Integer.parseInt(uso);
		System.out.println("_________________________________________________________________________________________________________________________________________");

		for (int i = 0; i < lunes.length; i++) {
			var pyp = numPlaca == lunes[i] ? "aplica" : "";
			System.out.println(pyp);
			if (numPlaca == lunes[i]) {

				System.out.println("LUNES APLICA PICO Y PLACA TERMINADO EN " + numPlaca);
				System.out.println("_________________________________________________________________________________________________________________________________________");
			}
		}

		for (int i = 0; i < martes.length; i++) {
			var pyp = numPlaca == martes[i] ? "aplica" : "";

			if (numPlaca == martes[i]) {

				System.out.println("MARTES APLICA PICO Y PLACA TERMINADO EN " + numPlaca);
				System.out.println("_________________________________________________________________________________________________________________________________________");
				
				
			}
		}

		for (int i = 0; i < miercoles.length; i++) {
			var pyp = numPlaca == miercoles[i] ? "aplica" : "";

			if (numPlaca == miercoles[i]) {

				System.out.println("MIERCOLES APLICA PICO Y PLACA TERMINADO EN " + numPlaca);
				System.out.println("_________________________________________________________________________________________________________________________________________");
			}
		}

		for (int i = 0; i < jueves.length; i++) {
			var pyp = numPlaca == jueves[i] ? "aplica" : "";

			if (numPlaca == jueves[i]) {

				System.out.println("JUEVES APLICA PICO Y PLACA TERMINADO EN " + numPlaca);
				System.out.println("_________________________________________________________________________________________________________________________________________");
			}
		}

		for (int i = 0; i < viernes.length; i++) {
			var pyp = numPlaca == viernes[i] ? "aplica" : "";

			if (numPlaca == viernes[i]) {

				System.out.println("VIERNES APLICA PICO Y PLACA TERMINADO EN " + numPlaca);
				System.out.println("_________________________________________________________________________________________________________________________________________");
			}
		}0
		
		
		
		
		
		
		

	}

}
