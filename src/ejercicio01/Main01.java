package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main01 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int menu;
		double num1, num2, resultado = 0;
		
		
		menu = menu();
		
		
		while (resultado != 0) {
		num1 = pideNumero();
		num2 = pideNumero();

		Operaciones op = new Operaciones(num1, num2);
		
		resultado = switch (menu) {
		case 1 -> op.suma();
		case 2 -> op.resta();
		case 3 -> op.multiplicacion();
		case 4 -> op.dividir();
		case 5 -> op.maximo();
		case 6 -> op.minimo();
		default -> Math.sqrt(-1);
		};
		}
		
		sc.close();
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
				
			}finally {
				sc.nextLine();
			}
			
		}while(num == Math.sqrt(-1));
		
		return num;
	}
	
}
