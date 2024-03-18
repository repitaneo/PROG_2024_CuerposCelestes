package planetas;

public class Luna extends CuerpoCeleste {

	
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

}