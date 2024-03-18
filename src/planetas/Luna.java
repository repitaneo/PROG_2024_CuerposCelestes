package planetas;

import gravedad.MovimientoPlanetario;

public class Luna extends CuerpoCeleste 
	implements MovimientoPlanetario {

	
	public static final float TRASLACION = 1234523.4f;
	public static final float ROTACION = 34523.4f;
	public static final int DIA = 29;
	public static final int ANIO = 29;
	
	
	private double distanciaPlaneta;
	
	
	public Luna(String nombre, double masa,double distanciaPlaneta) {
		super(nombre, masa);
		setDistanciaPlaneta(distanciaPlaneta);
	}
	
	

	
	
	public double getDistanciaPlaneta() {
		return distanciaPlaneta;
	}
	public void setDistanciaPlaneta(double distanciaPlaneta) {
		
		if(distanciaPlaneta<300000) {
			distanciaPlaneta=300000;
		}
		this.distanciaPlaneta = distanciaPlaneta;
	}
	public void setMasa(double masa) { 
		if(masa<50000) {
			super.setMasa(50000);
		}
		else super.setMasa(masa);
	}




	@Override
	public int tipoCuerpo() {
		
		return CuerpoCeleste.CODIGO_LUNA;
	}





	@Override
	public String toString() {
		return "Luna [{" + distanciaPlaneta + "} " + getNombre() + " ("
				+ getMasa() + ")]";
	}





	@Override
	public float velocidadTraslacion() {
		return Luna.TRASLACION;
	}
	@Override
	public float velocidadRotacion() {
		return Luna.ROTACION;
	}
	@Override
	public int duracionDias() {
		return Luna.DIA;
	}
	@Override
	public int duracionAnio() {
		return Luna.ANIO;
	}

	
	
	
}
