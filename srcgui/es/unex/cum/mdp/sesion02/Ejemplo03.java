package es.unex.cum.mdp.sesion02;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejemplo03 extends Application {
	private Casa c;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Array de Objetos");
		BorderPane root = new BorderPane();
		primaryStage.setScene(new Scene(root, 600, 400));

		///////////////////////////////////
		// Definiciones
		///////////////////////////////////
		c = new Casa(5);
		ListView<Persona> lPersonas = new ListView<Persona>();

		///////////////////////////////////
		// Panel inferior:
		// Definiremos un panel HBox se añadirá al root
		///////////////////////////////////

		// TODO Crear el panel HBox (bot) y añadirlo al Botton de root
		
		// TODO: Crear etiqueta (Ejemplo) y añadirla al panel bot

		///////////////////////////////////
		// Panel de la derecha
		// Crearemos un panel VBox con varios componentes
		///////////////////////////////////

		// TODO: Crear un panel VBox (izq) y asociarlo a la parte izquierda de root

		// TODO: Crear 3 etiquetas y 3 cuadro de texto y añadirlo al panel izq

		// TODO: Crear 2 botones (añadir y borrar) y añadirlo al panel izq

		// TODO crear la acción del botón añadir

		// TODO crear la acción del botón borrar

		///////////////////////////////////
		// Panel del centro
		// Crearemos un panel VBox con varios componentes
		///////////////////////////////////

		// TODO crear el panel VBOX(der) y añadirlo a root

		// TODO: Añadir al panel der el ListView de Personas (lPersonas)

		// TODO añadir un par de personas a ListView

		// TODO capturar el evento setOnMouseClicked y mostrar la información

		// TODO Decidir que se quiere mostrar

		///////////////////////////////////
		// Fin del código
		///////////////////////////////////
		primaryStage.show();

	}
}