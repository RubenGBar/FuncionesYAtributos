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
		
		System.out.println("Elija una opción: ");
		System.out.println("1.Suma"
				+ "\n2.Resta"
				+ "\n3.Multiplicación"
				+ "\n4.División"
				+ "\n5.Máximo"
				+ "\n6.Mínimo"
				+ "\n0.Salir");
		opc = sc.nextInt();
		
		sc.close();
		
		return opc;
	}
	
	public static double pideNumero() {
		double num = 0;
		
		do {
			
			System.out.println("Introduzca un número real (para los decimales usa puntos): ");
			
			try {
				
				num = sc.nextDouble();
				
			}catch (InputMismatchException e) {
				
				System.out.println("El valor introducido es erróneo");
				num = Math.sqrt(-1);
				
			}
			
		}while(num == Math.sqrt(-1));
		
		return num;
	}
	
}
