/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * FXML Controller class
 *
 * @author pg3f4
 */
public class BattleshipController implements Initializable {
    @FXML
    private Rectangle r0;
    private GridPane board1;
    @FXML
    private GridPane board;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        double width = board.getWidth();
        double height = board.getHeight();
        double cellWidth = width/10;
        double cellHeight = height/10;

               /* //Rectangle r = new Rectangle();
               // GridPane.setConstraints(r, x, y);
               // board1.add(r, x, y);
                Rectangle r = new Rectangle(10, 10);
                //Color fill = new Color(0, 30, 0, 0.4);
                //r.setFill(fill);
               // r.setWidth(width);
                //r.setHeight(height);
                GridPane.setConstraints(r, x, y);
                board1.getChildren().add(r);*/
                for (Node node : board.getChildren()) {
                    Integer x = GridPane.getColumnIndex(node);
                    Integer y = GridPane.getRowIndex(node);
                    
                    if(x==null){
                        System.out.println("Trying to initialize column to 0");
                        GridPane.setColumnIndex(node, 0);
                    }
                    
                    if(y==null){
                        System.out.println("Trying to initialize row to 0");
                        GridPane.setRowIndex(node, 0);
                    }
                }
        Rectangle r = (Rectangle) getNode(board, 3, 3);
        r.setFill(Color.WHITE);
    }
    
    @FXML
    private void click(MouseEvent event){
        System.out.println("Click");
        Rectangle r = (Rectangle) event.getSource();
        GridPane g = (GridPane) r.getParent();
        
        int row = 0;
        try {
            row = GridPane.getRowIndex(r);
        } catch (Exception e) {
        }
        int col = 0;
        try {
            col = GridPane.getColumnIndex(r);
        } catch (Exception e) {
        }
        System.out.println("Location: " + row + ", " + col);
        System.out.println("RECTANGLE!");
       
        r.setFill(Color.WHITE);
        
    }    
    
    private Node getNode(GridPane gridPane, int col, int row) {
        int i = 0;
    for (Node node : board.getChildren()) {
        if(node == null){
            System.out.println("FAILED");
            return null;
        }
        if (GridPane.getColumnIndex(node) == col && GridPane.getRowIndex(node) == row) {
            return node;
        }
    }
    System.out.println(i);
    return null;
}
    
}
