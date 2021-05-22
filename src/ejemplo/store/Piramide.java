package ejemplo.store;

public class Piramide {

	public double getVolumen(double area, double altura) {
		return (area * altura) / 3;
	}

	public double getVolumen(double ladoA, double ladoB, double altura) {
		return (ladoA * ladoB * altura) / 3;
	}

}
