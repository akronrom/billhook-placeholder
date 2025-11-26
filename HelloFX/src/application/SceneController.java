package application;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class SceneController {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	/*
	public void switchToScene1(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		//copypaste this shit ^^^ everywhere
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}*/
	
	//Scene2 is the graph
	public void switchToScene2(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Graph.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow(); //idfk
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
