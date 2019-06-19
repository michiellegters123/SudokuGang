package Rebus;

import Game.InterFace;
import Main.MainScreen;
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
    private boolean stop = false;

    @Override
    public void start(Stage primaryStage) 
    {
        GridPane root = new GridPane();
        Scene scene = new Scene(root);

        // start here new Gui
        new MainScreen(root);


        primaryStage.setTitle("Los alle rebussen op voor het code woord");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void stopProgram()
    {
        this.stop = true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        launch(args);
    }

}
