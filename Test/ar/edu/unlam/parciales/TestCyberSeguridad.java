package ar.edu.unlam.parciales;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCyberSeguridad {

	@Test
	public void queSePuedaCrearUnCliente() {
		String cuit = "27-12365456-0";
		String nombreDelCliente = "mariela";
		
		Cliente nuevoCliente = new Cliente(cuit,nombreDelCliente);
		
		assertNotNull(nuevoCliente);
		
	}
	
	@Test
	public void queSePuedaCrearUnDispositivoPc() {
		
		String nombreDelDispositivo = "pc";
		String sistemaOperativo = "windows";
		String direccionIP = "192.198.0.101";
		String localidadDeDireccion = "San Justo";
		
		
		Dispositivo nuevoDispositivo = new DispositivoPc(nombreDelDispositivo,sistemaOperativo,direccionIP,localidadDeDireccion);
		
		assertNotNull(nuevoDispositivo);
		
	}
	
	@Test
	public void queSePuedaCrearUnDispositivoMovil() {
		
		String nombreDelDispositivo = "movil";
		String sistemaOperativo = "windows";
		String direccionIP = "192.198.0.101";
		String localidadDeDireccion = "San Justo";
		Long imei = 254789356478216L;
		
		
		Dispositivo nuevoDispositivo = new DispositivoMovil(nombreDelDispositivo,sistemaOperativo,direccionIP,localidadDeDireccion, imei);
		
		assertNotNull(nuevoDispositivo);
		
	}
	
	@Test
	public void queSePuedaMonitorearUnaExtraccion() {
		String cuit = "27-12365456-0";
		String nombreDelCliente = "mariela";
		
		Cliente nuevoCliente = new Cliente(cuit,nombreDelCliente);
		
		assertNotNull(nuevoCliente);
		
	}
	

}
