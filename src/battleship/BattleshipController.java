package battleship;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import java.util.Date;
import java.util.Calendar;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author pg3f4
 */
public class BattleshipController implements Initializable {
    
    public static void main(String[] args) 
    {
       Battleship b = new Battleship();
       b.launch(Battleship.class, args);
    }
    

    PlayerGrid playerGrid;
    PCGrid pcGrid;
    private int numShips = 10;
    private double cellSize = 30.0;
    private boolean needInput = true;
    private boolean clicked = false;
    private boolean needToRotate = true;
    private boolean isRotated = false;
    private boolean draggingBoat = false;
    private boolean placingBoats = true;
    private int IntHighScore = 0;
    private int IntCurrentScore = 7500;
    private Rectangle selectedShip;
    private AI ai = new AI();
    private int begin, eind;
    private String format = "mm";
    private int winstreak = 2;
    
    
    

    @FXML
    private Rectangle boat9;
    @FXML
    private Rectangle boat10;
    @FXML
    private Rectangle boat1;
    @FXML
    private GridPane pcDisplayBoard;
    @FXML
    private GridPane playerDisplayBoard;
    @FXML
    private AnchorPane anchor;
    @FXML
    private Rectangle boat2;
    @FXML
    private Rectangle boat3;
    @FXML
    private Rectangle boat4;
    @FXML
    private Button startButton;
    @FXML
    private Rectangle boat5;
    @FXML
    private Rectangle boat6;
    @FXML
    private Rectangle boat7;
    @FXML
    private Rectangle boat8;
    @FXML
    private Button aboutButton;
    @FXML
    private Label HighScore;
    @FXML
    private Label CurrentScore;
    @FXML
    private Label LabelC;
    @FXML
    private Label LabelH;
    
    
    

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        
        
        LabelH.setText("" + IntHighScore); 
        LabelC.setText("" + IntCurrentScore);
        
