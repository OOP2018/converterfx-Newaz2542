package converter;
/**Main class is for run application Converter.
 * @author Vichakorn
 */
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	/**
	 * Set the detail and show for windows.
	 */
	@Override
	public void start(Stage stage) {
		try {
			Parent root = (Parent)FXMLLoader.load(getClass().getResource("ConverterUI.fxml"));
			Scene scene = new Scene(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.setTitle("Simple Converter");
			stage.sizeToScene();
			stage.show();
		} catch(Exception e) {
			System.out.println("Exception creating scen : "+e.getMessage());
		}
	}
	/**
	 * Run windows of application.
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
