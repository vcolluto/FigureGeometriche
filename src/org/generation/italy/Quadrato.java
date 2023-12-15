package org.generation.italy;

public class Quadrato implements IFigura{
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

}
