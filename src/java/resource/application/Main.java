package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	@Override
	public void start(Stage stage) throws Exception {
		
		Pane root = FXMLLoader.load(getClass().getResource("/ApplicationView.fxml"));
		Scene scene = new Scene(root);
		
		stage.setTitle("CONVERSOR DOLAR");
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
