package dominio;

import java.util.Set;

public class AgregarAlumnos {
	public static boolean addAlumnos(Alumno alumno, Set<Alumno>alumnosUniversidad) {
		return alumnosUniversidad.add(alumno);
	}

}
