/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlfabetischePuzzel;


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
public class Puzzel
{
    public boolean bool1 = false;
    private final Label Woord;
    private final Button b1;
    private final VBox v1; 
    private final TextField t1;
    String antwoord = "reddingsboot";
    Stage primaryStage;

    public boolean getBool()
    {
        return this.bool1;
    }
    
    public void setBool(boolean bool)
    {
        this.bool1 = bool;
    }
    
    
    public Puzzel(GridPane p)
    {
        Woord = new Label("      a18b5c4d4e9f14g7h19i2j15k15l20m");
        b1 = new Button("Check");
        v1 = new VBox(); 
        t1 = new TextField();
                
        t1.setMaxWidth(150);
        t1.setPrefWidth(t1.getText().length() * 7);
        t1.setAlignment(Pos.CENTER);
        
        Woord.setStyle("-fx-font: 30 arial;");
        b1.setAlignment(Pos.CENTER);
 
        
        v1.setPadding(new Insets(100, 0, 0,0));
        v1.setAlignment(Pos.CENTER);
        v1.getChildren().addAll(Woord,t1,b1);
        
        
        b1.setOnAction(event ->{  
            
            if(t1.getText().equals(antwoord))
            {                
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Correct");
                alert.setHeaderText("Gefeliciteerd");
                alert.setContentText("De sleutel is: krijg ****");
                alert.showAndWait();
                
                Stage stage = (Stage) b1.getScene().getWindow();
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
                alert.setContentText("U heeft het woord verkeerd geraden");
                alert.showAndWait();
            }
        });
        
        t1.setOnAction(event ->{         
            
            if(t1.getText().equals(antwoord))
            {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Correct");
                alert.setHeaderText("Gefeliciteerd");
                alert.setContentText("De sleutel is: krijg ****");
                alert.showAndWait();
                
                Stage stage = (Stage) t1.getScene().getWindow();
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
                alert.setContentText("U heeft het woord verkeerd geraden");
                alert.showAndWait();
            }
        });
        
        
        p.add(v1,6,2);
        
        
    }
    
}
