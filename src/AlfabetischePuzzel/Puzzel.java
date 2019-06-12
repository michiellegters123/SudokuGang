/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlfabetischePuzzel;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author jiand
 */
public class Puzzel
{
    private final Label Woord;
    private final Button klik;
    private final VBox v1; 
    private final TextField t1;

    public Puzzel(GridPane p)
    {
        Woord = new Label("      a18b5c4d4e9f14g7h19i2j15k15l20m");
        klik = new Button("Check");
        v1 = new VBox(); 
        t1 = new TextField();
                
        t1.setMaxWidth(150);
        t1.setPrefWidth(t1.getText().length() * 7);
        t1.setAlignment(Pos.CENTER);
        
        Woord.setStyle("-fx-font: 30 arial;");
        klik.setAlignment(Pos.CENTER);
 
        
        v1.setPadding(new Insets(100, 0, 0,0));
        v1.setAlignment(Pos.CENTER);
        v1.getChildren().addAll(Woord,t1,klik);
        
        
        klik.setOnAction(event ->{
            String antwoord = "Reddingsboot";
            
            if(Woord.getText().equals(antwoord))
            {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Correct");
                alert.setHeaderText("Gefeliciteerd");
                alert.setContentText("De sleutel is: krijg a**s");
                alert.showAndWait();
            }
            else
            {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("FOUT");
                alert.setHeaderText("Gefaald");
                alert.setContentText("U heeft het woord verkeerd geraden");
                alert.showAndWait();
            }
        });
        
        t1.setOnAction(event ->{
            String antwoord = "reddingsboot";
            
            if(t1.getText().equals(antwoord))
            {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Correct");
                alert.setHeaderText("Gefeliciteerd");
                alert.setContentText("De sleutel is ****");
                alert.showAndWait();    
            }
            else
            {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("FOUT");
                alert.setHeaderText("Gefaald");
                alert.setContentText("U heeft het woord verkeerd geraden");
                alert.showAndWait();
            }
        });
        
        
        p.add(v1,6,2);
        
        
    }
    
}
