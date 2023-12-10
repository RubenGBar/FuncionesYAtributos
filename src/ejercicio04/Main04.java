package ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado | Resultado obtenido
 * 20, 35 y 1 		 | 43982.29715025711  | 43982.29715025711
 * 20, 35 y 2		 | 6911.503837897545  | 6911.503837897545
 * 20, 30 y 0 		 | Mensaje de		  | Mensaje de
 * 					 | finalizaci�n del   | finalizaci�n del
 * 					 | programa 		  | programa
 * 3, 4 y 5			 | Mensaje de error	  | Mensaje de error
 * g 				 | Mensaje de error y | Mensaje de error y
 * 					 | se vuelve a pedir  | se vuelve a pedir
 * 					 | un n�mero		  | un n�mero 
 * 3 y h 			 | Mensaje de error y | Mensaje de error y
 * 					 | se vuelve a pedir  | se vuelve a pedir
 * 					 | un n�mero		  | un n�mero 
 * */

public class Main04 {
	
	//Scanner est�tico para poder usarlo en cualcuier funci�n
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		//Variable donde guardo el valor del radio y la altura del cilindro y que me servir�n para hacer c�clulos
		double radioBase, altura, resultado = 0;
		//Variable donde guardo la opci�n elegida del men� y as� saber a que funci�n llamar
		int opc;
		//Variable para repetir el men� hasta que se introduzca 0 u otro n�mero fuera del men�
		boolean repetir = true;
		
		//T�titulo del programa
		System.out.println("CILINDRO");
		System.out.println(" ");
		
		/*Llamo a la funci�n en la que pido el valor del radio del cilindro y la altura y lo guardo en la variable radioBase y altura 
		 *respectivamente*/
		radioBase = pideRadioBase();
		altura = pideAltura();
		System.out.println(" ");
		
		//Creo un objeto de la clase cilindro para poder llamar a las funciones de esa clase ya que no son est�ticas
		Cilindro cil = new Cilindro(radioBase, altura);
		
		//Bucle do while que se repite hasta que se introduzca 0 o una opci�n fuera del men�
		do {
			
			//Llamo a la funci�n menu y guardo el valor en la variable opc para poder llamar luego adecuadamente a cada funci�n
			opc = menu();
			System.out.println(" ");
			
			/* Utilizo una estructura de if else (ya que me gusta m�s que un switch case y me resulta m�s sencillo de entender) que seg�n la 
			 * opci�n elegida del men� se llamma a una funci�n concreta en la que se realizan los c�lculos y se muestran mensajes adecuados a
			 * cada caso*/
			if(opc == 1) {
				resultado = cil.volumen();
				System.out.println("El vol�men de un cilindro para el cu�l el radio de su base es de " + radioBase + " cms y una altura de "
									+ altura + " cms es de: " + resultado + " cms");
				System.out.println(" ");
			}else if(opc == 2) {
				resultado = cil.area();
				System.out.println("El �rea de un cilindro para el cu�l el radio de su base es de " + radioBase + " cms y una altura de "
						+ altura + " cms es de: " + resultado + " cms");
				System.out.println(" ");
			}else if (opc == 0) {
				System.out.println("Se ha pulsado 0");
				System.out.println("El programa ha terminado");
				repetir = false;
			}else {
				System.out.println("Error, no se ha encontrado ninguna opci�n de men� v�lida");
				System.out.println("El programa ha terminado");
				repetir = false;
			}
			
		}while(repetir);
		
		//Cierro el Scanner
		sc.close();
	}

	/*Funci�n en la que muestro el men� y pido que introduzca una opci�n para saber a que funci�n de la clase cilindro llamar y realizar 
	 *los c�clulos*/
	public static int menu() {
		//Variable en la que guardo el valor de la funci�n
		int opc = 0;
		
		//Muestro el men� y leo la opc del teclado 
		System.out.println("Eliga una opci�n: "
							+ "\n1.Vol�men "
							+ "\n2.�rea "
							+ "\n0.Salir ");
		opc = sc.nextInt();
		
		//Devuelvo opc como valor de la clase
		return opc;
	}
	
	//Funci�n en la que pido que se introduzca el radio de la base y usarlo en el c�lculo de� vol�men y el �rea
	public static double pideRadioBase() {
		//Variable para guardar el valor de la funci�n
		double radioBase = 0;
		//Variable para controlar las repeticiones del bucle para pedir el valor del radio
		boolean repetir;
		
		//Bucle do while para volver a pedir n�mero si se introduce un valor incorrecto
		do {
			//Inicializo la variable en false para no hacer un bucle infinito
			repetir = false;
			//Pido que introduzca un n�mero
			System.out.println("Introduzca el radio la base del cilindro en cent�metros (para los decimales usa comas): ");
			//Try catch para evitar que se introducen datos err�neos como caract�res o cadenas
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
		
		//Devuelvo el valor de radio como valor de la funci�n 
		return radioBase;
	}
	
	//Funci�n en la que pido que se introduzca el radio de la base y usarlo en el c�lculo de� vol�men y el �rea
	public static double pideAltura() {
		//Variable para guardar el valor de la funci�n
		double altura = 0;
		//Variable para controlar las repeticiones del bucle para pedir el valor del radio
		boolean repetir;
		
		//Bucle do while para volver a pedir n�mero si se introduce un valor incorrecto
		do {
			//Inicializo la variable en false para no hacer un bucle infinito
			repetir = false;
			//Pido que introduzca un n�mero
			System.out.println("Introduzca la altura del cilindro en cent�metros (para los decimales usa comas):  ");
			//Try catch para evitar que se introducen datos err�neos como caract�res o cadenas
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
		
		//Devuelvo el valor de radio como valor de la funci�n 
		return altura;
	}
	
}
