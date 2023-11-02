package ar.edu.unlam.SistemaSeguro;

public class UsuarioAdministrador extends Usuario {

	public UsuarioAdministrador(String nombre) {
		super(nombre);
		
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

}
