package nuevoAño;

import java.util.Iterator;
import java.util.Scanner;

public class calcularNota {
	public static void main(String[] args) {
		var lt = new Scanner(System.in);
		System.out.println("**CALCULAR NOTA***");
		int[] nota = new int[3];
		int cont = 0, definitiva = 0;

		for (int i = 0; i < nota.length; i++) {

			System.out.println("digite la nota N." + (i + 1));
			nota[i] = lt.nextInt();
			cont += nota[i];

		}
		definitiva = cont / nota.length;
		var resultado = definitiva >= 350 ? "Aprobado" : "Reprobado";
		System.out.println(" La nota definitiva es " + definitiva + " su estado es " + resultado);

	}
}
