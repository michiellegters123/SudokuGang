/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package husselpuzzel;

import javafx.geometry.HPos;
import javafx.scene.control.Button;
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
    private final Label anker,uitleg1,uitleg2,hint;
    private final TextField av,nv,kv,ev,rv,kkv,eev,tv,ttv,iv,nnv,gv;  
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
        if(tries >=30)
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
        pane.add(knop, 12, 3);
        pane.add(hint, 13, 3);
        pane.setHgap(2);
        pane.setVgap(10);
        GridPane.setColumnSpan(uitleg1, 13);
        GridPane.setColumnSpan(uitleg2, 13);
        GridPane.setColumnSpan(anker, 13);
        GridPane.setHalignment(uitleg1, HPos.CENTER);
        GridPane.setHalignment(uitleg2, HPos.CENTER);
        GridPane.setHalignment(anker, HPos.CENTER);
    }
}
