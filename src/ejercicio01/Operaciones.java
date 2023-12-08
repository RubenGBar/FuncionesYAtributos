package ejercicio01;

//Clase con todas las funciones
public class Operaciones {
	//Atributos de la clase para hacer las operaciones
	double num1, num2;
	//Constructror sin par�metros
	public Operaciones() {
			
	}
	
	//Constructor con par�metros para poder crear objetos y as� llamar a las funciones de esta clase
	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//Funci�n donde sumo los n�meros
	public double suma() {
		return num1 + num2;
	}
	
	//Funci�n donde resto los n�meros
	public double resta() {
		return num1 - num2;
	}
	
	//Funci�n donde multiplico los n�meros 
	public double multiplicacion() {
		return num1 * num2;
	}
	
	//Funci�n donde divido los n�meros 
	public double dividir() {
		return num1 / num2;
	}
	
	//Funci�n donde devuelvo el n�mero m�s grande 
	public double maximo() {
		return num1 > num2 ? num1 : num2;
	}
	
	//Funci�n donde devuelvo el n�mero m�s peque�o
	public double minimo() {
		return num1 > num2 ? num2 : num1;
	}
	
}
