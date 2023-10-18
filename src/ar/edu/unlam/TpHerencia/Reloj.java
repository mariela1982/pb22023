package ar.edu.unlam.TpHerencia;

public class Reloj {
	
	private String nombre = "";
	private Usuario nombreUsuario ;
	private Integer paso ;
	private Frecuencia zona ;
		
	public Reloj(String nombre2, Usuario nuevo) {
		this.nombre = nombre2;
		this.nombreUsuario = nuevo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Usuario getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(Usuario nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public Integer getPaso() {
		return paso;
	}

	public void setPaso(Integer paso) {
		this.paso = paso;
	}

	public Frecuencia getZona() {
		return zona;
	}

	public void setZona(Frecuencia zona) {
		this.zona = zona;
	}

	public void activarPasos() {
		p
		
	}
	
	


}
