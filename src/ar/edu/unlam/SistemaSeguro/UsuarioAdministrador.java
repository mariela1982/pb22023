package ar.edu.unlam.SistemaSeguro;

public class UsuarioAdministrador extends Usuario {

	public UsuarioAdministrador(String nombre) {
		super(nombre);
		
	}

	@Override
	public void ingresarContraseña(String contraseña) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean crearContraseña(String contraseña2) {
		// TODO Auto-generated method stub
		return false;
	}

}
