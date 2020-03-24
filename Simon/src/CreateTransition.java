import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.animation.*;
import javafx.util.Duration;


public class CreateTransition {
    private FillTransition[] ilumination;
    private Rectangle greenSquare = new Rectangle();
    private Rectangle redSquare = new Rectangle();
    private Rectangle yellowSquare = new Rectangle();
    private Rectangle blueSquare = new Rectangle();
    private Button start = new Button();
    private String[] colors = {"blue", "red", "green", "yellow"};
    private String[] colorOrder = {colors[new Random().nextInt(colors.length)],colors[new Random().nextInt(colors.length)],colors[new Random().nextInt(colors.length)],colors[new Random().nextInt(colors.length)],colors[new Random().nextInt(colors.length)],colors[new Random().nextInt(colors.length)],colors[new Random().nextInt(colors.length)],colors[new Random().nextInt(colors.length)],colors[new Random().nextInt(colors.length)],colors[new Random().nextInt(colors.length)]};

    private void giveTransitionProperties(FillTransition iluminate){
        iluminate.setDelay(Duration.seconds(0.1));
        iluminate.setAutoReverse(true);
        iluminate.setCycleCount(2);
        iluminate.setDuration(Duration.seconds(0.1));
    }

    public void createTransitions(){
        FillTransition iluminate0 = new FillTransition();
        giveTransitionProperties(iluminate0);
        FillTransition iluminate1 = new FillTransition();
        giveTransitionProperties(iluminate1);
        FillTransition iluminate2 = new FillTransition();
        giveTransitionProperties(iluminate2);
        FillTransition iluminate3 = new FillTransition();
        giveTransitionProperties(iluminate3);
        FillTransition iluminate4 = new FillTransition();
        giveTransitionProperties(iluminate4);
        FillTransition iluminate5 = new FillTransition();
        giveTransitionProperties(iluminate5);
        FillTransition iluminate6 = new FillTransition();
        giveTransitionProperties(iluminate6);
        FillTransition iluminate7 = new FillTransition();
        giveTransitionProperties(iluminate7);
        FillTransition iluminate8 = new FillTransition();
        giveTransitionProperties(iluminate8);
        FillTransition iluminate9 = new FillTransition();
        giveTransitionProperties(iluminate9);
        ilumination = new FillTransition[]{iluminate0,iluminate1,iluminate2,iluminate3,iluminate4,iluminate5,iluminate6,iluminate7,iluminate8,iluminate9};

    }

    public void createSquares(GridPane gamePane){
        greenSquare.setWidth(150);
        greenSquare.setHeight(150);
        greenSquare.setFill(Color.valueOf("2F7B26"));
        redSquare.setWidth(150);
        redSquare.setHeight(150);
        redSquare.setFill(Color.valueOf("832424"));
        yellowSquare.setWidth(150);
        yellowSquare.setHeight(150);
        yellowSquare.setFill(Color.valueOf("7F8324"));
        blueSquare.setWidth(150);
        blueSquare.setHeight(150);
        blueSquare.setFill(Color.valueOf("1F2487"));
        gamePane.add(greenSquare,1,0);
        gamePane.add(redSquare,1,1);
        gamePane.add(yellowSquare,2,0);
        gamePane.add(blueSquare,2,1);
        settingTransitions(gamePane);

    }

    public void settingTransitions(GridPane gamePane){
        createTransitions();
        for(int counter = 0; counter<ilumination.length; counter++ ){
            if(colorOrder[counter].equals("red")){
                ilumination[counter].setShape(redSquare);
                ilumination[counter].setToValue(Color.valueOf("FF3A00"));
            }else{
                if(colorOrder[counter].equals("blue")){
                    ilumination[counter].setShape(blueSquare);
                    ilumination[counter].setToValue(Color.valueOf("009EFF"));
                }else{
                    if(colorOrder[counter].equals("yellow")){
                        ilumination[counter].setShape(yellowSquare);
                        ilumination[counter].setToValue(Color.valueOf("CDFF00"));
                    }else{
                        if(colorOrder[counter].equals("green")){
                            ilumination[counter].setShape(greenSquare);
                            ilumination[counter].setToValue(Color.valueOf("00FF2A"));
                        }
                    }
                }
            }
            int Counter = counter;
            if(Counter+1!=ilumination.length) {
                ilumination[ counter ].setOnFinished(actionEvent -> {
                    ilumination[ Counter + 1 ].play();
                });
            }else{
                ilumination[Counter].setOnFinished(actionEvent -> {
                    start.setText("Start");
                    gamePane.add(start,2,2);
                });
            }
        }
        ilumination[0].setDelay(Duration.seconds(3));
        ilumination[0].play();
    }


}
