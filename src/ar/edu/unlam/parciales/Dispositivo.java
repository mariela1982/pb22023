package ar.edu.unlam.parciales;

public abstract class Dispositivo {
	
	protected String nombreDelDispositivo = "pc";
	protected String sistemaOperativo = "windows";
	protected String direccionIP = "192.198.0.101";
	protected String localidadDeDireccion = "San Justo";
	
	public Dispositivo(String nombreDelDispositivo,String sistemaOperativo,String direccionIP,String localidadDeDireccion) {
		this.nombreDelDispositivo = nombreDelDispositivo;
		this.sistemaOperativo = sistemaOperativo;
		this.direccionIP = direccionIP;
		this.localidadDeDireccion = localidadDeDireccion;
		}
	

}
