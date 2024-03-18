package planetas;

public class Planeta extends CuerpoCeleste implements
	gravedad.MovimientoPlanetario {

	private int lunas;
	
	public static final float TRASLACION = 43534543.4f;
	public static final float ROTACION = 34534534.4f;
	public static final int DIA = 24;
	public static final int ANIO = 365;	
	
	public Planeta(String nombre, double masa, int lunas) {
		
		super(nombre,masa);
		setLunas(lunas);
	}


	public int getLunas() {
		return lunas;
	}
	public void setLunas(int lunas) {
		if(lunas<0) {
			lunas = 0;
		}
		else if(lunas>15) {
			lunas = 15;
		}
		else this.lunas = lunas;
	}
	public void setMasa(double masa) { 
		if(masa<1000000) {
			super.setMasa(1000000);
		}
		else super.setMasa(masa);
	}


	@Override
	public int tipoCuerpo() {
		
		return CuerpoCeleste.CODIGO_PLANETA;
	}
	
	
	@Override
	public String toString() {
		return "Planeta [{" + lunas + "} " + getNombre() + " ("
				+ getMasa() + ")]";
	}


	@Override
	public float velocidadTraslacion() {
		return Planeta.TRASLACION;
	}
	@Override
	public float velocidadRotacion() {
		return Planeta.ROTACION;
	}
	@Override
	public int duracionDias() {
		return Planeta.DIA;
	}
	@Override
	public int duracionAnio() {
		return Planeta.ANIO;
	}	
	
}
