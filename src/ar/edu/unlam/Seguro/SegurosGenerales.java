package ar.edu.unlam.Seguro;

public abstract class SegurosGenerales {
	
	protected Integer numeroDePoliza;
	
	public SegurosGenerales(Integer numeroDePoliza) {
		this.numeroDePoliza = numeroDePoliza;
	}

	protected abstract void agregarBienAsegurado(Auto auto);

	public Integer getNumeroDePoliza() {
		
		return numeroDePoliza;
	}

}
