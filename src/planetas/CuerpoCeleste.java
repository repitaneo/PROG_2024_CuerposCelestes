package planetas;

public abstract class CuerpoCeleste {

	public static final int CODIGO_PLANETA = 100; 
	public static final int CODIGO_LUNA = 200; 
	public static final int CODIGO_SOL = 300; 
	public static final int CODIGO_PLANETOIDE = 400; 
	public static final int CODIGO_GEMA_DEL_INFINITO = 500; 
	public static final int CODIGO_ASTEROIDE = 600; 
	
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
