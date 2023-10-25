package ar.edu.unlam.SistemaSeguro;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUsuario {

	
	
	@Test
	public void queSePuedaCrearUnUsuarioBasico() {
		String nombre = "mariela";
				
		Usuario nuevo = new UsuarioBasico(nombre);
		
		assertNotNull(nuevo);
		}
	
	@Test
	public void queSePuedaCrearUnUsuarioAdministrador() {
		String nombre = "mariela";
				
		Usuario nuevo = new UsuarioAdministrador(nombre);
		
		assertNotNull(nuevo);
		}
	
	@Test
	public void queSePuedaCrearUnUsuarioBasicoYseaBloqueable() {
		String nombre = "mariela";
				
		Usuario nuevo = new UsuarioBasico(nombre);
		
		
		assertTrue(nuevo instanceof Bloqueable);
		}
	
	@Test
	public void queSePuedaCrearUnUsuarioBasicoYseaEliminable() {
		String nombre = "mariela";
				
		Usuario nuevo = new UsuarioBasico(nombre);
		
		
		assertTrue(nuevo instanceof Eliminable);
		}
	
	
	
	


}
