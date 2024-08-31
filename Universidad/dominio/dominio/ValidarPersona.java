package dominio;

public class ValidarPersona {
	public static void validarNombre(String nombre) throws ExceptionAlumnoNombreNulo {
		if (nombre==null) throw new ExceptionAlumnoNombreNulo();
	}
}
