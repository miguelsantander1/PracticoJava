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
		return AgregarAlumnos.addAlumnos(alumno, alumnosUniversidad);
	}
	
	public boolean eliminarAlumno(int dni) {
		return EliminarAlumno.eliminarAlumno(dni, alumnosUniversidad);
	}
	
	public Set<Alumno> buscarAlumnosPorMateria(TreeSet<Integer> dnisDeAlumnos) {
		return BuscarAlumnosPorMateria.bucarAlumnosPorMateria(dnisDeAlumnos,alumnosUniversidad);
	}
	
	public Set<Alumno> buscarAlumnosPorFechaDeIncripsion(GregorianCalendar fechaHasta) {
		return BuscarAlumnosPorFechaDeInscripsion.buscarAlumnosPorFechaDeInscripsion(fechaHasta, alumnosUniversidad);
	}
}
