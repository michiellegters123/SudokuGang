/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package husselpuzzel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
/**
 *
 * @author Teun
 */
public class HusselPuzzel extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane root = new GridPane();
        new GUI(root);
        Scene scene = new Scene(root, 575, 125);

        primaryStage.setTitle("Hussel-Puzzel!");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
