package es.unex.cum.mdp.sesion01;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejemplo06 extends Application {
	   public static void main(String[] args) {
	    launch(args);
	   }

	   @Override
	   public void start(Stage primaryStage) {
	    primaryStage.setTitle("Hello World!");
	    VBox root = new VBox();
	    
	    //Inicio
	    TextField t1=new TextField();
	    
	    TextField t2=new TextField();
	    
	    Button b1=new Button("Suma");
	    
	    b1.setOnAction(new EventHandler<ActionEvent>() {
			// Captura del evento
			@Override
			public void handle(ActionEvent event) {
				String valor1=t1.getText();
				String valor2=t2.getText();
				try {
					int result=Integer.parseInt(valor1)+
							Integer.parseInt(valor2);
					primaryStage.setTitle("Resultado: "+result);
				}catch (NumberFormatException e) {
					primaryStage.setTitle("ERROR");
				}
			}
		});
	    
	    Button b2=new Button("Resta");
	    
	    root.getChildren().addAll(t1,t2,b1,b2);
	    		
	    
	    //Fin
	    
	    primaryStage.setScene(new Scene(root, 300, 250));
	    primaryStage.show();
	   }
	}