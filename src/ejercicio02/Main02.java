package ejercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado | Resultado obtenido
 * 20, 5 y 1		 | 50				  | 50
 * 20, 5 y 2		 | 100				  | 100
 * 20, 5 y 0		 | Mensaje de		  | Mensaje de
 * 					 | finalizaci�n del   | finalizaci�n del
 * 					 | programa 		  | programa
 * 7, 2,4 y 8		 | Mensaje de error	  | Mensaje de error
 * 4y j				 | Mensaje de error y | Mensaje de error y
 * 					 | se vuelve a pedir  | se vuelve a pedir
 * 					 | un n�mero		  | un n�mero 
 * */

public class Main02 {
	
	//Scanner est�tico para poder usarlo en todas las funciones
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Variable para recoger la opci�n del men�
		int opc = 0;
		//Variables para guardar el ancho y el alto del rectangulo
		double ancho = 0, alto = 0, resultado = 0;
		//Variable para controlar las repeticiones del bucle 
		boolean repetir = true;
		
		
		//T�tulo del programa
		System.out.println("RECT�NGULO");
		System.out.println("");
		
		//Llamo a la funci�n pide ancho y alto para recopger una valor n�merico con el que realizar las operaciones 
		ancho = pideAncho();
		alto = pideAlto();
		System.out.println("");
		
		//Creo un objeto para poder crear objetos de la clase Rect�ngulo
		Rectangulo rec = new Rectangulo(ancho, alto);
		
		//Bucle do while que se repetir� mientras no se introduzca 0 u otro n�mero que no se encuentre en el men�
		do {
			
			//Llamo a la funic�n men� y guardo su valor en la variable opc, para despu�s saber a que funci�n llamar y saber que calculos hacer
			opc = menu();
			
			/* Utilizo una estructura de if else (ya que me gusta m�s que un switch case y me resulta m�s sencillo de entender) que seg�n la 
			 * opci�n elegida del men� se llamma a una funci�n concreta en la que se realizan los c�lculos y se muestran mensajes adecuados a
			 * cada caso*/
			if (opc == 1) {
				resultado = rec.perimetro();
				System.out.println("El per�metro del rect�ngulo es de: " + resultado + " cent�metros");
			}else if (opc == 2) {
				resultado = rec.area();
				System.out.println("El �rea del rect�ngulo es de: " + resultado + " cent�metros");
			}else if (opc == 0) {
				System.out.println("Se ha pulsado 0");
				System.out.println("El programa ha terminado");
				repetir = false;
			}else {
				System.out.println("Error");
				System.out.println("No se ha elegido ninguna opci�n del men�");
				System.out.println("El programa ha terminado");
				repetir = false;
			}
			
		}while(repetir);
		
		//Cierro el Scanner
		sc.close();
	}
	
	//Funci�n para mostrar el men�
	public static int menu() {
		//Variable para recoger el valor de la funci�n
		int opc = 0;
		
		//Muestro el men� por pantalla
		System.out.println("MEN�"
						 + "\nElija una opci�n:"
						 + "\n1.Per�metro"
						 + "\n2.�rea"
						 + "\n0.Salir");
		//Leo el valor de opc del teclado
		opc = sc.nextInt();
		
		//Devuevlo el valor de opc como valor de la funci�n
		return opc;
	}
	
	//Funci�n para pedir el ancho
	public static double pideAncho() {
		//Variable para recoger el valor de la funci�n
		double ancho = 0;
		//Variable para repetir el bucle hasta que se introduzca un valor correcto
		boolean repetir = false;
		
		// Bucle do while para que se repita hasta que se introduzca un valor correcto
		do {
			//Vuelvo a inicializar la variable en false para que no se quede encerrado en un bucle infinito
			repetir = false;
			// Pido que introdyzca un n�mero
			System.out.println("Introduzca un ancho en cent�metros para el rect�ngulo (para los decimales usa comas):");
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
		//Devuelvo el valor de ancho como valor de la funci�n
		return ancho;
	}
	
	//Funci�n para pedir el alto
	public static double pideAlto() {
		//Variable para recoger el valor de la funci�n
		double alto = 0;
		// Variable para repetir el bucle hasta que se introduzca un valor correcto
		boolean repetir = false;
			
		// Bucle do while para que se repita hasta que se introduzca un valor correcto
		do {
			//Vuelvo a inicializar la variable en false para que no se quede encerrado en un bucle infinito
			repetir = false;
			// Pido que introdyzca un n�mero
			System.out.println("Introduzca un alto en cent�metros para el rect�ngulo (para los decimales usa comas):");
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
		//Devuelvo el valor de ancho como valor de la funci�n
		return alto;
	}
}