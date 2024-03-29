package planetas;

public class Estrella extends CuerpoCeleste {

	private int brillo;
	
	public Estrella(String nombre, double masa,int brillo) {
		super(nombre, masa);
		setBrillo(brillo);
	}

	
	
	
	
	public int getBrillo() {
		return brillo;
	}
	public void setBrillo(int brillo) {
		if(brillo<5) {
			this.brillo = 5;
		}
		else this.brillo = brillo;
	}
	public void setMasa(double masa) { 
		if(masa<50000000000d) {
			super.setMasa(50000000000d);
		}
		else super.setMasa(masa);
	}




	@Override
	public int tipoCuerpo() {
		
		return CuerpoCeleste.CODIGO_SOL;
	}
	
	
	@Override
	public String toString() {
		return "Sol [{" + brillo + "} " + getNombre() + " ("
				+ getMasa() + ")]";
	}	

}
