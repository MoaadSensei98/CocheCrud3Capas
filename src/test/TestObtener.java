package test;

import java.util.List;

import modelo.entidad.Coche;
import modelo.negocio.GestorCoche;

public class TestObtener {
	public static void main(String[] args) {
		GestorCoche gc = new GestorCoche();
		Coche coche = gc.obtener(1);
		System.out.println(coche);
		
		System.out.println("*******************");
		
		List<Coche> listaCoches = gc.listar();
		for(Coche c : listaCoches){
			System.out.println(c);
		}
	}
}
