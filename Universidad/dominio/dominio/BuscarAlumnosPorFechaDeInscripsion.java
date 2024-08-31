package dominio;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class BuscarAlumnosPorFechaDeInscripsion {
	
	public static Set<Alumno> buscarAlumnosPorFechaDeInscripsion(GregorianCalendar fechaHasta,Set<Alumno> alumnosUniversidad) { 
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/year");
	return alumnosUniversidad.stream()
			.filter(al->al.getFechaDeIncripcion().before(fechaHasta))
			.sorted(new Comparator<Alumno>() {

				@Override
				public int compare(Alumno al1, Alumno al2) {
					int aux = al1.getApellido().compareTo(al2.getApellido());
					
					if(aux==0)
						aux=al1.getNombre().compareTo(al2.getNombre());
					
					
					return aux;
				}
			})
			.collect(Collectors.toCollection(HashSet::new));
	}

}
