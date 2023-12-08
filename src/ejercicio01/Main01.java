package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado | Resultado obtenido
 * 2, 9 y 7			 | 2 				  | 2
 * 1, 8 y 5			 | 13				  | 13
 * 3, 4 y 5			 | 20				  | 20
 * 4, 10 y 2,5		 | 4				  | 4
 * 4, 7 y 0			 | Mensaje que indica | Mensaje que indica
 * 					 | que no se puede 	  | que no se puede
 * 					 | dividir entre 0 	  | dividir entre 0
 * 5, 2 y 2			 | 2 				  | 2
 * 6, 9 y 1			 | 1				  | 1
 * 0, 7 y 7			 | Mensaje con el que | Mensaje con el que
 * 					 | se indica que se ha| se indica que se ha
 * 					 | pulsado 0		  | pulsado 0
 * 9, 4 y 4			 | Mensaje de error	  | Mensaje de error
 * */

public class Main01 {
	
	//Scanner est�tico para poder usarlo en cualquier indistintamente
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*
		 * Variables para recoger el valor del men�, de los n�meros introducidos y del resultado de las operaciones
		 * */
		int menu = 1;
		double num1 = 0, num2 = 0, resultado = 0;

		
		//Bucle while para repetir el programa hasta que se introduzca 0 u otro n�mero fuera del men�
		while (menu <= 6 && menu > 0) {

			/* Llamo a la funci�n men� para elegir que operaci�n hacer */
			menu = menu();
			
			//Llamo a la funci�n pide n�mero dos veces y guardo el valor en dos variables distintas para poder realizar las operaciones
			num1 = pideNumero();
			num2 = pideNumero();
			
			/*Creo el objeto op para poder llamar a las funciones ya que estas no son est�ticas*/
			Operaciones op = new Operaciones(num1, num2);
			
			/*En una variable creo un switch case donde llamo a cada funci�n seg�n el n�mero elejido y defino un caso default ya que al hacer 
			 *el switch de esta forma se necesita de uno*/
			resultado = switch (menu) {
			case 1 -> op.suma();
			case 2 -> op.resta();
			case 3 -> op.multiplicacion();
			case 4 -> op.dividir();
			case 5 -> op.maximo();
			case 6 -> op.minimo();
			default -> Math.sqrt(-1);
			};
			
			/*Muestro un mensaje personalizado seg�n la opci�n elegida en el men� caso del men� y el caso default para cualquier otro 
			 *n�mero elegido incluido el 0*/
			if (menu == 1) {
				System.out.println("\nEl resultado de la suma es: " + resultado + "\n");
			}else if (menu == 2) {
				System.out.println("\nEl resultado de la resta es: " + resultado + "\n");
			}else if (menu == 3) {
				System.out.println("\nEl resultado de la multiplicaci�n es: " + resultado + "\n");
			}else if (menu == 4 && num2 == 0) {
				System.out.println("No se puede dividir entre 0");
			}else if (menu == 4) {
				System.out.println("\nEl resultado de la divisi�n es: " + resultado + "\n");
			}else if (menu == 5) {
				System.out.println("\nEl n�mero m�s grande es: " + resultado + "\n");
			}else if (menu == 6) {
				System.out.println("\nEl n�mero m�s peque�o es: " + resultado + "\n");
			}else if (menu == 0){
				System.out.println("\nSe ha seleccionado 0");
				System.out.println("El programa ha terminado\n");
			}else {
				System.out.println("\nError");
				System.out.println("No se ha encontrado ninguna opci�n del men� seleccionado");
				System.out.println("El programa ha terminado\n");
			}

		}
		
		//Ciero el Scanner
		sc.close();
	}
	
	//Clase donde muestro el men� y leo el valor introducido para despu�s utilizar ese valor en el main
	public static int menu() {
		//Variable donde guardo el valor que devolver� la clase
		int opc = 0;
		
		//Muestro el men� por pantalla
		System.out.println("Elija una opci�n: ");
		System.out.println("1.Suma"
				+ "\n2.Resta"
				+ "\n3.Multiplicaci�n"
				+ "\n4.Divisi�n"
				+ "\n5.M�ximo"
				+ "\n6.M�nimo"
				+ "\n0.Salir");
		//Cambio el valor de la variable de la clase seg�n lo introducido por teclado
		opc = sc.nextInt();
		
		//Devuelvo el valor de opc como valor de la clase
		return opc;
	}
	
	//Clase donde pido el n�mero con el que realizar las operaciones y que luego usar� en el main
	public static double pideNumero() {
		double num = 0; //Variable donde guardo el valor que devolver� la clase
		boolean repetir = false; //Variable que cambio a true solo ser� true cuando se introduzca un valor no v�lido
		
		//Bucle do while que se repite cuando se introduce un valor err�neo
		do {
			//Pido que introduzca un n�mero
			System.out.println("Introduzca un n�mero real (para los decimales usa comas): ");
			
			//Try catch por si se introducide un caracter o un decimal con puntos
			try {
				//Leo el n�mero del teclado
				num = sc.nextDouble();
				
			}catch (InputMismatchException e) {
				
				//Muestro un mensaje de error y cambio la variable a true cuando se introduce un valor err�neo
				System.out.println("El valor introducido es err�neo");
				repetir = true;
				
			//Limpio siempre del teclado sin importar el caso
			}finally {
				sc.nextLine();
			}
			
		}while(repetir);
		
		//La clase devuelve el valor introducido por el teclado
		return num;
	}
	
}
