/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Kleurenpuzzel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
/**
 *
 * @author Teun
 */
public class KleurPuzzel extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane root = new GridPane();
        new GUI2(root);
        Scene scene = new Scene(root, 450, 315);

        primaryStage.setTitle("Kleuren Puzzel");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
