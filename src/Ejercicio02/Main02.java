package Ejercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Valor introducido | Resultado esperado | Resultado obtenido
 *  |  | 
 *  |  | 
 *  |  | 
 *  |  | 
 *  |  | 
 *  |  | 
 *  |  | 
 *  |  | 
 * */

public class Main02 {
	
	//Scanner est�tico para poder usarlo en todas las funciones
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	}
	
	//Funci�n para mostrar el men�
	public static int menu() {
		//Variable para recoger el valor de la funci�n
		int opc = 0;
		
		//Muestro el men� por pantalla
		System.out.println("Elija una opci�n:"
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
		
		//try catch para que no introduzca un valor incorrecto
		System.out.println("Introduzca un n�mero real (para los decimales usa comas):");
		
		//Bucle while para 	ue se repita hasta que se introduzca un valor correcto
		while (repetir) {
			// Try catch para que no se introduzcan valores incorrectos
			try {
				ancho = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Se ha introducido un valor incorrecto");
				repetir = true;
			//Finally para limpiar siempre del teclado
			}finally {
				sc.hasNextLine();
			}
		}
		//Devuelvo el valor de ancho como valor de la funci�n
		return ancho;
	}
	
	//Funci�n para pedir el alto
	public static double pideAlto() {
		//Variable para recoger el valor de la funci�n
		double alto = 0;
		//Variable para repetir el bucle hasta que se introduzca un valor correcto
		boolean repetir = false;
		
		//try catch para que no introduzca un valor incorrecto
		System.out.println("Introduzca un n�mero real (para los decimales usa comas):");
		
		//Bucle while para 	ue se repita hasta que se introduzca un valor correcto
		while (repetir) {
			// Try catch para que no se introduzcan valores incorrectos
			try {
				alto = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Se ha introducido un valor incorrecto");
				repetir = true;
			//Finally para limpiar siempre del teclado
			}finally {
				sc.hasNextLine();
			}
		}
		//Devuelvo el valor de ancho como valor de la funci�n
		return alto;
	}
}