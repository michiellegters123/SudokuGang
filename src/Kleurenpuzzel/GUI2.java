/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kleurenpuzzel;

import Main.MainScreen;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Teun
 */
public class GUI2
{
    private Label uitleg,Veel,Geluk,Bij,Onze,Geweldige,Puzzel;
    private TextField Veelveld,Gelukveld,Bijveld,Onzeveld,Geweldigeveld,Puzzelveld;
    private Button knop;
    Stage primaryStage; 
    
    public GUI2(GridPane pane)
    {
        Color c = Color.web("9c4e16",1.0);
        uitleg = new Label("Bij deze puzzel moet je de juiste kleuren in de tekstvelden invullen");
        Veel = new Label("Veel:");
        Veel.setTextFill(Color.PURPLE);
        Veel.setFont(new Font("Arial Black",20));
        Geluk = new Label("Geluk:");
        Geluk.setTextFill(Color.ORANGE);
        Geluk.setFont(new Font("Arial Black",20));
        Bij = new Label("Bij:");
        Bij.setTextFill(Color.DARKVIOLET);
        Bij.setFont(new Font("Arial Black",20));
        Onze = new Label("Onze:");
        Onze.setTextFill(Color.GREY);
        Onze.setFont(new Font("Arial Black",20));
        Geweldige = new Label("Geweldige:");
        Geweldige.setTextFill(c);
        Geweldige.setFont(new Font("Arial Black",20));
        Puzzel = new Label("Puzzel:");
        Puzzel.setTextFill(Color.GREEN);
        Puzzel.setFont(new Font("Arial Black",20));
        
        Veelveld = new TextField();
        Gelukveld = new TextField();
        Bijveld = new TextField();
        Onzeveld = new TextField();
        Geweldigeveld = new TextField();
        Puzzelveld = new TextField();
        
        knop = new Button("Raad code");
        knop.setOnAction(event ->
        {
            String veel = Veelveld.getText();
            String geluk = Gelukveld.getText();
            String bij = Bijveld.getText();
            String onze = Onzeveld.getText();
            String geweldige = Geweldigeveld.getText();
            String puzzel = Puzzelveld.getText();
            
            if(veel.equals("violet") && geluk.equals("grijs") && bij.equals("bruin")
                    && onze.equals("oranje") && geweldige.equals("groen") && puzzel.equals("paars"))
            {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("GELUKT");
                alert.setHeaderText("U heeft de juiste kleuren");
                alert.setContentText("U heeft alle kleuren ingevuld de code is ****");
                alert.showAndWait();
                
                Stage stage = (Stage) knop.getScene().getWindow();
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
                alert.setHeaderText("verkeerde kleur");
                alert.setContentText("U heeft de verkeerde kleur(en) ingevoerd");
                alert.showAndWait();
            }
        });
        
        pane.add(uitleg, 0, 0);
        pane.add(Veel, 0, 1);
        pane.add(Geluk, 0, 2);
        pane.add(Bij, 0, 3);
        pane.add(Onze, 0, 4);
        pane.add(Geweldige, 0, 5);
        pane.add(Puzzel, 0, 6);
        pane.add(Veelveld, 1, 1);
        pane.add(Gelukveld, 1, 2);
        pane.add(Bijveld, 1, 3);
        pane.add(Onzeveld, 1, 4);
        pane.add(Geweldigeveld, 1, 5);
        pane.add(Puzzelveld, 1, 6);
        pane.add(knop, 0, 7);
        pane.setVgap(10);
        pane.setHgap(10);
        GridPane.setColumnSpan(uitleg, 3);
    }
}
