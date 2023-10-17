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
	
	@Test
	public void queSePuedaContarLosPasos() {
		String nombre = "casio";
		String nombre1 = "carla";
		Integer edad = 35;
		Double peso = 78.50;
		Double altura  = 1.60;
		Integer modo = 1;
		Usuario nuevo = new Usuario(nombre1, edad,peso,altura);
		Reloj nuevoSmart = new Reloj(nombre,nuevo);
		
		nuevoSmart.activarPasos();
		switch(modo) {
		case 1 : //caminata
			break;
		case 2 : // carrera
			break;
		case 3 : // ciclismo
			break;
		case 4 : // natacion 
			break;
		}
		
		
		
		
		
		assertNotNull(nuevoSmart);
		
	}
	
	

}
