package dominio;

import java.util.GregorianCalendar;
import java.util.Set;

public interface IBuscarAlumnosPorFechaDeInscripcion {

	public Set<Alumno> buscarAlumnos(Set<Alumno> alumnosUniversidad,GregorianCalendar fechaHasta);
}
