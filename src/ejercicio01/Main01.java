package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main01 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int menu;
		double num1, num2;
		
		
		menu = menu();
		
		
		
		while (menu != 0) {

			if (menu == 0) {

				System.out.println("El programa ha finalizado");

			} else {
				num1 = pideNumero();
				num2 = pideNumero();

				switch (menu) {
				case 1 -> System.out.println("Place Holder");
				}
			}
		}
	}

	public static int menu() {
		int opc = 0;
		
		System.out.println("Elija una opci�n: ");
		System.out.println("1.Suma"
				+ "\n2.Resta"
				+ "\n3.Multiplicaci�n"
				+ "\n4.Divisi�n"
				+ "\n5.M�ximo"
				+ "\n6.M�nimo"
				+ "\n0.Salir");
		opc = sc.nextInt();
		
		sc.close();
		
		return opc;
	}
	
	public static double pideNumero() {
		double num = 0;
		
		do {
			
			System.out.println("Introduzca un n�mero real (para los decimales usa puntos): ");
			
			try {
				
				num = sc.nextDouble();
				
			}catch (InputMismatchException e) {
				
				System.out.println("El valor introducido es err�neo");
				num = Math.sqrt(-1);
				
			}
			
		}while(num == Math.sqrt(-1));
		
		return num;
	}
	
}
