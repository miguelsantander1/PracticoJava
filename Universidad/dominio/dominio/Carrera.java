package dominio;

import java.util.ArrayList;
import java.util.Objects;

public class Carrera {
	private String nombre;
	private int anios;
	private ArrayList<Materia> materias;
	private int indice;
	
	
	public Carrera(String nombre, int anios) {
		this.nombre = nombre;
		this.anios = anios;
		this.materias = new ArrayList<Materia>();;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAnios() {
		return anios;
	}
	public void setAnios(int anios) {
		this.anios = anios;
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
		Carrera other = (Carrera) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Carrera /nNombre: " + nombre + "/nAnios=" + anios;
	}

	
	
}
