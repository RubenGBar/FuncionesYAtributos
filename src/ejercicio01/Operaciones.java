package ejercicio01;

//Clase con todas las funciones
public class Operaciones {
	//Atributos de la clase para hacer las operaciones
	double num1, num2;
	//Constructror sin parámetros
	public Operaciones() {
			
	}
	
	//Constructor con parámetros para poder crear objetos y así llamar a las funciones de esta clase
	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//Función donde sumo los números
	public double suma() {
		return num1 + num2;
	}
	
	//Función donde resto los números
	public double resta() {
		return num1 - num2;
	}
	
	//Función donde multiplico los números 
	public double multiplicacion() {
		return num1 * num2;
	}
	
	//Función donde divido los números 
	public double dividir() {
		return num1 / num2;
	}
	
	//Función donde devuelvo el número más grande 
	public double maximo() {
		return num1 > num2 ? num1 : num2;
	}
	
	//Función donde devuelvo el número más pequeño
	public double minimo() {
		return num1 > num2 ? num2 : num1;
	}
	
}
