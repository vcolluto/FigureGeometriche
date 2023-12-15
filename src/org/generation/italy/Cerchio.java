package org.generation.italy;

public class Cerchio implements IFigura {
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

	public void disegna() {
		System.out.println("O");
	}
	

}
