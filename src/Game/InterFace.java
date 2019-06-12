/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


/**
 *
 * @author michi
 */



public class InterFace
{
    private final Button land1, land2, land3, land4, land5, land6, land7, land8, enter;
    private final ImageView foto1, foto2, foto3, foto4, foto5, foto6, foto7, foto8;
    private final Label uitleg;
    private final TextField uitkomst;
    
    public InterFace(GridPane p)
    {
        foto1 = new ImageView("img/Bulgaria.png");
        land1 = new Button("", foto1);
        
        foto2 = new ImageView("img/Ierland.png");
        land2 = new Button("", foto2);
        
        foto3 = new ImageView("img/Kosovo.png");
        land3 = new Button("", foto3);
        
        foto4 = new ImageView("img/Middelandsezee.png");
        land4 = new Button("", foto4);
        
        foto5 = new ImageView("img/Oekraine.png");
        land5 = new Button("", foto5);
        
        foto6 = new ImageView("img/Slovenia.png");
        land6 = new Button("", foto6);
        
        foto7 = new ImageView("img/uganda.png");
        land7 = new Button("", foto7);
        
        foto8 = new ImageView("img/Österreich.png");
        land8 = new Button("", foto8);

        uitleg = new Label("Pak van elk ingekleurde gebied de eerste letter en vorm een woord" + "\r\n" + "Klik op het land voor de volgorde. Je hebt niet bij elk land een hint");
        uitkomst = new TextField("Uw antwoord");
        enter = new Button("Invoeren");
        
        enter.setOnAction(event->
        {
            
            if(uitkomst.getText().equals("kombuis"))
            {
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Correct");
                alert.setHeaderText("Gefeliciteerd");
                alert.setContentText("De sleutel is ****");
                alert.showAndWait();
            }
            else
            {
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Fout");
                alert.setHeaderText("Helaas");
                alert.setContentText("Je hebt het antwoord niet correct");
                alert.showAndWait();
            }
        });
        land1.setOnAction(event ->
        {
            System.out.println("het werkt");
        });
        
        
        land1.setMaxWidth(275);
        land1.setMaxHeight(275);
        foto1.setFitWidth(275);
        foto1.setFitHeight(275);
        land1.setOnAction(event->
        {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("");
            alert.setHeaderText("4");
            alert.setContentText("");
            alert.showAndWait();
        });
        
        land2.setMaxWidth(275);
        land2.setMaxHeight(275);
        foto2.setFitWidth(275);
        foto2.setFitHeight(275);
        land2.setOnAction(event->
        {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("");
            alert.setHeaderText("Geen hint");
            alert.setContentText("");
            alert.showAndWait();
        });
        
        land3.setMaxWidth(275);
        land3.setMaxHeight(275);
        foto3.setFitWidth(275);
        foto3.setFitHeight(275);
        land3.setOnAction(event->
        {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("");
            alert.setHeaderText("1");
            alert.setContentText("");
            alert.showAndWait();
        });
        
        land4.setMaxWidth(570);
        land4.setMaxHeight(275);
        foto4.setFitWidth(570);
        foto4.setFitHeight(275);
        land4.setOnAction(event->
        {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("");
            alert.setHeaderText("Geen hint");
            alert.setContentText("");
            alert.showAndWait();
        });
        
        land5.setMaxWidth(275);
        land5.setMaxHeight(275);
        foto5.setFitWidth(275);
        foto5.setFitHeight(275);
        land5.setOnAction(event->
        {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("");
            alert.setHeaderText("Geen hint");
            alert.setContentText("");
            alert.showAndWait();
        });
        
        land6.setMaxWidth(275);
        land6.setMaxHeight(275);
        foto6.setFitWidth(275);
        foto6.setFitHeight(275);
        land6.setOnAction(event->
        {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("");
            alert.setHeaderText("7");
            alert.setContentText("");
            alert.showAndWait();
        });
        
        land7.setMaxWidth(275);
        land7.setMaxHeight(275);
        foto7.setFitWidth(275);
        foto7.setFitHeight(275);
        land7.setOnAction(event->
        {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("");
            alert.setHeaderText("u");
            alert.setContentText("");
            alert.showAndWait();
        });
        
        land8.setMaxWidth(275);
        land8.setMaxHeight(275);
        foto8.setFitWidth(275);
        foto8.setFitHeight(275);   
        land8.setOnAction(event->
        {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("");
            alert.setHeaderText("Geen hint");
            alert.setContentText("");
            alert.showAndWait();
        });
        
        
        
        p.add(land1, 0, 0);
        p.add(land2, 1, 0);
        p.add(land3, 2, 0);
        p.add(land8, 0, 1);
        p.add(land5, 1, 1);
        p.add(land6, 2, 1);
        p.add(land7, 0, 2);
        p.add(land4, 1, 2, 2, 1);
        p.add(uitleg,1,3, 2, 2);
        p.add(uitkomst,1,5);
        p.add(enter,2,5);
         
        
        
    }

}
