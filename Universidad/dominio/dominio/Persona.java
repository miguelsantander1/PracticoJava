package dominio;

import java.util.GregorianCalendar;
import java.util.Objects;

public class Persona {
	private String nombre;
	private String apellido;
	private GregorianCalendar fechaDeNacimiento;
	private long dni;

public Persona(String nombre, String apellido, GregorianCalendar fechaDeNacimiento, long dni) throws ExceptionAlumno {
		ValidarPersona.validarNombre(nombre);
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public GregorianCalendar getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public long getDni() {
		return dni;
	}
	
	public void setDni(long dni) {
		this.dni = dni;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return dni == other.dni;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nApellido: " + apellido + "\nFecha De Nacimiento: " + fechaDeNacimiento
				+ "\nDNI: " + dni + "]";
	}
		
	
	
}
