package es.unex.cum.mdp.sesion01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Ejemplo00 extends Application {
	   public static void main(String[] args) {
	    launch(args);
	   }

	   @Override
	   public void start(Stage primaryStage) {
	    primaryStage.setTitle("Hello World!");
	    StackPane root = new StackPane();
	    primaryStage.setScene(new Scene(root, 300, 250));
	    primaryStage.show();
	   }
	}