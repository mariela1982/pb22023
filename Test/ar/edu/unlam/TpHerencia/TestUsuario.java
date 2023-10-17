package ar.edu.unlam.TpHerencia;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUsuario {

	@Test
	public void queSePuedaCrearUnUsuario() {
		String nombre = "carla";
		Integer edad = 35;
		Double peso = 78.50;
		Double altura  = 1.60;
		
		Usuario nuevo = new Usuario(nombre, edad,peso,altura);
		
		assertNotNull(nuevo);
	}

}
