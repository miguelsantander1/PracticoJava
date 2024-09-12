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
	private IAgregarAlumno agregarAlumno;
	private IEliminarAlumno eliminarAlumno;
	private IBuscarAlumnos buscarAlumnosPorFechaDeInscripsion;
	private IBuscarAlumnos buscarAlumnosPorMateria;
	
	private GestorAlumno() {
		alumnosUniversidad = new HashSet<Alumno>();
		agregarAlumno = new AgregarAlumno();
		eliminarAlumno = new EliminarAlumno();
		buscarAlumnosPorFechaDeInscripsion = new BuscarAlumnosPorFechaDeInscripsion();
		buscarAlumnosPorMateria = new BuscarAlumnosPorMateria();
		indice = 0;
	}
	
	public static GestorAlumno getInstance() {
		if (gestorDeAlumnos == null)
			gestorDeAlumnos = new GestorAlumno();
		return gestorDeAlumnos;
	}
	
	public boolean addAlumno(Alumno alumno) {
		return agregarAlumno.addAlumnos(alumno, alumnosUniversidad);
	}
	
	public boolean eliminarAlumno(int dni) {
		return eliminarAlumno.eliminarAlumno(dni, alumnosUniversidad);
	}
	
	public Set<Alumno> buscarAlumnosPorMateria(TreeSet<Integer> dnisDeAlumnos) {
		return buscarAlumnosPorMateria.buscarAlumnos(alumnosUniversidad, dnisDeAlumnos);
	}
	
	public Set<Alumno> buscarAlumnosPorFechaDeIncripsion(GregorianCalendar fechaHasta) {
		return buscarAlumnosPorFechaDeInscripsion.buscarAlumnos(alumnosUniversidad, fechaHasta);
	}
}
