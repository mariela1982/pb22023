package ar.edu.unlam.SistemaSeguro;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSistema {

	@Test
	public void queSePuedaCrearUnSistema() {
		String nombre = "SistemaUno";
		
		Sistema nuevo = new Sistema(nombre);
		
		assertNotNull(nuevo);
		
	}
	
	@Test
	public void queSePuedaIngresarUnUsuarioBAsicoAlSistema() {
		String nombre = "SistemaUno";
		String nombreUsuario = "mariela";
		
		
		Sistema nuevo = new Sistema(nombre);
		Usuario nuevoUsuario = new UsuarioBasico(nombreUsuario);
		
		assertTrue(nuevo.ingresarUsuario(nuevoUsuario));
		
		
	}
	
	@Test
	public void queSePuedaCrearUnaContraseñaDeUnUsuarioBasico() {
		String nombre = "mariela";
		String contraseña = "1Mariela";
		Usuario nuevo = new UsuarioBasico(nombre);
		assertTrue(nuevo.crearContraseña(contraseña));
		
		assertNotNull(nuevo);
		}
	
	
	
	

}
