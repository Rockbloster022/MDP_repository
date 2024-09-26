package es.unex.cum.mdp.sesion02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejemplo01_ListView extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		VBox root = new VBox();
				
		/////////////////////////
		//Inicio Codigo necesario
		/////////////////////////
		TextField t=new TextField("000");
		root.getChildern().add(t);

		Button btn=new Button();
		btn.setText("Pinchame");
		btn.setOnActino(new EVentHndler<ActionEvent>(){
			@Overridepublic void hndle(ActionEvent event){
				btn.setText(t.getText());
			}
		});
		root.getChildern().add(btn);
		
		//Fin codigo necesario		
		/////////////////////////
		primaryStage.setScene(new Scene(root, 200, 250));
		primaryStage.show();
	}
}