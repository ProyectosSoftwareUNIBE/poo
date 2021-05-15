package ejemplo.cuenta;

public class Matriz {

	public int[] arreglo;

	public Matriz(int[] arreglo) {

		this.arreglo = arreglo;
	}

	public int[] getArreglo() {
		return arreglo;
	}

	public void setArreglo(int[] arreglo) {
		this.arreglo = arreglo;
	}

	public int getHigherNumner() {
		int temporal = arreglo[0];
		for (int i = 1; i < arreglo.length; i++) {
			if (arreglo[i] > temporal) {
				temporal = arreglo[i];
			}

		}
		return temporal;
	}
	
	

}
