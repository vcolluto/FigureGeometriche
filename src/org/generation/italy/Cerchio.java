package org.generation.italy;

public class Cerchio extends Figura implements IFigura,IColore {
	float raggio;
	
	//costruttore	
	public Cerchio(float raggio) {
		super();
		this.raggio = raggio;
	}

	@Override
	public float area() {		
		return piGreco*raggio*raggio;
	}

	@Override
	public float perimetro() {		
		return 2*piGreco*raggio;
	}

	@Override
	public void disegna() {		
		System.out.println("  - -  ");
		System.out.println(" -   -  ");
		System.out.println("  - -   ");		
	}

	@Override
	public void colora() {
		System.out.println("Rosso");
		
	}

	
	

}
