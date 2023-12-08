package ejercicio02;

public class Rectangulo {
	
	//Atributos de la clase para realizar las operaciones
	double ancho, alto;

	//Constructor sin par�metros
	public Rectangulo() {
		
	}

	//Constructor con par�metros para poder crear objetos de esta clase
	public Rectangulo(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
	}

	//Funci�n donde calculo el per�metro del rect�ngulo
	public double perimetro() {
		return 2 * (ancho + alto);
	}
	
	//Funci�n para calcular el �rea del rect�ngulo
	public double area() {
		return ancho*alto;
	}
}
