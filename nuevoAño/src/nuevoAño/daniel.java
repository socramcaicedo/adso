package nuevoAño;

import java.util.Scanner;

public class daniel {
	public static void main(String[] args) {
		System.out.println("quien es mayor el 1 o el dos");
		var edad=0;
		var nombre ="NULL";
		var lt= new Scanner(System.in);
		System.out.println("¿que nombre tienes?");
		nombre= lt.next();
		System.out.println("¿queedad tienes?");
		edad= lt.nextInt();
		System.out.println("tu nombre es "+nombre+"  tienes "+edad+" años");
		
		
		var mayorEd = edad >=18? "ES MAYOR" :"ES MENOR";
		System.out.println(nombre+" "+mayorEd);
	}

}
