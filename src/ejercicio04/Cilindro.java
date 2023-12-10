package ejercicio04;

public class Cilindro {
	//Atributos de la clase para poder realizar los cálculos del áreea y el volúmen
	double radioBase, altura;

	//Constructor sin parámetros
	public Cilindro() {

	}

	//Constructor con parámetros para poder crear objetos de las funciones que se encunetran en la clase cilindro ya que estos son estáticos
	public Cilindro(double radioBase, double altura) {
		this.radioBase = radioBase;
		this.altura = altura;
	}
	
	//Función para calcular el área del cilindro
	public double area() {
		return 2 * Math.PI * radioBase * (altura + radioBase);
	}

	//Función para calcular el volúmen del cilindro
	public double volumen(){
		return Math.PI * Math.pow(radioBase, 2) * altura;
	}
	
}
