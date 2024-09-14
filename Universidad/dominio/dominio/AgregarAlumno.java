package dominio;

import java.util.Set;

public class AgregarAlumno implements IAgregarAlumno{
	private Set<Alumno> alumnosUniversidad;
	
	public AgregarAlumno(Set<Alumno> alumnosUniversidad) {
		this.alumnosUniversidad  = alumnosUniversidad;
	}
	
	
	public boolean addAlumno(Alumno alumno) {
		return alumnosUniversidad.add(alumno);
	}

}
