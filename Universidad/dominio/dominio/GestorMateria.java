package dominio;

import java.util.ArrayList;

public class GestorMateria {
	private static GestorMateria gestorDeMateria;
	private ArrayList<Materia> materias;
	private int indice;
	
	private GestorMateria() {
		materias = new ArrayList<Materia>(100);
		indice = 0;
	}
	
	public static GestorMateria getInstance() {
		if (gestorDeMateria == null)
			gestorDeMateria = new GestorMateria();
		return gestorDeMateria;
	}
}
