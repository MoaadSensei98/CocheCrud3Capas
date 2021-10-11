package test;

import modelo.negocio.GestorCoche;

public class TestBaja {
	public static void main(String[] args) {
		GestorCoche gc = new GestorCoche();
		
		boolean baja = gc.baja(5);
		if(baja){
			System.out.println("El coche se ha eliminado");
		}else{
			System.out.println("El coche NO se ha eliminado");
		}
	}
}
