/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.util.ArrayList;
import javafx.scene.layout.GridPane;

/**
 *
 * @author pg3f4
 */
public class PlayerGrid extends Grid{

    public PlayerGrid(GridPane gp) {
        super(gp);
        this.mode = 1;
    }

    @Override
    void initGrid() {
        for (int x = 0; x < 10; x++) {
            ArrayList<Space> row = new ArrayList(10);
            for (int y = 0; y < 10; y++) {
                row.add(new Space());
            }
            gameBoard.add(row);
        }
                
        ships.clear();
        
        this.clearDisplayBoard();
    }
    
}
