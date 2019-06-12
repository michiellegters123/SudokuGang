/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eindescapecode;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Teun
 */
public class GUI
{
    private final Label label;
    private final TextField tekstveld;
    private final Button knop;
    
    public GUI(GridPane pane)
    {
        Alert alert = new Alert(Alert.AlertType.NONE,"default Dialog",ButtonType.FINISH);
        label = new Label("Vul hier de laaste code in om weg te komen van het schip");
        tekstveld = new TextField();
        knop = new Button("Voer code in");
        knop.setOnAction(event ->{
        if(tekstveld.getText().equals("56136"))
        {
            alert.setHeaderText("Gefeliciteerd!");
            alert.setContentText("Je hebt de escape room gehaald");
            alert.show();
        }
        });
        pane.add(label, 0, 0);
        pane.add(tekstveld, 0, 1);
        pane.add(knop, 0, 2);
        pane.setVgap(10);
        label.setAlignment(Pos.CENTER);
        tekstveld.setAlignment(Pos.CENTER);
        tekstveld.setMaxWidth(100);
        knop.setAlignment(Pos.CENTER);
        GridPane.setHalignment(label, HPos.CENTER);
        GridPane.setHalignment(tekstveld, HPos.CENTER);
        GridPane.setHalignment(knop, HPos.CENTER);
    }
}
