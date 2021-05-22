package ejemplo.herencia;

public class Triangulo implements FiguraInterface {

	private double base, altura;

	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
		

	public Triangulo() {
		super();
	}



	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		return (base * altura) / 2;
	}
	
	

}
