package org.generation.italy;

public class Rettangolo implements IFigura {
	float base, altezza;
	
	
	public Rettangolo(float base, float altezza) {
		super();
		this.base = base;
		this.altezza = altezza;
	}

	@Override
	public float area() {		
		return base*altezza;
	}

	@Override
	public float perimetro() {		
		return (base+altezza)*2;
	}

}
