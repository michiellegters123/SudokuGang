/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HPuzzel;

import Main.MainScreen;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Teun
 */
public class GUI
{
    private int tries = 0;
    private final Label anker,uitleg1,hint;
    private final TextField veld_a,veld_n,veld_k,veld_e,veld_r,veld_k2,veld_e2,veld_t,veld_t2,veld_i,veld_n2,veld_g;  
    private final Button knop;
    Stage primaryStage;
    public void checkLetter(String letter, TextField txt)
        {
            if(txt.getText().equals(letter))
            {
                txt.setStyle("-fx-background-color: limegreen;");
                txt.setEditable(false);
            }
            else
            {
                txt.setStyle("-fx-background-color: red;");
                txt.setText("");
            }
        }
    public GUI(GridPane pane)
    {
        anker = new Label("tiknretkenag");
        uitleg1 = new Label("Bij deze puzzel moet je de letters in de juise volgorde leggen om een woord te krijgen. \r\n Als een letter op de juiste plek staat wordt het tekstveld groen en als het fout is rood.");
        hint = new Label("");; 
        
                knop = new Button("Raad woord");
        veld_a = new TextField();
        veld_a.setMaxWidth(30);
        veld_n = new TextField();
        veld_n.setMaxWidth(30);
        veld_k = new TextField();
        veld_k.setMaxWidth(30);
        veld_e = new TextField();
        veld_e.setMaxWidth(30);
        veld_r = new TextField();
        veld_r.setMaxWidth(30);
        veld_k2 = new TextField();
        veld_k2.setMaxWidth(30);
        veld_e2 = new TextField();
        veld_e2.setMaxWidth(30);
        veld_t = new TextField();
        veld_t.setMaxWidth(30);
        veld_t2 = new TextField();
        veld_t2.setMaxWidth(30);
        veld_i = new TextField();
        veld_i.setMaxWidth(30);
        veld_n2 = new TextField();
        veld_n2.setMaxWidth(30);
        veld_g = new TextField();
        veld_g.setMaxWidth(30);
        knop.setOnAction(event ->{
        checkLetter("a",veld_a);
        checkLetter("n",veld_n);
        checkLetter("k",veld_k);
        checkLetter("e",veld_e);
        checkLetter("r",veld_r);
        checkLetter("k",veld_k2);
        checkLetter("e",veld_e2);
        checkLetter("t",veld_t);
        checkLetter("t",veld_t2);
        checkLetter("i",veld_i);
        checkLetter("n",veld_n2);
        checkLetter("g",veld_g);
        tries++;
        if(veld_a.getText().equals("a") && veld_n.getText().equals("n") && veld_k.getText().equals("k") && veld_e.getText().equals("e") &&
           veld_r.getText().equals("r") && veld_k2.getText().equals("k") && veld_e2.getText().equals("e") && veld_t.getText().equals("t") && veld_t2.getText().equals("t") &&
           veld_i.getText().equals("i") && veld_n2.getText().equals("n") && veld_g.getText().equals("g"))
        {
            Alert alert = new Alert(Alert.AlertType.NONE,"code:",ButtonType.FINISH);
            alert.show();
            
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
        if(tries >=10)
        {
            hint.setText("Het zit vast aan een anker");
        }
        });
        pane.add(uitleg1, 0, 0);
        pane.add(anker, 0, 1);
        pane.add(veld_a, 0, 2);
        pane.add(veld_n, 1, 2);
        pane.add(veld_k, 2, 2);
        pane.add(veld_e, 3, 2);
        pane.add(veld_r, 4, 2);
        pane.add(veld_k2, 5, 2);
        pane.add(veld_e2, 6, 2);
        pane.add(veld_t, 7, 2);
        pane.add(veld_t2, 8, 2);
        pane.add(veld_i, 9, 2);
        pane.add(veld_n2, 10, 2);
        pane.add(veld_g, 11, 2);
        pane.add(knop, 1, 3);
        pane.add(hint, 1, 4);
        pane.setHgap(2);
        pane.setVgap(10);
        GridPane.setColumnSpan(uitleg1, 13);
        GridPane.setColumnSpan(anker, 13);
        GridPane.setColumnSpan(knop, 13);
        GridPane.setColumnSpan(hint, 13);
        GridPane.setHalignment(uitleg1, HPos.CENTER);
        GridPane.setHalignment(anker, HPos.CENTER);
        GridPane.setHalignment(knop, HPos.CENTER);
        GridPane.setHalignment(veld_a, HPos.CENTER);
        GridPane.setHalignment(veld_n, HPos.CENTER);
        GridPane.setHalignment(veld_k, HPos.CENTER);
        GridPane.setHalignment(veld_e, HPos.CENTER);
        GridPane.setHalignment(veld_r,HPos.CENTER);
        GridPane.setHalignment(veld_k2, HPos.CENTER);
        GridPane.setHalignment(veld_e, HPos.CENTER);
        GridPane.setHalignment(veld_t, HPos.CENTER);
        GridPane.setHalignment(veld_t2, HPos.CENTER);
        GridPane.setHalignment(veld_i, HPos.CENTER);
        GridPane.setHalignment(veld_n2, HPos.CENTER);
        GridPane.setHalignment(veld_g, HPos.CENTER);
        GridPane.setMargin(veld_a, new Insets(0, 0, 0, 107.5));
        GridPane.setMargin(knop, new Insets(0, 140, 0, 0));
        GridPane.setMargin(hint, new Insets(0, 0, 0, 65));
    }
}

