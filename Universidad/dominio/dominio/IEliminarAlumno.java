package dominio;

import java.util.Set;

public interface IEliminarAlumno {
	boolean eliminarAlumno(int dni,Set<Alumno> alumnosUniversidad);
}
