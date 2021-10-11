package test;

import modelo.entidad.Coche;
import modelo.negocio.GestorCoche;

public class TestAlta {
	public static void main(String[] args) {
		Coche coche = new Coche();
		coche.setMarca("Audi");
		coche.setModelo("RS7");
		coche.setKm(50000);
		coche.setMatricula("77777");

		GestorCoche gc = new GestorCoche();
		boolean alta = gc.alta(coche);
		if(alta){
			System.out.println("El coche se ha incluido");
		}else{
			System.out.println("El coche NO se ha incluido");
		}
	}
}
