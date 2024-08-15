package dominio;

import java.util.HashSet;
import java.util.Objects;

public class Materia {
	private String nombre;
	private int anioDeCarrera;
	private Profesor profesorQueLaImparte;
	private Profesor ayudante;
	private HashSet<Alumno> alumnosIncriptos;
	
	public Materia(String nombre, int anioDeCarrera, Profesor profesorQueLaImparte) {
		super();
		this.nombre = nombre;
		this.anioDeCarrera = anioDeCarrera;
		this.profesorQueLaImparte = profesorQueLaImparte;
		this.alumnosIncriptos= new HashSet<Alumno>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnioDeCarrera() {
		return anioDeCarrera;
	}

	public void setAnioDeCarrera(int anioDeCarrera) {
		this.anioDeCarrera = anioDeCarrera;
	}

	public Profesor getProfesorQueLaImparte() {
		return profesorQueLaImparte;
	}

	public void setProfesorQueLaImparte(Profesor profesorQueLaImparte) {
		this.profesorQueLaImparte = profesorQueLaImparte;
	}

	public Profesor getAyudante() {
		if (ayudante==null)
			return null;
		else
			return ayudante;
	}

	public void setAyudante(Profesor ayudante) {
		this.ayudante = ayudante;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Materia other = (Materia) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		String  string ="Materia /nNombre: " + nombre + "/n Anio De Carrera:" + anioDeCarrera + "/nProfesor Que La Imparte: "
				+ profesorQueLaImparte + "/n Ayudante: ";
		if (ayudante==null)
			string+= "ninguno";
		else
			string+= ayudante;
		return string;
	}
	
	
}
