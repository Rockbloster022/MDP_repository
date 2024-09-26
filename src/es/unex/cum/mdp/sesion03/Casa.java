package es.unex.cum.mdp.sesion03;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementación de la clase Casa, constituida por un array de Personas denominadas Propietarios y una lista de Habitantes.
 * @author Luis Arevalo
 */
public class Casa {
	private Persona[] propietarios;
	private List<Persona> habitantes;

	/**
	 * Constructor por defecto
	 */
	public Casa() {
		//TODO
	}

	/**
	 * Constructor parametrizado que recibe el tamaño del array	de propietarios
	 * @param tam Tamaño del array
	 */

	public Casa(int tam) {
		// TODO
	}

	/**
	 * Añade un propietario siempre que haya espacio y no esté repetido
	 * @param p
	 * @return  true si se añade o false en otro caso.
	 */
	public boolean addPropietario(Persona p) {
		// TODO
		return false;
	}

	/**
	 * Añade un habitante siempre que no esté repetido
	 * @param p
	 * @return  true si se añade o false en otro caso.
	 */
	public boolean addHabitantes(Persona p) {
		// TODO
		return false;
	}

	/**
	 * Muestra todos los propietarios
	 */
	public void mostrarPropietarios() {
		// TODO
	}

	/**
	 * Muestra todos los habitantes
	 */
	public void mostrarHabitantes() {
		// TODO
	}

	/**
	 * Borra un propietario indicando su dni
	 * @param dni Dni de la persona a borrar 
	 * @return  true si se ha borrado o false en otro caso.
	 */
	public boolean borrarPropietario(String dni) {
		// TODO
		return false;
	}

	/**
	 * Borra un habitante indicando su posición
	 * @param pos Entero que indica la posición a borrar
	 * @return  true si se ha borrado o false en otro caso.
	 */
	public boolean borrarHabitantes(int pos) {
		// TODO
		return false;
	}

	/**
	 * Cuenta cuantos habitantes y propietarios tienen una edad par
	 * @return numero de habitantes y propietarios con edad par
	 */
	public int contarPares() {
		// TODO
		return 0;
	}

	public static void main(String[] args) {
		Casa m = new Casa(5);
		m.addPropietario(new Persona("Juan", "10", 10));
		m.addPropietario(new Persona("Ana", "20", 20));
		m.addHabitantes(new Persona("Andres", "30", 30));
		m.addHabitantes(new Persona("Margarita", "40", 40));
		m.mostrarPropietarios();
		m.mostrarHabitantes();
		System.out.println("Procedo a borrar");
		m.borrarPropietario("10");
		m.borrarHabitantes(0);
		System.out.println(m.contarPares());

	}

}
