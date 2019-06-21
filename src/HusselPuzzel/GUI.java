/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package husselpuzzel;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
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
    private int tries = 0;
    private final Label anker,uitleg1,hint;
    private final TextField veld_a,veld_n,veld_k,veld_e,veld_r,veld_k2,veld_e2,veld_t,veld_t2,veld_i,veld_n2,veld_g;  
    private final Button knop;
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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HusselPuzzel;

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
    private final Label anker,uitleg1,uitleg2,hint;
    private final TextField av,nv,kv,ev,rv,kkv,eev,tv,ttv,iv,nnv,gv;  
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
        
        uitleg1 = new Label("Bij deze puzzel moet je de letters in de juise volgorde leggen om een woord te krijgen.");
        uitleg2 = new Label("Als een letter op de juiste plek staat wordt het tekstveld groen en als het fout is rood.");
        hint = new Label("");
        
        
        knop = new Button("Raad woord");
        av = new TextField();
        av.setMaxWidth(30);
        nv = new TextField();
        nv.setMaxWidth(30);
        kv = new TextField();
        kv.setMaxWidth(30);
        ev = new TextField();
        ev.setMaxWidth(30);
        rv = new TextField();
        rv.setMaxWidth(30);
        kkv = new TextField();
        kkv.setMaxWidth(30);
        eev = new TextField();
        eev.setMaxWidth(30);
        tv = new TextField();
        tv.setMaxWidth(30);
        ttv = new TextField();
        ttv.setMaxWidth(30);
        iv = new TextField();
        iv.setMaxWidth(30);
        nnv = new TextField();
        nnv.setMaxWidth(30);
        gv = new TextField();
        gv.setMaxWidth(30);
        knop.setOnAction(event ->{
        checkLetter("a",av);
        checkLetter("n",nv);
        checkLetter("k",kv);
        checkLetter("e",ev);
        checkLetter("r",rv);
        checkLetter("k",kkv);
        checkLetter("e",eev);
        checkLetter("t",tv);
        checkLetter("t",ttv);
        checkLetter("i",iv);
        checkLetter("n",nnv);
        checkLetter("g",gv);
        tries++;
        if(av.getText().equals("a") && nv.getText().equals("n") && kv.getText().equals("k") && ev.getText().equals("e") &&
           rv.getText().equals("r") && kkv.getText().equals("k") && eev.getText().equals("e") && tv.getText().equals("t") && ttv.getText().equals("t") &&
           iv.getText().equals("i") && nnv.getText().equals("n") && gv.getText().equals("g"))
        {           
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
        pane.add(uitleg2, 0, 1);
        pane.add(anker, 0, 2);
        pane.add(av, 0, 3);
        pane.add(nv, 1, 3);
        pane.add(kv, 2, 3);
        pane.add(ev, 3, 3);
        pane.add(rv, 4, 3);
        pane.add(kkv, 5, 3);
        pane.add(eev, 6, 3);
        pane.add(tv, 7, 3);
        pane.add(ttv, 8, 3);
        pane.add(iv, 9, 3);
        pane.add(nnv, 10, 3);
        pane.add(gv, 11, 3);
        pane.add(knop, 1, 4);
        pane.add(hint, 1, 5);
        pane.setHgap(2);
        pane.setVgap(10);
        GridPane.setColumnSpan(uitleg1, 13);
        GridPane.setColumnSpan(uitleg2, 13);
        GridPane.setColumnSpan(anker, 13);
        GridPane.setColumnSpan(knop, 13);
        GridPane.setColumnSpan(hint, 13);
        GridPane.setHalignment(uitleg1, HPos.CENTER);
        GridPane.setHalignment(uitleg2, HPos.CENTER);
        GridPane.setHalignment(anker, HPos.CENTER);
        GridPane.setHalignment(knop, HPos.CENTER);
        GridPane.setHalignment(av, HPos.CENTER);
        GridPane.setHalignment(nv, HPos.CENTER);
        GridPane.setHalignment(kv, HPos.CENTER);
        GridPane.setHalignment(ev, HPos.CENTER);
        GridPane.setHalignment(rv, HPos.CENTER);
        GridPane.setHalignment(kkv, HPos.CENTER);
        GridPane.setHalignment(eev, HPos.CENTER);
        GridPane.setHalignment(tv, HPos.CENTER);
        GridPane.setHalignment(ttv, HPos.CENTER);
        GridPane.setHalignment(iv, HPos.CENTER);
        GridPane.setHalignment(nnv, HPos.CENTER);
        GridPane.setHalignment(gv, HPos.CENTER);
        GridPane.setMargin(av, new Insets(0, 0, 0, 107.5));
        GridPane.setMargin(knop, new Insets(0, 140, 0, 0));
    }
}
