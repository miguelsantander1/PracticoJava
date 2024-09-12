package dominio;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class BuscarAlumnosPorMateria implements IBuscarAlumnos{
	public Set<Alumno> buscarAlumnos(Set<Alumno> alumnosUniversidad, Object criterio){ 
		TreeSet<Integer> dnisDeAlumnos = (TreeSet<Integer>) criterio;
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
