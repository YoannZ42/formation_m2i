package service;

public class Nombre {

	private int monNombre;
	
	public Nombre(int pMonNombre) {
		this.monNombre = pMonNombre;
	}
	
	public int getMonNombre() {
		return monNombre;
	}

	public void setMonNombre(int monNombre) {
		this.monNombre = monNombre;
	}

	public static int addIntegers(int n1, int n2) {
		return n1 + n2;
	}
		
	public Nombre multiplication(Nombre n) {
		this.monNombre = n.getMonNombre() * this.monNombre;
		
		return this;
	}
	
	public Nombre square() {
		return null;
	}
	
	public Nombre division(Nombre n) {
		
		this.monNombre = this.monNombre / n.getMonNombre();
		
		return this;
	}
	
	public Nombre pow(Nombre n) {
		this.monNombre = (int) Math.pow(this.monNombre, n.getMonNombre());
		return this;
	}
	
	public Nombre log2(Nombre n) {
		return null;
	}
	
	public Nombre fibonacci(int nieme) {
		return this;
	}
	
}
