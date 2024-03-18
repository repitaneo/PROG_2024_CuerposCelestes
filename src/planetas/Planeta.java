package planetas;

public class Planeta extends CuerpoCeleste {

	private int lunas;
	
	
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
	
	
}
