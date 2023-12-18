package org.generation.italy;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<IFigura> elencoFigure=new ArrayList<IFigura>(); //nella lista ci può andare qualsiasi oggetto che estende la classe Figura 
				
		elencoFigure.add(new Rettangolo(20,30));
		elencoFigure.add(new Cerchio(15));
		elencoFigure.add(new Quadrato(8));
		

		
		for (IFigura f:elencoFigure)
		{
			System.out.println("Tipo figura: "+((Figura)f).getTipoFigura());
			((Figura) f).disegna();
			if (f instanceof Cerchio)
				System.out.println("Cerchio di raggio: " + ((Cerchio) f).raggio);	
			else if (f instanceof Quadrato)
				System.out.println("Quadrato di lato: "+((Quadrato) f).lato);
			if (f instanceof Rettangolo)
				System.out.println("Rettangolo di base: "+((Rettangolo) f).base +" e altezza: "+((Rettangolo) f).altezza);
			System.out.println("L'area è: "+f.area());
			System.out.println("Il perimetro è: "+f.perimetro());
			
			System.out.println();
		}
		
	}

}
