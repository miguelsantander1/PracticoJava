package dominio;

import java.util.GregorianCalendar;

public class Alumno extends Persona implements Comparable<Alumno> {
	private GregorianCalendar fechaDeIncripcion;
	private String carrera;

	public Alumno(String nombre, String apellido, GregorianCalendar fechaDeNacimiento, long dni,
			GregorianCalendar fechaDeIncripcion, String carrera) throws ExceptionAlumno {
			super(nombre, apellido, fechaDeNacimiento, dni);
		this.fechaDeIncripcion = fechaDeIncripcion;
		this.carrera = carrera;
	}

	public GregorianCalendar getFechaDeIncripcion() {
		return fechaDeIncripcion;
	}

	public void setFechaDeIncripcion(GregorianCalendar fechaDeIncripcion) {
		this.fechaDeIncripcion = fechaDeIncripcion;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return super.toString()+"/nFecha De Incripcion: " + fechaDeIncripcion + "/nCarrera: " + carrera;
	}

	@Override
	public int compareTo(Alumno alumno) {
		return (int)(this.getDni()-alumno.getDni());
	}

	
}
