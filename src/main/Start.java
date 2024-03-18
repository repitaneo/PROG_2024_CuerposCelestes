package main;

import planetas.*;


public class Start {

	public static void main(String[] args) {
		
		
		Planeta tierra = new Planeta("Tierra",1,1);
		Luna luna = new Luna("Luna",1,1);
		Estrella sol = new Estrella("Sol",1,1);
		
		CuerpoCeleste universo[] = new CuerpoCeleste[3];
		universo[0] = tierra;
		universo[1] = luna;
		universo[2] = sol;
		
		for(CuerpoCeleste c:universo) {
			
			System.out.println(c);
			System.out.println(c.tipoCuerpo());
			
			switch(c.tipoCuerpo()) {
			
				case CuerpoCeleste.CODIGO_LUNA: 
						System.out.println("luna");	break;
							
				case CuerpoCeleste.CODIGO_PLANETA:
						System.out.println("planeta");	break;
							
				case CuerpoCeleste.CODIGO_SOL:
						System.out.println("sol"); break;
					
				case CuerpoCeleste.CODIGO_ASTEROIDE:
						System.out.println("asteroide"); break;
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
