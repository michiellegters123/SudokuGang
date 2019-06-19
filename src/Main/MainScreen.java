/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import AlfabetischePuzzel.Puzzel;
import Game.InterFace;
import Kleurenpuzzel.GUI2;
import Rebus.Rebus;
import Sudoku.GUI3;
import HusselPuzzel.GUI;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author jiand
 */
public class MainScreen
{
    private final ImageView foto1,foto2,foto3,foto4,foto5,foto6,foto7,foto8,foto9;
    private final Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Stage primaryStage,stage; 
  

    public MainScreen(GridPane p)
    {
          foto1 = new ImageView("img/AlfabetichepuzzelImage.png");
          foto2 = new ImageView("img/LandenspelImage.png");
          foto3 = new ImageView("img/HusselPuzzleImage.jpg");
          foto4 = new ImageView("img/KleurenPuzzleImage.PNG");
          foto5 = new ImageView("img/Rebus.jpg");
          foto6 = new ImageView("img/SudokuImage.png");
          foto7 = new ImageView("img/ZeelslagImage.png");
          foto8 = new ImageView("img/ImageFill.png");
          foto9 = new ImageView("img/ImageFill.png");
          
          b1 = new Button("",foto1);
          b2 = new Button("",foto2);
          b3 = new Button("",foto3);
          b4 = new Button("",foto4);
          b5 = new Button("",foto5);
          b6 = new Button("",foto6);
          b7 = new Button("",foto7);
          b8 = new Button("",foto8);
          b9 = new Button("",foto9);
          
          b1.setOnAction(event ->{
                Stage stage = (Stage) b1.getScene().getWindow();
                stage.close();
                
                GridPane root = new GridPane();
                Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.setTitle("Los deze Alfabetische puzzel op om de code te krijgen");
                dialog.initOwner(primaryStage);
                Scene scene = new Scene(root, 600, 300);
                
                new Puzzel(root); 
                dialog.setScene(scene);
                dialog.show();
          });
          
          b2.setOnAction(event ->{
                Stage stage = (Stage) b2.getScene().getWindow();
                stage.close();
                
                GridPane root = new GridPane();
                Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.setTitle("Los deze Landen game op om de code te krijgen");
                dialog.initOwner(primaryStage);
                Scene scene = new Scene(root, 900, 950);
                
                new InterFace(root); 
                dialog.setScene(scene);
                dialog.show();
          });
          
          b3.setOnAction(event ->{
                Stage stage = (Stage) b3.getScene().getWindow();
                stage.close();
                
                GridPane root = new GridPane();
                Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.setTitle("Verwissel de letters tot dat je het goede woord hebt");
                dialog.initOwner(primaryStage);
                Scene scene = new Scene(root, 575, 200);
                
                new GUI(root); 
                dialog.setScene(scene);
                dialog.show();
          });
          
          b4.setOnAction(event ->{
                Stage stage = (Stage) b4.getScene().getWindow();
                stage.close();
                
                GridPane root = new GridPane();
                Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.setTitle("Zet de juiste kleur in het juiste vak");
                dialog.initOwner(primaryStage);
                Scene scene = new Scene(root, 450, 315);
                
                new GUI2(root); 
                dialog.setScene(scene);
                dialog.show();
          });
          
          b5.setOnAction(event ->{
                Stage stage = (Stage) b5.getScene().getWindow();
                stage.close();
                
                GridPane root = new GridPane();
                Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.setTitle("Los alle rebussen op voor het code woord ");
                dialog.setMaximized(true);
                dialog.initOwner(primaryStage);
                Scene scene = new Scene(root, 400, 400);
                
                new Rebus(root); 
                dialog.setScene(scene);
                dialog.show();
          });
          
          b6.setOnAction(event ->{
                Stage stage = (Stage) b6.getScene().getWindow();
                stage.close();
                
                GridPane root = new GridPane();
                Stage dialog = new Stage();
                dialog.initModality(Modality.APPLICATION_MODAL);
                dialog.setTitle("Los de soduko op en vul de code hier in");
                dialog.initOwner(primaryStage);
                Scene scene = new Scene(root, 500, 250);
                
                new GUI3(root); 
                dialog.setScene(scene);
                dialog.show();
          });
          
          b7.setOnAction(event ->{
              Stage stages = (Stage) b7.getScene().getWindow();
              stages.close();
              
              try 
              {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/battleship/battleship.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setTitle("Win deze zeeslag om door te kunnnen gaan!!!");
                stage.setScene(new Scene(root1));  
                stage.show();
              } catch(Exception e) 
              {
                e.printStackTrace();
                 }
          });
          
          b8.setOnAction(event ->{
          });
          
          b9.setOnAction(event ->{
          });
          
          
          
          p.add(b1,0,0);
          p.add(b2,0,1);
          p.add(b3,0,2);
          p.add(b4,1,0);
          p.add(b5,1,1);
          p.add(b6,1,2);
          p.add(b7,2,0);
          p.add(b8,2,1);
          p.add(b9,2,2);
          
          
          
    }    
 
}
