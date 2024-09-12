package dominio;

import java.util.GregorianCalendar;
import java.util.Set;

public interface IBuscarAlumnos {
	public Set<Alumno> buscarAlumnos(Set<Alumno> alumnosUniversidad, Object criterio);
}
