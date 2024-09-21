package es.unex.cum.mdp.sesion01;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejemplo05 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Bienvenido a MDP!");
		VBox root = new VBox();
		// Inicio de modificar

		TextField t = new TextField();
		t.setText("00");
		root.getChildren().add(t);
		Button b3 = new Button("Como estas");

		Button b1 = new Button("Hola");
		root.getChildren().add(b1);
		b1.setOnAction(new EventHandler<ActionEvent>() {
			// Captura del evento
			@Override
			public void handle(ActionEvent event) {
				String valor = t.getText();
				primaryStage.setTitle("El valor es:" + valor);
			}
		});

		Button b2 = new Button("Adios");
		root.getChildren().add(b2);

		b2.setOnAction(new EventHandler<ActionEvent>() {
			// Captura del evento
			@Override
			public void handle(ActionEvent event) {
				String valor = t.getText();
				try {
					int x = Integer.parseInt(valor);
					if (x % 2 == 0) {
						primaryStage.setTitle("es par");
					} else {
						primaryStage.setTitle("es impar");
					}
				} catch (NumberFormatException e) {
					primaryStage.setTitle("Pon un número!!!!");
				}
			}
		});

		root.getChildren().add(b3);

		// Fin de modificar
		primaryStage.setScene(new Scene(root, 600, 500));
		primaryStage.show();
	}
}