/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sudoku;

import Game.InterFace;
import Main.MainScreen;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author jiand
 */
public class GUI3
{
    private final Label Woord;
    private final Button klik;
    private final VBox v1; 
    private final TextField t1;
    Stage primaryStage;

    public GUI3(GridPane p)
    {
        Woord = new Label("         Voor hier de laatste code" + "\r\n" + "  in om weg te komen van het schip");
        klik = new Button("Voer code in");
        v1 = new VBox(); 
        t1 = new TextField();
                
        t1.setMaxWidth(150);
        t1.setPrefWidth(t1.getText().length() * 7);
        t1.setAlignment(Pos.CENTER);
        
        Woord.setStyle("-fx-font: 30 arial;");
   
 
        
        v1.setPadding(new Insets(50, 0, 0,0));
        v1.setAlignment(Pos.TOP_CENTER);
        v1.getChildren().addAll(Woord,t1,klik);
        
        
        klik.setOnAction(event ->{
            String antwoord = "56136";
            
            if(t1.getText().equals(antwoord))
            {
                Stage stage = (Stage) klik.getScene().getWindow();
                stage.close();
                
                GridPane root = new GridPane();
                Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.setTitle("MainScreen");
                dialog.initOwner(primaryStage);
                Scene scene = new Scene(root);
                
                new MainScreen(root); 
                dialog.setScene(scene);
                dialog.show();
            }
            else
            {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("FOUT");
                alert.setHeaderText("Gefaald");
                alert.setContentText("Verkeerde vode probeer het opnieuw");
                alert.showAndWait();
            }
        });
        
        t1.setOnAction(event ->{
            String antwoord = "56136";
            
            if(t1.getText().equals(antwoord))
            {
                Stage stage = (Stage) klik.getScene().getWindow();
                stage.close();
                
                GridPane root = new GridPane();
                Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.setTitle("MainScreen");
                dialog.initOwner(primaryStage);
                Scene scene = new Scene(root);
                
                new MainScreen(root); 
                dialog.setScene(scene);
                dialog.show();
            }
            else
            {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("FOUT");
                alert.setHeaderText("Gefaald");
                alert.setContentText("Verkeerde vode probeer het opnieuw");
                alert.showAndWait();
            }
        });
        
        
        p.add(v1,6,2);
        
        
    }
    
}
