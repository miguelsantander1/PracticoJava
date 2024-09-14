package dominio;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class BuscarAlumnosPorMateria implements IBuscarAlumnosPorMateria{
	public Set<Alumno> buscarAlumnos(Set<Alumno> alumnosUniversidad, TreeSet<Integer> dnisDeAlumnos){ 
		TreeSet<Alumno> alumnosDeLaMateria= new TreeSet<Alumno>();
		for(Alumno alumnoAux:alumnosUniversidad) {
			if(dnisDeAlumnos.contains(alumnoAux.getDni()));
				alumnosDeLaMateria.add(alumnoAux);
		}
		
		alumnosUniversidad.stream()
									.filter(al -> dnisDeAlumnos.contains(al.getDni()))
									.sorted()
									.collect(Collectors.toCollection(TreeSet::new));
		
		return alumnosDeLaMateria;
	}
}
