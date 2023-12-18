package org.generation.italy;

public abstract class Figura {
	
	//metodo astratto=>ogni sottoclasse fornirà la sua versione di "disegna()"
	public abstract void disegna();
	
	//metodo implementato=>comune a tutte le sottoclassi
	public String getTipoFigura() {
		if (this instanceof Cerchio)
			return "Cerchio";
		else if (this instanceof Quadrato)
			return "Quadrato";
		else 
			return "Rettangolo";
	}
}
