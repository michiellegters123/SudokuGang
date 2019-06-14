/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import AlfabetischePuzzel.Puzzel;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Locker
{
    private final TextField passWord;
    private final Label pwText;
    private final Button accept;
    Stage primaryStage;
    
    public Locker(GridPane p)
    {
        pwText = new Label("Voer hier uw Wachtwoord in");

        passWord = new TextField();
        passWord.setPromptText("Wachtwoord");
        
        accept = new Button("Verder");
        
        accept.setOnAction(event->
        {
            if(passWord.getText().equals("1111"))
            {
                GridPane root = new GridPane();
                Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.setTitle("Los de alfabetische puzzel op om het woord te krijgen!");
                dialog.initOwner(primaryStage);
                Scene scene = new Scene(root, 900, 960);
                
                new InterFace(root);
                dialog.setScene(scene);
                dialog.show();
            }
            else
            {
                System.out.println("te2st");
            }
        });
        
        p.add(pwText,0,0);
        p.add(passWord,0,1);
        p.add(accept,0,2);
        
    }
}
