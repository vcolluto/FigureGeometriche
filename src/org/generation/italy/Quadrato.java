package org.generation.italy;

public class Quadrato extends Figura implements IFigura{
	float lato;
	
	
	public Quadrato(float lato) {
		super();
		this.lato = lato;
	}

	@Override
	public float area() {
		return lato*lato;
	}

	@Override
	public float perimetro() {		
		return lato*4;
	}

	@Override
	public void disegna() {
		System.out.println(" ----");
		System.out.println(" -  -");
		System.out.println(" ----");	
		
	}

}
