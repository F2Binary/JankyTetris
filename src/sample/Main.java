package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.text.Normalizer;
import java.util.Arrays;
import java.util.Timer;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.KeyEvent;



public class Main extends Application {
    // We let the space a piece travels to be 25; however, its value can be changed for faster gameplay
    public static final int blockMove = 25;
    public static final int blockSize = 25;
    public static final int xMax = blockSize * 12;
    public static int yMax = blockSize * 24;
    public static int [][] tetrisBoard = new int [xMax/blockSize][yMax/blockSize];
    private static Pane group = new Pane();
    private static Form object;
    private static Scene scene = new Scene(group,xMax+150,yMax);
    public int score = 0;
    private static int LineNumber = 0;
    private static boolean game = true;
    private static Form nextObj = Controller.makeRect();









    @Override
    public void start(Stage primaryStage) throws Exception{
        for(int[] a: tetrisBoard){
            Arrays.fill(a,0);
        }
        Line line = new Line(xMax,0,xMax,yMax);
        Text scoretext = new Text("Score ");
        scoretext.setStyle("-fx-font: 20 arials;");
        scoretext.setY(50);
        scoretext.setX(xMax + 5);
        Text level = new Text("Lines: ");
        level.setStyle("-fx-font: 20 arials;");
        level.setY(100);
        level.setX(xMax + 5);
        level.setFill((Color.PINK));
        group.getChildren().addAll(scoretext,line,level);

        Form a = nextObj;
        group.getChildren().addAll(a.a,a.b,a.c,a.d);
        //moveOnKeyPress(a);

        object = a;
        nextObj = Controller.makeRect();
        primaryStage.setScene(scene);
        primaryStage.setTitle("Janky Tetris");
        primaryStage.show();



    }

    public static void main(String[] args) { launch(args);

    }
}
