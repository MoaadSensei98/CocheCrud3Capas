package test;

import modelo.entidad.Coche;
import modelo.negocio.GestorCoche;

public class TestModificar {
	public static void main(String[] args) {
		Coche coche = new Coche();
		coche.setMarca("Renault");
		coche.setModelo("Capture");
		coche.setKm(50000);
		coche.setMatricula("XXXXXXX");
		
		GestorCoche gc = new GestorCoche();
		
		boolean modificar = gc.modificar(coche);
		if(modificar){
			System.out.println("El coche se ha modificado");
		}else{
			System.out.println("El coche NO se ha modificado");
		}
	}
}
