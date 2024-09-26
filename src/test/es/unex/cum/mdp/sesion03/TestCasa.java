package es.unex.cum.mdp.sesion03;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCasa {

	private Casa casa;
	private Persona propietario1;
	private Persona propietario2;
	private Persona habitante1;
	private Persona habitante2;

	@BeforeEach
	void setUp() {
		// Inicializamos la casa y las personas para cada test
		casa = new Casa(2); // Casa con 2 propietarios permitidos
		propietario1 = new Persona("Juan", "12345678A", 10);
		propietario2 = new Persona("Maria", "87654321B", 11);
		habitante1 = new Persona("Carlos", "12312312C", 30);
		habitante2 = new Persona("Ana", "43243243D", 31);
	}

	@Test
	void testAddPropietario() {
		assertTrue(casa.addPropietario(propietario1), "El propietario debería añadirse correctamente");
		assertFalse(casa.addPropietario(propietario1), "El propietario existe");
		assertTrue(casa.addPropietario(propietario2), "El segundo propietario debería añadirse correctamente");
		assertFalse(casa.addPropietario(new Persona("Luz", "8654321B", 12)),
				"El tercer propietario no debería añadirse correctamente");
	}

	@Test
	void testAddHabitante() {
		assertTrue(casa.addHabitantes(habitante1), "El habitante debería añadirse correctamente");
		assertTrue(casa.addHabitantes(habitante2), "El segundo habitante debería añadirse correctamente");
		assertTrue(casa.addHabitantes(new Persona("Luz", "8654321B", 12)),
				"El tercer habitante debería añadirse correctamente");
		assertFalse(casa.addHabitantes(new Persona("Antonio", "12312312C", 54)),
				"No debería permitir añadir un habitante con el mismo DNI");
	}

	@Test
	void testBorrarPropietario() {
		casa.addPropietario(propietario1);
		assertTrue(casa.borrarPropietario("12345678A"), "Debería borrar al propietario por DNI");
		assertFalse(casa.borrarPropietario("00000000X"), "No debería borrar un propietario no existente");
	}

	@Test
	void testBorrarHabitantePorPosicion() {
		casa.addHabitantes(habitante1);
		casa.addHabitantes(habitante2);
		assertTrue(casa.borrarHabitantes(0), "Debería borrar al habitante en la posición 0");
		assertFalse(casa.borrarHabitantes(10), "No debería borrar con una posición inválida");
	}

	@Test
	void testMostrarPropietarios() {
		casa.addPropietario(propietario1);
		casa.addPropietario(propietario2);

		// Validar que no arroje errores al mostrar propietarios
		assertDoesNotThrow(() -> casa.mostrarPropietarios(), "No debería fallar al mostrar propietarios");
	}

	@Test
	void testMostrarHabitantes() {
		casa.addHabitantes(habitante1);
		casa.addHabitantes(habitante2);

		// Validar que no arroje errores al mostrar habitantes
		assertDoesNotThrow(() -> casa.mostrarHabitantes(), "No debería fallar al mostrar habitantes");
	}

	@Test
	void testContarPares() {
		assertEquals(0, casa.contarPares(),
				"No debería haber ninguna persona con edad par si no hay propietarios ni habitantes.");
		casa.addPropietario(propietario1); // Edad 10 (par)
		assertEquals(1, casa.contarPares(), "Debería haber 1 propietario con edad par.");
		casa.addPropietario(propietario2); // Edad 11 (impar)
		assertEquals(1, casa.contarPares(), "Debería haber 1 propietario con edad par.");

		casa.addHabitantes(habitante1); // Edad 30 (par)
		assertEquals(2, casa.contarPares(), "Debería haber 2 con edad par.");
		casa.addHabitantes(habitante2); // Edad 31 (impar)
		assertEquals(2, casa.contarPares(), "Debería haber 2 con edad par.");
	}

}
