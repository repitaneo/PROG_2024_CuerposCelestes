package planetas;

public abstract class CuerpoCeleste {

	
	private String nombre;
	private double masa;	
	
	
	public CuerpoCeleste(String nombre, double masa) {
		super();
		this.nombre = nombre;
		setMasa(masa);
	}
	
	
	public abstract int tipoCuerpo();
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getMasa() {
		return masa;
	}
	public void setMasa(double masa) {
		this.masa = masa;
	}
	
	
	@Override
	public String toString() {
		return "CuerpoCeleste [" + nombre + " (" + masa + ")]";
	}

	
	
	
	
	
	
}
