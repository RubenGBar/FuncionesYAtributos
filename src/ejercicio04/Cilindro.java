package ejercicio04;

public class Cilindro {
	//Atributos de la clase para poder realizar los c�lculos del �reea y el vol�men
	double radioBase, altura;

	//Constructor sin par�metros
	public Cilindro() {

	}

	//Constructor con par�metros para poder crear objetos de las funciones que se encunetran en la clase cilindro ya que estos son est�ticos
	public Cilindro(double radioBase, double altura) {
		this.radioBase = radioBase;
		this.altura = altura;
	}
	
	//Funci�n para calcular el �rea del cilindro
	public double area() {
		return 2 * Math.PI * radioBase * (altura + radioBase);
	}

	//Funci�n para calcular el vol�men del cilindro
	public double volumen(){
		return Math.PI * Math.pow(radioBase, 2) * altura;
	}
	
}
