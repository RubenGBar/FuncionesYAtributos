package ejercicio02;

public class Rectangulo {
	
	//Atributos de la clase para realizar las operaciones
	double ancho, alto;

	//Constructor sin parámetros
	public Rectangulo() {
		
	}

	//Constructor con parámetros para poder crear objetos de esta clase
	public Rectangulo(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}

	//Función donde calculo el perímetro del rectángulo
	public double perimetro() {
		return 2 * (ancho + alto);
	}
	
	//Función para calcular el área del rectángulo
	public double area() {
		return ancho*alto;
	}
}
