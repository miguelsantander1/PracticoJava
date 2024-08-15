package dominio;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class GestorAlumno {
	private static GestorAlumno gestorDeAlumnos;
	private Set<Alumno> alumnosUniversidad;
	private int indice;
	
	private GestorAlumno() {
		alumnosUniversidad = new HashSet<Alumno>();
		indice = 0;
	}
	
	public static GestorAlumno getInstance() {
		if (gestorDeAlumnos == null)
			gestorDeAlumnos = new GestorAlumno();
		return gestorDeAlumnos;
	}
	
	public boolean addAlumno(Alumno alumno) {
		
		return alumnosUniversidad.add(alumno);
	}
	
	public boolean eliminarAlumno(int dni) {
		Iterator it= alumnosUniversidad.iterator();
		Alumno alumnoAux;
		while (it.hasNext()) {
			alumnoAux = (Alumno) it.next();
			if (alumnoAux.getDni()==dni)
				it.remove();
		}
		return false;
	}
	
	public Set<Alumno> buscarAlumnosPorMateria(TreeSet<Integer> dnisDeAlumnos) {
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
	
	public Set<Alumno> buscarAlumnoPorFechaDeIncripsion(GregorianCalendar fechaHasta) {
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
