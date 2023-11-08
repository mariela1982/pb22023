package ar.edu.unlam.cumple;

public class Cumpleaños extends Evento implements Agasajado {
	
	private Usuario agasajado;
	
	public Cumpleaños(Usuario agasajado,String nombreEvento) {
		super(nombreEvento);
		//this.agasajado = (Usuario) agasajado;
		
	}
	
}
