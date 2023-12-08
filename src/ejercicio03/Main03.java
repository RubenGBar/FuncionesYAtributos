package ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado | Resultado obtenido
 * 20 y 1			 | 125.66370614359172 | 125.66370614359172
 * 20 y 2			 | 1256.6370614359173 | 1256.6370614359173
 * 20 y 0			 | Mensaje de		  | Mensaje de
 * 					 | finalización del   | finalización del
 * 					 | programa 		  | programa
 * 4 y 8			 | Mensaje de error	  | Mensaje de error
 * k 				 | Mensaje de error y | Mensaje de error y
 * 					 | se vuelve a pedir  | se vuelve a pedir
 * 					 | un número		  | un número 
 * */

public class Main03 {
	
	//Escaner estático para poder usarlo en cualquier función
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Variable donde guardo la opción elegida en el menú y por tanto sber a que funciónde la clase circulo llamar
		int opc = 0;
		/*Variable donde guardo el valor del radio de la circunferencia con el que realizar los cálculos y valor del resultado de estas 
		*operaciones*/
		double radio = 0, resultado = 0;
		//Variable para controlar las repeticiones del bucle
		boolean repetir = true;
		
		
		//Título del programa
		System.out.println("CÍRCULO");
		System.out.println(" ");
		
		//Llamo a la función pideRadio y guardo el valor en la variable radio para realizar los cálculos necesarios con ella
		radio = pideRadio();
		System.out.println(" ");
		
		//Creo un objeto de la clase Circulo para poder llamar a sus funciones ya que non son estáticas
		Circulo ci = new Circulo(radio);
		
		
		//Bucle do while para poder salir cuando se pulse 0 u otro númeor que no se encuentre en el menú
		do {
			
			//Llamo a la función menú y guardo el valor en una variable para saber a que función llamar
			opc = menu();
			
			/* Utilizo una estructura de if else (ya que me gusta más que un switch case y me resulta más sencillo de entender) que según la 
			 * opción elegida del menú se llamma a una función concreta en la que se realizan los cálculos y se muestran mensajes adecuados a
			 * cada caso*/
			if (opc == 1) {
				resultado = ci.circunferencia();
				System.out.println("El valor de la circunferencia en centímetros de un círculo de radio " + radio + " es de: " + resultado 
									+ " centímetros");
			}else if (opc == 2) {
				resultado = ci.area();
				System.out.println("El valor del área en centímetros de un círculo de radio " + radio + " es de: " + resultado 
									+ " centímetros");
			}else if (opc == 0) {
				System.out.println("Se ha pulsado 0");
				System.out.println("El programa ha terminado");
				repetir = false;
			}else {
				System.out.println("Error");
				System.out.println("No se ha encontrado una opción de menú válida");
				System.out.println("El programa ha terminado");
				repetir = false;
			}
			
		}while(repetir);
		
	}
	
	//Función donde muestro el menú y leo la opción del teclado
	public static int menu() {
		//Variable para recoger el valor de la función
		int opc = 0;
		
		//Muestro el menú por pantalla
		System.out.println("MENÚ"
						 + "\nElija una opción:"
						 + "\n1.Circunferencia"
						 + "\n2.Área"
						 + "\n0.Salir");
		//Leo el valor de opc del teclado
		opc = sc.nextInt();
		
		//Devuevlo el valor de opc como valor de la función
		return opc;
	}
	
	//Función para leer el valor del radio del círculo con el que realizar los cálculos
	public static double pideRadio() {
		//Variable para recoger el valor de la función
		double radio = 0;
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
				radio = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Se ha introducido un valor incorrecto");
				repetir = true;
			//Finally para limpiar siempre del teclado
			}finally {
				sc.nextLine();
			}
		}while (repetir);
		//Devuelvo el valor de radio como valor de la función
		return radio;
	}
}
