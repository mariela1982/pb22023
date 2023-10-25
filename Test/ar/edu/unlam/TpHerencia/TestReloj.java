package ar.edu.unlam.TpHerencia;

import static org.junit.Assert.*;

import java.util.Scanner;

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
		Integer modo ;
		Usuario nuevo = new Usuario(nombre1, edad,peso,altura);
		Reloj nuevoSmart = new Reloj(nombre,nuevo);
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("opcion 1 caminata");
		System.out.println("opcion 2 carrera");
		System.out.println("opcion 3 ciclismo");
		System.out.println("opcion 4 natacion");
		modo = teclado.nextInt();
		
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
