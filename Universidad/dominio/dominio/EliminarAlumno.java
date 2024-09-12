package dominio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class EliminarAlumno implements IEliminarAlumno {
	public boolean eliminarAlumno(int dni,Set<Alumno> alumnosUniversidad) {
	Iterator it= alumnosUniversidad.iterator();
	Alumno alumnoAux;
	while (it.hasNext()) {
		alumnoAux = (Alumno) it.next();
		if (alumnoAux.getDni()==dni) {
			it.remove();
			return true;
		}
	}
	return false;
	}
}

