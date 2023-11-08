package ar.edu.unlam.cumple;

import java.util.Objects;

public abstract class Evento {
	protected String nombreDeEvento;
	protected Usuario organizador;
	
	public Evento( String nombreDelEvento) {
		
		this.nombreDeEvento = nombreDelEvento;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombreDeEvento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		return Objects.equals(nombreDeEvento, other.nombreDeEvento);
	}
	
}


