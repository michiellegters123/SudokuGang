/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import AlfabetischePuzzel.Puzzel;
import Game.InterFace;
import HusselPuzzel.GUI;
import Kleurenpuzzel.GUI2;
import Rebus.Rebus;
import Sudoku.GUI3;
import java.io.IOException;
import HusselPuzzel.GUI;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;


import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;


/**
 *
 * @author jiand
 */
public class MainScreen
{

    private final ImageView AlfabetichepuzzelImage,LandenspelImage,HusselPuzzleImage,KleurenPuzzleImage,RebusImage,SudokuImage,ZeelslagImage,AutoImage,ImageFill;
    private final Button btnAlfabetPuzzel,btnLandenPuzzel,btnHusselPuzzel,btnKleurenPuzzel,btnRebusPuzzel,btnSudokuPuzzel,btnZeeSlagGame,btnAutoPuzzel,btnImageFile;

    private boolean bool1 = false;
    private final ImageView foto1,foto2,foto3,foto4,foto5,foto6,foto7,foto8,foto9;
    private final Button b1,b2,b3,b4,b5,b6,b7,b8,b9;

    Stage primaryStage,stage; 
  
    
    public MainScreen(GridPane p)
    {
          AlfabetichepuzzelImage = new ImageView("img/AlfabetichepuzzelImage.png");
          LandenspelImage = new ImageView("img/LandenspelImage.png");
          HusselPuzzleImage = new ImageView("img/HusselPuzzleImage.jpg");
          KleurenPuzzleImage = new ImageView("img/KleurenPuzzleImage.PNG");
          RebusImage = new ImageView("img/Rebus.jpg");
          SudokuImage = new ImageView("img/SudokuImage.png");
          ZeelslagImage = new ImageView("img/ZeelslagImage.png");
          AutoImage = new ImageView("img/AutoImage.png");
          ImageFill = new ImageView("img/ImageFill.png");
          
          
          btnAlfabetPuzzel = new Button("",AlfabetichepuzzelImage);
          btnLandenPuzzel = new Button("",LandenspelImage);
          btnHusselPuzzel = new Button("",HusselPuzzleImage);
          btnKleurenPuzzel = new Button("",KleurenPuzzleImage);
          btnRebusPuzzel = new Button("",RebusImage);
          btnSudokuPuzzel = new Button("",SudokuImage);
          btnZeeSlagGame = new Button("",ZeelslagImage);
          btnAutoPuzzel = new Button("",AutoImage);
          btnImageFile= new Button("",ImageFill);
          
   
  
          btnAlfabetPuzzel.setOnAction(event ->{       
                Stage stage = (Stage) btnAlfabetPuzzel.getScene().getWindow();
                stage.close();

          foto1 = new ImageView("img/AlfabetichepuzzelImage.png");
          foto2 = new ImageView("img/LandenspelImage.png");
          foto3 = new ImageView("img/HusselPuzzleImage.jpg");
          foto4 = new ImageView("img/KleurenPuzzleImage.PNG");
          foto5 = new ImageView("img/Rebus.jpg");
          foto6 = new ImageView("img/SudokuImage.png");
          foto7 = new ImageView("img/ZeelslagImage.png");
          foto8 = new ImageView("img/ImageFill.png");
          foto9 = new ImageView("img/landkaart.jpg");
          
          b1 = new Button("",foto1);
          b2 = new Button("",foto2);
          b3 = new Button("",foto3);
          b4 = new Button("",foto4);
          b5 = new Button("",foto5);
          b6 = new Button("",foto6);
          b7 = new Button("",foto7);
          b8 = new Button("",foto8);
          b9 = new Button("",foto9);
          
          b9.prefHeight(128);
          b9.prefWidth(128);
                    
          b1.setOnAction(event ->
          {
              if(bool1 == true)
              {
                  bool1 = true;
                  System.out.println("Test");
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
              }
              else if(bool1 == true)
              {
                  System.out.println("Yeet");
              }
                

                new Puzzel(root); 
                dialog.setScene(scene);
                dialog.show();
        
          });
          
          btnLandenPuzzel.setOnAction(event ->{
                Stage stage = (Stage) btnLandenPuzzel.getScene().getWindow();
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
          
          btnHusselPuzzel.setOnAction(event ->{
                Stage stage = (Stage) btnHusselPuzzel.getScene().getWindow();
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
                
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Fout");
                alert.setHeaderText("Helaas");
                alert.setContentText("Je hebt het antwoord niet correct");
                alert.showAndWait();
          });
          
          btnKleurenPuzzel.setOnAction(event ->{
                Stage stage = (Stage) btnKleurenPuzzel.getScene().getWindow();
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
          
          btnRebusPuzzel.setOnAction(event ->{
                Stage stage = (Stage) btnRebusPuzzel.getScene().getWindow();
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
          
          btnSudokuPuzzel.setOnAction(event ->{
                Stage stage = (Stage) btnSudokuPuzzel.getScene().getWindow();
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
          
          btnZeeSlagGame.setOnAction(event ->{
              Stage stages = (Stage) btnZeeSlagGame.getScene().getWindow();
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
          

          btnAutoPuzzel.setOnAction(event ->{
              try {
			Runtime runTime = Runtime.getRuntime();
			Process process = runTime.exec("src\\ExeFiles\\CarChallenge.exe");
		} catch (IOException e) {

          b8.setOnAction(event ->
          {
               try {
			Runtime runTime = Runtime.getRuntime();
			Process process = runTime.exec("src\\ExeFiles\\CarChallenge.exe");
		} catch (Exception e) {

			e.printStackTrace();
		}
          });
          

          btnImageFile.setOnAction(event ->{

          b9.setOnAction(event ->
          {
              try {
			Runtime runTime = Runtime.getRuntime();
			Process process = runTime.exec("src\\ExeFiles\\cordGame.exe");
		} catch (Exception e) {
			e.printStackTrace();
		}
          });
          
          
          
          p.add(btnAlfabetPuzzel,0,0);
          p.add(btnLandenPuzzel,0,1);
          p.add(btnHusselPuzzel,0,2);
          p.add(btnKleurenPuzzel,1,0);
          p.add(btnRebusPuzzel,1,1);
          p.add(btnSudokuPuzzel,1,2);
          p.add(btnZeeSlagGame,2,0);
          p.add(btnAutoPuzzel,2,1);
          p.add(btnImageFile,2,2);
          
    }     
}
