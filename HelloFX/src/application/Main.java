package application;
	
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.fxml.*;

public class Main extends Application {
	
	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
		Scene scene = new Scene(root);
		
		stage.setScene(scene); 
		stage.show(); 
		stage.setResizable(false);
		
		stage.setMinWidth(640);
		stage.setMinHeight(480);
		
		String css = this.getClass().getResource("application.css").toExternalForm();
		scene.getStylesheets().add(css);
		
		double aspectRatio = 16.0 / 9.0;
		
	}
}
