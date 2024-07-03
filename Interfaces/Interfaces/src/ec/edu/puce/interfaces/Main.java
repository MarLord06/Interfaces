package ec.edu.puce.interfaces;

public class Main {

	public static void main(String[] args) {
		Rectangulo rectangulo = new Rectangulo();
		rectangulo.setBase(10);
		rectangulo.setAltura(20);
		System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
		
		Triangulo triangulo = new Triangulo();
		triangulo.setBase(7);
		triangulo.setAltura(12);
		System.out.println("Area del Triangulo: " + triangulo.calcularArea());
		
		Circulo circulo = new Circulo();
		
		circulo.setRadio(10);
		System.out.println("Area del Circulo: " + circulo.calcularArea());
		
		

	}

}