        Alert startAlert = new Alert(AlertType.INFORMATION);
        startAlert.setTitle("Welcome");
        startAlert.setHeaderText(null);
        startAlert.setContentText("Welkom bij de game!\nBegin alsjeblieft met het plaatsen van je schepen op het onderste-bord.\n(Klik om te draaien, Sleep om te plaatsenabout)");
        startAlert.showAndWait();
        playerGrid = new PlayerGrid(playerDisplayBoard);
        pcGrid = new PCGrid(pcDisplayBoard);
        reset();
    }

    /**
     * Puts game into Set-up state
     */
  public void reset() {
        startButton.disableProperty().set(true);

        selectedShip = boat1;

        //(re) initialize the display boards
        pcGrid.initGrid();
        playerGrid.initGrid();
        installPlayerBoardListeners(playerGrid);

        //Set-up boats, place them in the right spot
        installBoatListeners(boat1);
        boat1.setLayoutX(30);
        boat1.setLayoutY(340);
        boat1.setRotate(0);

        installBoatListeners(boat2);
        boat2.setLayoutX(30);
        boat2.setLayoutY(370);
        boat2.setRotate(0);

        installBoatListeners(boat3);
        boat3.setLayoutX(30);
        boat3.setLayoutY(400);
        boat3.setRotate(0);

        installBoatListeners(boat4);
        boat4.setLayoutX(30);
        boat4.setLayoutY(430);
        boat4.setRotate(0);

        installBoatListeners(boat5);
        boat5.setLayoutX(30);
        boat5.setLayoutY(460);
        boat5.setRotate(0);

        installBoatListeners(boat6);
        boat6.setLayoutX(30);
        boat6.setLayoutY(490);
        boat6.setRotate(0);

        installBoatListeners(boat7);
        boat7.setLayoutX(30);
        boat7.setLayoutY(520);
        boat7.setRotate(0);

        installBoatListeners(boat8);
        boat8.setLayoutX(30);
        boat8.setLayoutY(550);
        boat8.setRotate(0);

        for (Node node : pcDisplayBoard.getChildren()) {
            Rectangle rect = (Rectangle) node;
            rect.setDisable(true);
        }

        ai.reset();
    }
    
    public void reset2() {
        startButton.disableProperty().set(true);

        selectedShip = boat1;

        //(re) initialize the display boards
        pcGrid.initGrid();
        playerGrid.initGrid();
        installPlayerBoardListeners(playerGrid);

        //Set-up boats, place them in the right spot
        installBoatListeners(boat1);
        boat1.setLayoutX(30);
        boat1.setLayoutY(340);
        boat1.setRotate(0);

        installBoatListeners(boat2);
        boat2.setLayoutX(30);
        boat2.setLayoutY(370);
        boat2.setRotate(0);

        installBoatListeners(boat3);
        boat3.setLayoutX(30);
        boat3.setLayoutY(400);
        boat3.setRotate(0);

        installBoatListeners(boat4);
        boat4.setLayoutX(30);
        boat4.setLayoutY(430);
        boat4.setRotate(0);

        installBoatListeners(boat5);
        boat5.setLayoutX(30);
        boat5.setLayoutY(460);
        boat5.setRotate(0);

        installBoatListeners(boat6);
        boat6.setLayoutX(30);
        boat6.setLayoutY(490);
        boat6.setRotate(0);

        installBoatListeners(boat7);
        boat7.setLayoutX(30);
        boat7.setLayoutY(520);
        boat7.setRotate(0);

        installBoatListeners(boat8);
        boat8.setLayoutX(30);
        boat8.setLayoutY(550);
        boat8.setRotate(0);
        
          
        installBoatListeners(boat9);
        boat9.setLayoutX(30);
        boat9.setLayoutY(310);
        boat9.setRotate(0);

        

        for (Node node : pcDisplayBoard.getChildren()) {
            Rectangle rect = (Rectangle) node;
            rect.setDisable(true);
        }

        ai.reset();
    }
    
    public void reset3() {
        startButton.disableProperty().set(true);

        selectedShip = boat1;

        //(re) initialize the display boards
        pcGrid.initGrid();
        playerGrid.initGrid();
        installPlayerBoardListeners(playerGrid);

        //Set-up boats, place them in the right spot
        installBoatListeners(boat1);
        boat1.setLayoutX(30);
        boat1.setLayoutY(340);
        boat1.setRotate(0);

        installBoatListeners(boat2);
        boat2.setLayoutX(30);
        boat2.setLayoutY(370);
        boat2.setRotate(0);

        installBoatListeners(boat3);
        boat3.setLayoutX(30);
        boat3.setLayoutY(400);
        boat3.setRotate(0);

        installBoatListeners(boat4);
        boat4.setLayoutX(30);
        boat4.setLayoutY(430);
        boat4.setRotate(0);

        installBoatListeners(boat5);
        boat5.setLayoutX(30);
        boat5.setLayoutY(460);
        boat5.setRotate(0);

        installBoatListeners(boat6);
        boat6.setLayoutX(30);
        boat6.setLayoutY(490);
        boat6.setRotate(0);

        installBoatListeners(boat7);
        boat7.setLayoutX(30);
        boat7.setLayoutY(520);
        boat7.setRotate(0);

        installBoatListeners(boat8);
        boat8.setLayoutX(30);
        boat8.setLayoutY(550);
        boat8.setRotate(0);
        
                
        installBoatListeners(boat10);
        boat10.setLayoutX(30);
        boat10.setLayoutY(280);
        boat10.setRotate(0);

        for (Node node : pcDisplayBoard.getChildren()) {
            Rectangle rect = (Rectangle) node;
            rect.setDisable(true);
        }

        ai.reset();
    }

    /**
     * Install listeners on rectangles to install drag/drop, interact with displayBoard, etc.
     *
     * @param boat the Shape that the boat listeners are being installed on
     */
    private void installBoatListeners(Node boat) {
        final Delta dragDelta = new Delta();

        boat.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                clicked = true;
                needToRotate = true;
                Rectangle rect = (Rectangle) boat;
                select(rect);
                if (boat.rotateProperty().getValue() == 0) {
                    isRotated = false;
                } else {
                    isRotated = true;
                }
                double localX = boat.getLayoutX() - 225;
                double localY = boat.getLayoutY() - 334;
                if (isRotated) {
                    localX = localX + selectedShip.getWidth() / 2;
                    localY = localY - selectedShip.getWidth() / 2 + cellSize;
                }
                int size = (int) ((int) selectedShip.getWidth() / cellSize);
                int x = (int) (localX / cellSize);
                int y = (int) (localY / cellSize);
                Ship removeShip = null;
                for (Ship ship : playerGrid.ships) {
                    if (ship.getStartX() == x && ship.getStartY() == y) {
                        removeShip = ship;
                        for (int x2 = removeShip.getStartX(); x2 <= removeShip.getEndX(); x2++) {
                            for (int y2 = removeShip.getStartY(); y2 <= removeShip.getEndY(); y2++) {
                                playerGrid.gameBoard.get(x2).get(y2).setShip(null);
                            }
                        }
                        if (removeShip != null) {
                            if (removeShip.getIsSet()) {
                                if (!isRotated) {
                                    if (playerDisplayBoard.contains(localX, localY)) {
                                        for (int i = 0; i < size && i <= 9 - x; i++) {
                                            Rectangle r = (Rectangle) playerGrid.getNode(x + i, y);
                                            r.setFill(Color.BLACK);
                                        }

                                    }
                                }
                                if (isRotated) {
                                    if (playerDisplayBoard.contains(localX, localY)) {
                                        for (int i = 0; i < size && i <= 9 - y; i++) {
                                            Rectangle r = (Rectangle) playerGrid.getNode(x, y + i);
                                            r.setFill(Color.BLACK);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                if (playerGrid.ships.remove(removeShip)) {
                    startButton.disableProperty().set(true);
                }
                boat.setCursor(Cursor.MOVE);
            }
        });
        boat.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                clicked = false;
                boat.setCursor(Cursor.HAND);
                draggingBoat = false;
            }
        });
        boat.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                needToRotate = false;
                if (boat.rotateProperty().getValue() == 0) {
                    isRotated = false;
                } else {
                    isRotated = true;
                }

                draggingBoat = true;

                if (isRotated) {
                    boat.setLayoutX(mouseEvent.getSceneX() - (boat.getBoundsInLocal().getWidth() / 2));
                    boat.setLayoutY(mouseEvent.getSceneY() + (boat.getBoundsInLocal().getWidth() / 3));   //Not sure how much sense the math makes here, but it works right.
                } else {
                    boat.setLayoutX(mouseEvent.getSceneX());
                    boat.setLayoutY(mouseEvent.getSceneY());
                }
            }
        });
        boat.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                boat.setCursor(Cursor.HAND);
            }
        });
        boat.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent mouseEvent) {
                if (needToRotate) {
                    //boat.setLayoutX(mouseEvent.getSceneX());
                    //boat.setLayoutY(mouseEvent.getSceneY());
                    if (boat.rotateProperty().getValue() == 0) {
                        boat.setRotate(90.0);
                    } else boat.setRotate(0);
                }
            }

        });
    }

    /**
     * Install listeners on pcBoard rectangles to allow for a way to interact with the PC game board through the PC display board
     */
    void installPCBoardListeners(PCGrid grid) {
        for (Node node : pcDisplayBoard.getChildren()) {
            Rectangle rect = (Rectangle) node;
            rect.disableProperty().set(false);

            rect.setOnMouseClicked(new EventHandler<MouseEvent>() {
                public void handle(MouseEvent event) {
                    Rectangle r = (Rectangle) event.getSource();
                    GridPane g = (GridPane) r.getParent();

                    int col = GridPane.getColumnIndex(r);
                    int row = GridPane.getRowIndex(r);

                    if (pcGrid.gameBoard.get(col).get(row).isPressed()) {
                        return;
                    }

                    pcGrid.guess(col, row, ai);

                    if (grid.checkWin()) {
                        Alert winAlert = new Alert(AlertType.INFORMATION);
                        winAlert.setTitle("VICTORY");
                        winAlert.setHeaderText(null);
                        winAlert.setContentText("Jij wint!\nBedankt voor het spelen!");
                        winAlert.showAndWait();
                        
                        int Level = winstreak;
                        switch (Level) {                        
                          case 2:
                            reset2();
                            Alert Level2 = new Alert(AlertType.INFORMATION);
                            Level2.setTitle("Level 2");
                            Level2.setHeaderText(null);
                            Level2.setContentText("Je hebt level 2 gehaald. inplaats van 8 schepen heb je er nu 9");
                            Level2.showAndWait();
                            winstreak++;
                            System.out.println("2e level");
                            break;
                          case 3:
                            reset3();
                            Alert Level3 = new Alert(AlertType.INFORMATION);
                            Level3.setTitle("Level 2");
                            Level3.setHeaderText(null);
                            Level3.setContentText("Je hebt level 3 gehaald, dit is het laatse level. inplaats van 9 schepen heb je er nu 10");
                            Level3.showAndWait();
                            System.out.println("3e level");
                            break;                   
                        }

                    } else {
                        //PC Takes turn
                        //Sleep so user thinks PC is 'thinking.' -- increased immersion
                        try {
                            TimeUnit.MICROSECONDS.sleep(200);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(BattleshipController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        int x = ai.nextX();
                        int y = ai.nextY();

                        //A human wouldn't guess the same spot twice
                        while (playerGrid.gameBoard.get(x).get(y).isPressed()) {
                            ai.generate();
                            x = ai.nextX();
                            y = ai.nextY();
                            
                        }
                        playerGrid.guess(x, y, ai);
                        if (playerGrid.checkWin()) {
                            Alert loseAlert = new Alert(AlertType.INFORMATION);
                            loseAlert.setTitle("DEFEAT");
                            loseAlert.setHeaderText(null);
                            loseAlert.setContentText("Jij hebt verloren.\nBedankt voor het spelen!");
                            loseAlert.showAndWait();
                            //reset();
                            
                            reset();
                            
                        }
                    }
                }
            });

            rect.setOnMouseEntered(new EventHandler<MouseEvent>() {
                public void handle(MouseEvent event) {
                    if (!pcGrid.gameBoard.get(GridPane.getColumnIndex(rect)).get(GridPane.getRowIndex(rect)).isPressed())
                        rect.setStrokeWidth(3.0);
                }
            });

            rect.setOnMouseExited(new EventHandler<MouseEvent>() {
                public void handle(MouseEvent event) {
                    rect.setStrokeWidth(0.5);
                }
            });
        }
    }

    /**
     * Install listeners on playerBoard to create a bridge between player display and game boards
     */
    void installPlayerBoardListeners(PlayerGrid grid) {
        anchor.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (!clicked)
                    return;

                anchor.setOnMouseReleased(new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent event2) {
                        //Adjust pointer to make up for Grid's offset
                        double localX = event2.getX() - 225.0;
                        double localY = event2.getY() - 334.0;
                        int size = (int) ((int) selectedShip.getWidth() / cellSize);
                        if (playerDisplayBoard.contains(localX, localY)) {
                            int x = (int) (localX / cellSize);
                            int y = (int) (localY / cellSize);
                            Rectangle r = (Rectangle) playerGrid.getNode(x, y);
                            int endX, endY;
                            if (isRotated) {
                                selectedShip.setLayoutX(r.getLayoutX() + r.getParent().getTranslateX() - selectedShip.getWidth() / 2 + cellSize / 2);
                                selectedShip.setLayoutY(r.getLayoutY() + r.getParent().getTranslateY() + size * cellSize - selectedShip.getWidth() / 2 - cellSize / 2 + 5);
                                endX = x;
                                endY = y + size - 1;
                            } else {
                                selectedShip.setLayoutX(r.getLayoutX() + r.getParent().getTranslateX());
                                selectedShip.setLayoutY(r.getLayoutY() + r.getParent().getTranslateY() + 5);
                                endX = x + size - 1;
                                endY = y;
                            }

                            Ship ship = new Ship(size, x, y, endX, endY);
                            grid.addShip(ship, isRotated);


                            Paint col;
                            if (grid.isValid(x, y, size, isRotated)) {
                                col = Color.GREEN;
                                playerGrid.ships.add(ship);
                                ship.setIsSet(true);
                                if (playerGrid.ships.size() == 8)
                                    startButton.disableProperty().set(false);

                                for (int i = 0; i < size && i < 9; i++) {
                                    if (isRotated) {
                                        if (y + i <= 9)
                                            r = (Rectangle) playerGrid.getNode(x, y + i);

                                    } else {
                                        if (x + i <= 9)
                                            r = (Rectangle) playerGrid.getNode(x + i, y);
                                    }
                                    r.setFill(col);
                                }
                            }

                        }


                        anchor.setOnMouseReleased(null);

                    }
                });
            }

        });
    }


    /**
     * Displays information about the application
     *
     * @param event the action of pressing the button
     */
    @FXML
    private void showAbout(ActionEvent event) {
        Alert aboutAlert = new Alert(AlertType.INFORMATION);
        aboutAlert.setTitle("Informatie");
        aboutAlert.setHeaderText("Bericht");
        aboutAlert.setContentText("Om het wactwoord te krijgen moet je deze game Xkeer winnen!" + "/r/n" + "Je begint met een score van 5000 punten.");
        aboutAlert.showAndWait();
    }

    /**
     * Highlights a boat
     *
     * @param boat the boat to select
     * @return
     */
    private Rectangle select(Rectangle boat) {
        selectedShip.setStroke(Color.WHITE);
        selectedShip.setStrokeWidth(1.0);
        if (boat != null) {
            boat.setStrokeWidth(2.5);
            boat.setStroke(Color.WHITE);
        }
        selectedShip = boat;
        return selectedShip;
    }

    /**
     * Changes application from set-up state to game state
     *
     * @param event
     */
    @FXML
    private void startGame(ActionEvent event) {  
        Date date = new Date();
        Calendar c = GregorianCalendar.getInstance();
        c.setTime(date); 
        int begin = c.get(Calendar.MINUTE);
        this.begin = begin;
        System.out.println(""+ begin);
        
       
        
        Alert startAlert = new Alert(AlertType.INFORMATION);
        startAlert.setTitle("Starting. . .");
        startAlert.setHeaderText(null);
        startAlert.setContentText("Goed gedaan!\nJij mag als eerst!\nSelecteer de plek op het bovenste bord die je wilt raden.");
        startAlert.showAndWait();
        
        

        //Deselect boat
        select(null);

        //Change color of all spaces in player Display board to black
        for (int x = 0; x <= 9; x++) {
            for (int y = 0; y <= 9; y++) {
                ((Rectangle) playerGrid.getNode(x, y)).setFill(Color.BLACK);
            }
        }

        //Remove all listeners so we can't interact with player display board or boats
        for (Node node : anchor.getChildren()) {
            node.setOnMouseClicked(null);
            node.setOnMouseDragged(null);
            node.setOnMouseReleased(null);
            node.setOnMousePressed(null);
            node.setOnMouseEntered(null);
        }
        anchor.setOnMouseReleased(null);
        anchor.setOnMouseDragged(null);

        //Get PC grid ready
        pcGrid.initGrid();
        installPCBoardListeners(pcGrid);

        startButton.disableProperty().set(true);

    }
    

    class Delta {
        double x, y;
    }
}
