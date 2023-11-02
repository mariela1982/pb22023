package ar.edu.unlam.SistemaSeguro;

public class UsuarioBasico extends Usuario implements Bloqueable,Eliminable{
	private String contraseña;
	private Boolean bloqueado;



	public UsuarioBasico(String nombre) {
		super(nombre);
		this.bloqueado = false;
		
	}
	
		
	


	
	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}


	@Override
	protected boolean crearContraseña(String contraseña) throws InvalidPasswordException {
		if ( contraseña.matches(".*[a-z].*")&& contraseña.matches(".*[A-Z].*")&& contraseña.matches(".*[0-9].*")) {
					this.setContraseña(contraseña);
					return true;
				} else {
					throw new InvalidPasswordException();
				}
	
	}
	
	public Boolean getBloqueado() {
		return bloqueado;
	}
	@Override
	public void  esbloqueable(Boolean b) {
		this.bloqueado = b;
		
	}
	

}
