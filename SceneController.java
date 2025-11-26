package application;

import java.io.IOException;
import javafx.fxml.*;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;

public class SceneController {

    @FXML private Button startButton;
    @FXML private Label label;
    @FXML private TextField searchBar; // match fx:id exactly
    @FXML private Button searchButton;
    private Stage stage;
    private Scene scene;
    
   String[] text = {"car", "house", "yellow"};
    
    String name = "";
    public void onStartButtonClicked(javafx.event.ActionEvent event) {
        name =  searchBar.getText();
        System.out.println(name);
    }
    
    boolean found = false;
    public void search(ActionEvent event) {
        String input = searchBar.getText().trim(); // always read current TextField value
        boolean found = false;

        for (String element : text) {
            if (element.equalsIgnoreCase(input)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(input + " was found!");
            label.setText(input + " was found!");
        } else {
            System.out.println("fail");
            label.setText("Please enter a valid company name.");
        }
    }
 
}
