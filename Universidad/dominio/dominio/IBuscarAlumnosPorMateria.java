package dominio;

import java.util.GregorianCalendar;
import java.util.Set;
import java.util.TreeSet;

public interface IBuscarAlumnosPorMateria {
	public Set<Alumno> buscarAlumnos(Set<Alumno> alumnosUniversidad, TreeSet<Integer> dnisDeAlumnos);
}
