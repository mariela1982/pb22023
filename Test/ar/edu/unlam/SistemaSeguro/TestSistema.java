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
	public void queSePuedaCrearUnaContraseñaDeUnUsuarioBasico() throws InvalidPasswordException {
		String nombre = "mariela";
		String contraseña = "1Mariela1";
		Usuario nuevo = new UsuarioBasico(nombre);
		assertTrue(nuevo.crearContraseña(contraseña));
		assertNotNull(nuevo);
		}
	
	@Test
	public void queSePuedaCrearUnaContraseñaDeUnUsuarioAdministrador() throws InvalidPasswordException {
		String nombre = "mariela";
		String contraseña = "1Mariela1";
		Usuario nuevo = new UsuarioAdministrador(nombre);
		assertTrue(nuevo.crearContraseña(contraseña));
		assertNotNull(nuevo);
		}
	
	@Test
	public void queSePuedaBloquearUnUsuarioBasico() throws InvalidPasswordException {
		String nombre = "mariela";
		String contraseña = "1Mariela1";
		String contraseñaIncorrecta = "1Mariela";
		String nombreSistema = "SistemaUno";
		
		Sistema nuevoSistema = new Sistema(nombreSistema);
		Usuario nuevo = new UsuarioBasico(nombre);
		
		nuevo.crearContraseña(contraseña);
		nuevoSistema.login(nuevo,contraseñaIncorrecta);
		nuevoSistema.ingresarContraseña(contraseñaIncorrecta);
		nuevoSistema.ingresarContraseña(contraseñaIncorrecta);
		assertTrue(nuevoSistema.bloquearUsuario(nuevo));
		
		
		
		}
	
	
	
	

}
