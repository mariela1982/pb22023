package ar.edu.unlam.Seguro;

public class Persona {
	 private String nombre ;
	 private Integer dni;
	 private Integer edad;

	public Persona(String nombre, Integer dni , Integer edad) {
		this.dni = dni;
		this.edad = edad ;
		this.nombre = nombre;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	

}
