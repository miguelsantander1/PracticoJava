package dominio;

import java.util.GregorianCalendar;

public class Profesor extends Persona{
	private String FechaDeIngreso;
	private String titulo;

	public Profesor(String nombre, String apellido, GregorianCalendar fechaDeNacimiento, long dni,
			String fechaDeIngreso, String titulo) throws ExceptionAlumno {
		super(nombre, apellido, fechaDeNacimiento, dni);
		this.FechaDeIngreso = fechaDeIngreso;
		this.titulo = titulo;
	}

	public String getFechaDeIngreso() {
		return FechaDeIngreso;
	}

	public void setFechaDeIngreso(String fechaDeIngreso) {
		FechaDeIngreso = fechaDeIngreso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return super.toString() + "/nFecha De Ingreso: " + FechaDeIngreso + "/Titulo: " + titulo;
	}
	
	
}
