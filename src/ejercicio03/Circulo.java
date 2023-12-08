package ejercicio03;

public class Circulo {
	
	//Atributo de la clase para realizar las operaciones necesrias
	double radio;

	//Constructor sin par�metros
	public Circulo() {
		
	}
	
	//Constructor con par�metros que nos permite crear objetos en la clase main y llamar a las funciones de esta clase
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	//Funci�n que el valor que devuelve es resultado de calcular la circunferencia de un c�rculo
	public double circunferencia() {
		return 2 * Math.PI * radio;
	}
	
	//Funci�n que el valor que devuelve es resultado de calcular el �rea de un c�rculo
	public double area() {
		return Math.PI * Math.pow(radio, 2);
	}
	
}
