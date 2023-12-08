package ejercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado | Resultado obtenido
 * 20, 5 y 1		 | 50				  | 50
 * 20, 5 y 2		 | 100				  | 100
 * 20, 5 y 0		 | Mensaje de		  | Mensaje de
 * 					 | finalización del   | finalización del
 * 					 | programa 		  | programa
 * 7, 2,4 y 8		 | Mensaje de error	  | Mensaje de error
 * 4y j				 | Mensaje de error y | Mensaje de error y
 * 					 | se vuelve a pedir  | se vuelve a pedir
 * 					 | un número		  | un número 
 * */

public class Main02 {
	
	//Scanner estático para poder usarlo en todas las funciones
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Variable para recoger la opción del menú
		int opc = 0;
		//Variables para guardar el ancho y el alto del rectangulo
		double ancho = 0, alto = 0, resultado = 0;
		//Variable para controlar las repeticiones del bucle 
		boolean repetir = true;
		
		
		//Título del programa
		System.out.println("RECTÁNGULO");
		System.out.println("");
		
		//Llamo a la función pide ancho y alto para recopger una valor númerico con el que realizar las operaciones 
		ancho = pideAncho();
		alto = pideAlto();
		System.out.println("");
		
		//Creo un objeto para poder crear objetos de la clase Rectángulo
		Rectangulo rec = new Rectangulo(ancho, alto);
		
		//Bucle do while que se repetirá mientras no se introduzca 0 u otro número que no se encuentre en el menú
		do {
			
			//Llamo a la funicón menú y guardo su valor en la variable opc, para después saber a que función llamar y saber que calculos hacer
			opc = menu();
			
			/* Utilizo una estructura de if else (ya que me gusta más que un switch case y me resulta más sencillo de entender) que según la 
			 * opción elegida del menú se llamma a una función concreta en la que se realizan los cálculos y se muestran mensajes adecuados a
			 * cada caso*/
			if (opc == 1) {
				resultado = rec.perimetro();
				System.out.println("El perímetro del rectángulo es de: " + resultado + " centímetros");
			}else if (opc == 2) {
				resultado = rec.area();
				System.out.println("El área del rectángulo es de: " + resultado + " centímetros");
			}else if (opc == 0) {
				System.out.println("Se ha pulsado 0");
				System.out.println("El programa ha terminado");
				repetir = false;
			}else {
				System.out.println("Error");
				System.out.println("No se ha elegido ninguna opción del menú");
				System.out.println("El programa ha terminado");
				repetir = false;
			}
			
		}while(repetir);
		
		//Cierro el Scanner
		sc.close();
	}
	
	//Función para mostrar el menú
	public static int menu() {
		//Variable para recoger el valor de la función
		int opc = 0;
		
		//Muestro el menú por pantalla
		System.out.println("MENÚ"
						 + "\nElija una opción:"
						 + "\n1.Perímetro"
						 + "\n2.Área"
						 + "\n0.Salir");
		//Leo el valor de opc del teclado
		opc = sc.nextInt();
		
		//Devuevlo el valor de opc como valor de la función
		return opc;
	}
	
	//Función para pedir el ancho
	public static double pideAncho() {
		//Variable para recoger el valor de la función
		double ancho = 0;
		//Variable para repetir el bucle hasta que se introduzca un valor correcto
		boolean repetir = false;
		
		// Bucle do while para que se repita hasta que se introduzca un valor correcto
		do {
			//Vuelvo a inicializar la variable en false para que no se quede encerrado en un bucle infinito
			repetir = false;
			// Pido que introdyzca un número
			System.out.println("Introduzca un ancho en centímetros para el rectángulo (para los decimales usa comas):");
			// Try catch para que no se introduzcan valores incorrectos
			try {
				ancho = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Se ha introducido un valor incorrecto");
				repetir = true;
			//Finally para limpiar siempre del teclado
			}finally {
				sc.nextLine();
			}
		}while (repetir);
		//Devuelvo el valor de ancho como valor de la función
		return ancho;
	}
	
	//Función para pedir el alto
	public static double pideAlto() {
		//Variable para recoger el valor de la función
		double alto = 0;
		// Variable para repetir el bucle hasta que se introduzca un valor correcto
		boolean repetir = false;
			
		// Bucle do while para que se repita hasta que se introduzca un valor correcto
		do {
			//Vuelvo a inicializar la variable en false para que no se quede encerrado en un bucle infinito
			repetir = false;
			// Pido que introdyzca un número
			System.out.println("Introduzca un alto en centímetros para el rectángulo (para los decimales usa comas):");
			// Try catch para que no se introduzcan valores incorrectos
			try {
				alto = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Se ha introducido un valor incorrecto");
				repetir = true;
			//Finally para limpiar siempre del teclado
			}finally {
				sc.nextLine();
			}
		}while (repetir);
		//Devuelvo el valor de ancho como valor de la función
		return alto;
	}
}