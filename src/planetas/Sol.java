package planetas;

public class Sol extends CuerpoCeleste {

	private int brillo;
	
	public Sol(String nombre, double masa,int brillo) {
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





	@Override
	public int tipoCuerpo() {
		
		return CuerpoCeleste.CODIGO_SOL;
	}

}
