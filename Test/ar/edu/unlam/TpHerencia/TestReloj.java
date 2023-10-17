package ar.edu.unlam.TpHerencia;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestReloj {

	@Test
	public void queSePuedaInicializarElReloj() {
		String nombre = "casio";
		String nombre1 = "carla";
		Integer edad = 35;
		Double peso = 78.50;
		Double altura  = 1.60;
		
		Usuario nuevo = new Usuario(nombre1, edad,peso,altura);
		Reloj nuevoSmart = new Reloj(nombre,nuevo);
		
		assertNotNull(nuevoSmart);
		
	}

}
