package application;
	

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/Main.fxml"));
			stage.setScene(new Scene((Pane) loader.load()));
			MainController Main = loader.<MainController>getController();
			Main.setParent(stage);
	    	stage.centerOnScreen();
			stage.setResizable(false);
			stage.setTitle("Databuilder");
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		launch(args);
	}
}
