package ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado | Resultado obtenido
 * 20, 35 y 1 		 | 43982.29715025711  | 43982.29715025711
 * 20, 35 y 2		 | 6911.503837897545  | 6911.503837897545
 * 20, 30 y 0 		 | Mensaje de		  | Mensaje de
 * 					 | finalización del   | finalización del
 * 					 | programa 		  | programa
 * 3, 4 y 5			 | Mensaje de error	  | Mensaje de error
 * g 				 | Mensaje de error y | Mensaje de error y
 * 					 | se vuelve a pedir  | se vuelve a pedir
 * 					 | un número		  | un número 
 * 3 y h 			 | Mensaje de error y | Mensaje de error y
 * 					 | se vuelve a pedir  | se vuelve a pedir
 * 					 | un número		  | un número 
 * */

public class Main04 {
	
	//Scanner estático para poder usarlo en cualcuier función
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		//Variable donde guardo el valor del radio y la altura del cilindro y que me servirán para hacer cáclulos
		double radioBase, altura, resultado = 0;
		//Variable donde guardo la opción elegida del menú y así saber a que función llamar
		int opc;
		//Variable para repetir el menú hasta que se introduzca 0 u otro número fuera del menú
		boolean repetir = true;
		
		//T´titulo del programa
		System.out.println("CILINDRO");
		System.out.println(" ");
		
		/*Llamo a la función en la que pido el valor del radio del cilindro y la altura y lo guardo en la variable radioBase y altura 
		 *respectivamente*/
		radioBase = pideRadioBase();
		altura = pideAltura();
		System.out.println(" ");
		
		//Creo un objeto de la clase cilindro para poder llamar a las funciones de esa clase ya que no son estáticas
		Cilindro cil = new Cilindro(radioBase, altura);
		
		//Bucle do while que se repite hasta que se introduzca 0 o una opción fuera del menú
		do {
			
			//Llamo a la función menu y guardo el valor en la variable opc para poder llamar luego adecuadamente a cada función
			opc = menu();
			System.out.println(" ");
			
			/* Utilizo una estructura de if else (ya que me gusta más que un switch case y me resulta más sencillo de entender) que según la 
			 * opción elegida del menú se llamma a una función concreta en la que se realizan los cálculos y se muestran mensajes adecuados a
			 * cada caso*/
			if(opc == 1) {
				resultado = cil.volumen();
				System.out.println("El volúmen de un cilindro para el cuál el radio de su base es de " + radioBase + " cms y una altura de "
									+ altura + " cms es de: " + resultado + " cms");
				System.out.println(" ");
			}else if(opc == 2) {
				resultado = cil.area();
				System.out.println("El área de un cilindro para el cuál el radio de su base es de " + radioBase + " cms y una altura de "
						+ altura + " cms es de: " + resultado + " cms");
				System.out.println(" ");
			}else if (opc == 0) {
				System.out.println("Se ha pulsado 0");
				System.out.println("El programa ha terminado");
				repetir = false;
			}else {
				System.out.println("Error, no se ha encontrado ninguna opción de menú válida");
				System.out.println("El programa ha terminado");
				repetir = false;
			}
			
		}while(repetir);
		
		//Cierro el Scanner
		sc.close();
	}

	/*Función en la que muestro el menú y pido que introduzca una opción para saber a que función de la clase cilindro llamar y realizar 
	 *los cáclulos*/
	public static int menu() {
		//Variable en la que guardo el valor de la función
		int opc = 0;
		
		//Muestro el menú y leo la opc del teclado 
		System.out.println("Eliga una opción: "
							+ "\n1.Volúmen "
							+ "\n2.Área "
							+ "\n0.Salir ");
		opc = sc.nextInt();
		
		//Devuelvo opc como valor de la clase
		return opc;
	}
	
	//Función en la que pido que se introduzca el radio de la base y usarlo en el cálculo deñ volúmen y el área
	public static double pideRadioBase() {
		//Variable para guardar el valor de la función
		double radioBase = 0;
		//Variable para controlar las repeticiones del bucle para pedir el valor del radio
		boolean repetir;
		
		//Bucle do while para volver a pedir número si se introduce un valor incorrecto
		do {
			//Inicializo la variable en false para no hacer un bucle infinito
			repetir = false;
			//Pido que introduzca un número
			System.out.println("Introduzca el radio la base del cilindro en centímetros (para los decimales usa comas): ");
			//Try catch para evitar que se introducen datos erróneos como caractéres o cadenas
			try {
				radioBase = sc.nextDouble();
			}catch(InputMismatchException e) {
				System.out.println("Se ha introducido un dato incorrecto");
				repetir = true;
			//Finally para limpiar siempre del teclado
			}finally {
				sc.nextLine();
			}
			
		}while(repetir);
		
		//Devuelvo el valor de radio como valor de la función 
		return radioBase;
	}
	
	//Función en la que pido que se introduzca el radio de la base y usarlo en el cálculo deñ volúmen y el área
	public static double pideAltura() {
		//Variable para guardar el valor de la función
		double altura = 0;
		//Variable para controlar las repeticiones del bucle para pedir el valor del radio
		boolean repetir;
		
		//Bucle do while para volver a pedir número si se introduce un valor incorrecto
		do {
			//Inicializo la variable en false para no hacer un bucle infinito
			repetir = false;
			//Pido que introduzca un número
			System.out.println("Introduzca la altura del cilindro en centímetros (para los decimales usa comas):  ");
			//Try catch para evitar que se introducen datos erróneos como caractéres o cadenas
			try {
				altura = sc.nextDouble();
			}catch(InputMismatchException e) {
				System.out.println("Se ha introducido un dato incorrecto");
				repetir = true;
			//Finally para limpiar siempre del teclado
			}finally {
				sc.nextLine();
			}
			
		}while(repetir);
		
		//Devuelvo el valor de radio como valor de la función 
		return altura;
	}
	
}
