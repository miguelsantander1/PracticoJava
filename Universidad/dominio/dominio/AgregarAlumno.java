package dominio;

import java.util.Set;

public class AgregarAlumno implements IAgregarAlumno{
	public boolean addAlumnos(Alumno alumno, Set<Alumno>alumnosUniversidad) {
		return alumnosUniversidad.add(alumno);
	}

}
