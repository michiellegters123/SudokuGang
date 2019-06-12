package Rebus;

import Game.InterFace;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
/**
 * "Aan de slag met Java en JavaFX" opstartklasse
 * @author jiand
 */
public class Scrum extends Application 
{

    @Override
    public void start(Stage primaryStage) 
    {
        GridPane root = new GridPane();
        Scene scene = new Scene(root, 300, 250);

        // start here new Gui
        new Rebus(root);


        primaryStage.setTitle("Los alle rebussen op voor het code woord");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setMaximized(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        launch(args);
    }

}
