/**
 * Implementación de la clase Casa, constituida por un array de Personas denominadas Hab.
 */
package es.unex.cum.mdp.sesion02;

/**
 * @author Luis Arevalo
 *
 */
public class Casa {
	private Persona[] hab;
	public Casa() {
		//TODO
	}
	public Casa(int tam) {
		//TODO
	}
	public boolean add(Persona p)	{
		//TODO
		return false;
	}
	public void mostrar() {
		//TODO
	}
	public boolean borrar(int pos) {
		//TODO
		return false;
	}
	public int contarPares() {
		//TODO
		return 0;
	}	
	public static void main(String[] args) {
		Casa m= new Casa(5);
		m.add(new Persona("Juan","10",10));
		m.add(new Persona("Ana","20",20));
		m.add(new Persona("Andres","30",30));
		m.mostrar();
		System.out.println("Procedo a borrar");
		m.borrar(1);
		m.mostrar();
		System.out.println(m.contarPares());
	}
}
