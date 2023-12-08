package ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado | Resultado obtenido
 * 20 y 1			 | 125.66370614359172 | 125.66370614359172
 * 20 y 2			 | 1256.6370614359173 | 1256.6370614359173
 * 20 y 0			 | Mensaje de		  | Mensaje de
 * 					 | finalizaci�n del   | finalizaci�n del
 * 					 | programa 		  | programa
 * 4 y 8			 | Mensaje de error	  | Mensaje de error
 * k 				 | Mensaje de error y | Mensaje de error y
 * 					 | se vuelve a pedir  | se vuelve a pedir
 * 					 | un n�mero		  | un n�mero 
 * */

public class Main03 {
	
	//Escaner est�tico para poder usarlo en cualquier funci�n
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Variable donde guardo la opci�n elegida en el men� y por tanto sber a que funci�nde la clase circulo llamar
		int opc = 0;
		/*Variable donde guardo el valor del radio de la circunferencia con el que realizar los c�lculos y valor del resultado de estas 
		*operaciones*/
		double radio = 0, resultado = 0;
		//Variable para controlar las repeticiones del bucle
		boolean repetir = true;
		
		
		//T�tulo del programa
		System.out.println("C�RCULO");
		System.out.println(" ");
		
		//Llamo a la funci�n pideRadio y guardo el valor en la variable radio para realizar los c�lculos necesarios con ella
		radio = pideRadio();
		System.out.println(" ");
		
		//Creo un objeto de la clase Circulo para poder llamar a sus funciones ya que non son est�ticas
		Circulo ci = new Circulo(radio);
		
		
		//Bucle do while para poder salir cuando se pulse 0 u otro n�meor que no se encuentre en el men�
		do {
			
			//Llamo a la funci�n men� y guardo el valor en una variable para saber a que funci�n llamar
			opc = menu();
			
			/* Utilizo una estructura de if else (ya que me gusta m�s que un switch case y me resulta m�s sencillo de entender) que seg�n la 
			 * opci�n elegida del men� se llamma a una funci�n concreta en la que se realizan los c�lculos y se muestran mensajes adecuados a
			 * cada caso*/
			if (opc == 1) {
				resultado = ci.circunferencia();
				System.out.println("El valor de la circunferencia en cent�metros de un c�rculo de radio " + radio + " es de: " + resultado 
									+ " cent�metros");
			}else if (opc == 2) {
				resultado = ci.area();
				System.out.println("El valor del �rea en cent�metros de un c�rculo de radio " + radio + " es de: " + resultado 
									+ " cent�metros");
			}else if (opc == 0) {
				System.out.println("Se ha pulsado 0");
				System.out.println("El programa ha terminado");
				repetir = false;
			}else {
				System.out.println("Error");
				System.out.println("No se ha encontrado una opci�n de men� v�lida");
				System.out.println("El programa ha terminado");
				repetir = false;
			}
			
		}while(repetir);
		
	}
	
	//Funci�n donde muestro el men� y leo la opci�n del teclado
	public static int menu() {
		//Variable para recoger el valor de la funci�n
		int opc = 0;
		
		//Muestro el men� por pantalla
		System.out.println("MEN�"
						 + "\nElija una opci�n:"
						 + "\n1.Circunferencia"
						 + "\n2.�rea"
						 + "\n0.Salir");
		//Leo el valor de opc del teclado
		opc = sc.nextInt();
		
		//Devuevlo el valor de opc como valor de la funci�n
		return opc;
	}
	
	//Funci�n para leer el valor del radio del c�rculo con el que realizar los c�lculos
	public static double pideRadio() {
		//Variable para recoger el valor de la funci�n
		double radio = 0;
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
				radio = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Se ha introducido un valor incorrecto");
				repetir = true;
			//Finally para limpiar siempre del teclado
			}finally {
				sc.nextLine();
			}
		}while (repetir);
		//Devuelvo el valor de radio como valor de la funci�n
		return radio;
	}
}
