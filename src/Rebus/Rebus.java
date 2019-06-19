/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rebus;





import Main.MainScreen;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;


/**
 *
 * @author jiand
 */
public class Rebus 
{  
    //private String wachtwoord = "kapitein";
    private final Image imagek,imagea,imageP,imagei,imaget,imagee,imagen;
    private final ImageView k,a,P,i,t,e,n;
    private final TextField txtK,txtA,txtP,txtI,txtT,txtE,txtN,txtWW;
    private final Label lblK,lblA,lblP,lblI,lblT,lblE,lblN, lblWW,lblgWW;
    Stage primaryStage; 
    
    public Rebus(GridPane p)
    {
        // imageviews
        k = new ImageView();
        a = new ImageView();
        P = new ImageView();
        i = new ImageView();
        t = new ImageView();
        e = new ImageView();
        n = new ImageView();
        
        // textfields
        txtK = new TextField();
        txtA = new TextField();
        txtP = new TextField();
        txtI = new TextField();
        txtT = new TextField();
        txtE = new TextField();
        txtN = new TextField();
        txtWW = new TextField();
        
        // labels
        lblK = new Label();
        lblA = new Label();
        lblP = new Label();
        lblI = new Label();
        lblT = new Label();
        lblE = new Label();
        lblN = new Label();
        lblWW = new Label("voor hier het woord in");
        lblgWW = new Label();
        
        // images
        imagek = new Image("img/Kompas.PNG");
        imagea = new Image("img/rAdar.PNG");
        imageP = new Image("img/Pelorus.PNG");
        imagei = new Image("img/astrolabIum.PNG");
        imaget = new Image("img/ocTant.PNG");
        imagee = new Image("img/peiltoEstel.PNG");
        imagen = new Image("img/laNdkaart.PNG");
        
        // img setters
        k.setImage(imagek);
        a.setImage(imagea);
        P.setImage(imageP);
        i.setImage(imagei);
        t.setImage(imaget);
        e.setImage(imagee);
        n.setImage(imagen);
        
        //actions 
        txtK.setOnAction(event -> {
            String antwoord = "kompas";
            
            if(txtK.getText().equals(antwoord))
            {
                lblK.setText("1e letter");
                System.out.println("d");
            }
        });
        
        txtA.setOnAction(event -> {
            String antwoord = "radar";
            
            if(txtA.getText().equals(antwoord))
            {
                lblA.setText("4e letter");
            }
        });
        
        txtP.setOnAction(event -> {
            String antwoord = "pelorus";
            
            if(txtP.getText().equals(antwoord))
            {
                lblP.setText("1e letter");
            }
        });
        
        txtI.setOnAction(event -> {
            String antwoord = "astrolabium";
            
            if(txtI.getText().equals(antwoord))
            {
                lblI.setText("9e letter");
            }
        });
        
        txtT.setOnAction(event -> {
            String antwoord = "octant";
            
            if(txtT.getText().equals(antwoord))
            {
                lblT.setText("3e letter");
            }
        });
        
        txtE.setOnAction(event -> {
            String antwoord = "peiltoestel";
            
            if(txtE.getText().equals(antwoord))
            {
                lblE.setText("10e letter");
            }
        });
        
        txtN.setOnAction(event -> {
            String antwoord = "landkaart";
            
            if(txtN.getText().equals(antwoord))
            {
                lblN.setText("3e letter");
            }
        });
        
        txtWW.setOnAction(event ->{
            String antwoord = "kapitein";
            Runtime runtime = Runtime.getRuntime();
            
            if(txtWW.getText().equals(antwoord))
            {
                 Stage stage = (Stage) txtWW.getScene().getWindow();
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
                lblgWW.setText("Probeer het opnieuw");
            }
        });
        
        // add to gridpane
        p.setHgap(5);
        p.setVgap(5);
        
        p.add(k,0,0); 
        p.add(txtK,1,0); 
        p.add(lblK,2,0);
        
        p.add(a,0,1);
        p.add(txtA,1,1);
        p.add(lblA,2,1);
        
        p.add(P,0,2);   
        p.add(txtP,1,2);
        p.add(lblP,2,2);
        
        p.add(i,0,3);
        p.add(txtI,1,3);
        p.add(lblI,2,3);
        
        p.add(t,0,4);
        p.add(txtT,1,4);
        p.add(lblT,2,4);
        
        p.add(e,0,5);
        p.add(txtE,1,5);
        p.add(lblE,2,5);
        
        p.add(n,0,6);
        p.add(txtN,1,6);
        p.add(lblN,2,6);
        
        p.add(lblWW,0,7);
        p.add(txtWW,1,7);
        p.add(lblgWW,2,7);

        
       
    }
    
}
