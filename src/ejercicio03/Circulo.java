package ejercicio03;

public class Circulo {
	
	//Atributo de la clase para realizar las operaciones necesrias
	double radio;

	//Constructor sin parámetros
	public Circulo() {
		
	}
	
	//Constructor con parámetros que nos permite crear objetos en la clase main y llamar a las funciones de esta clase
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	//Función que el valor que devuelve es resultado de calcular la circunferencia de un círculo
	public double circunferencia() {
		return 2 * Math.PI * radio;
	}
	
	//Función que el valor que devuelve es resultado de calcular el área de un círculo
	public double area() {
		return Math.PI * Math.pow(radio, 2);
	}
	
}
