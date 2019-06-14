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
    private boolean stop = false;

    @Override
    public void start(Stage primaryStage) 
    {
        GridPane root = new GridPane();
        Scene scene = new Scene(root);

        // start here new Gui
        new Rebus(root);


        primaryStage.setTitle("Los alle rebussen op om in de game te komen");
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setMaximized(true);
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
