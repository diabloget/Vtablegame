import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Connect4 extends Application{
    private GridPane paneForGame =  new GridPane();
    private Circle[][] positions = new Circle[6][7];
    public Scene connect4 =  new Scene(paneForGame, 515, 585);
    public String[][] gameMatrix=new String[6][7];

    public void setGameMatrix(String[][] gameMatrix) {
        this.gameMatrix = gameMatrix;
        for(int y=0; y<6; y++){
            for(int x=0; x<7; x++){
                gameMatrix[y][x]="black";
            }
        }
    }


    public void refreshColor(){
        for(int y=0; y<6; y++){
            for(int x=0; x<7; x++){
                if(gameMatrix[y][x].equals("black")){
                    positions[y][x].setFill(Color.BLACK);
                    paneForGame.add(positions[y][x],y,x);
                }else {
                    if(gameMatrix[y][x].equals("blue")){
                        positions[y][x].setFill(Color.BLUE);
                        paneForGame.add(positions[y][x],y,x);
                    }else {
                        if(gameMatrix[y][x].equals("red")){
                            positions[y][x].setFill(Color.RED);
                            paneForGame.add(positions[y][x],y,x);
                        }}
                }
            }
        }

    }
    public void settingSceneC4(Stage primaryStage){
        createCircles();
        refreshColor();
    }




    private void createCircles() {
        Circle circle00 = new Circle(40.5);
        Circle circle01 = new Circle(40.5);
        Circle circle02 = new Circle(40.5);
        Circle circle03 = new Circle(40.5);
        Circle circle04 = new Circle(40.5);
        Circle circle05 = new Circle(40.5);
        Circle circle06 = new Circle(40.5);
        Circle circle10 = new Circle(40.5);
        Circle circle11 = new Circle(40.5);
        Circle circle12 = new Circle(40.5);
        Circle circle13 = new Circle(40.5);
        Circle circle14 = new Circle(40.5);
        Circle circle15 = new Circle(40.5);
        Circle circle16 = new Circle(40.5);
        Circle circle20 = new Circle(40.5);
        Circle circle21 = new Circle(40.5);
        Circle circle22 = new Circle(40.5);
        Circle circle23 = new Circle(40.5);
        Circle circle24 = new Circle(40.5);
        Circle circle25 = new Circle(40.5);
        Circle circle26 = new Circle(40.5);
        Circle circle30 = new Circle(40.5);
        Circle circle31 = new Circle(40.5);
        Circle circle32 = new Circle(40.5);
        Circle circle33 = new Circle(40.5);
        Circle circle34 = new Circle(40.5);
        Circle circle35 = new Circle(40.5);
        Circle circle36 = new Circle(40.5);
        Circle circle40 = new Circle(40.5);
        Circle circle41 = new Circle(40.5);
        Circle circle42 = new Circle(40.5);
        Circle circle43 = new Circle(40.5);
        Circle circle44 = new Circle(40.5);
        Circle circle45 = new Circle(40.5);
        Circle circle46 = new Circle(40.5);
        Circle circle50 = new Circle(40.5);
        Circle circle51 = new Circle(40.5);
        Circle circle52 = new Circle(40.5);
        Circle circle53 = new Circle(40.5);
        Circle circle54 = new Circle(40.5);
        Circle circle55 = new Circle(40.5);
        Circle circle56 = new Circle(40.5);
        positions[0]=new Circle[]{circle00, circle01, circle02, circle03, circle04, circle05, circle06};
        positions[1]=new Circle[]{circle10, circle11, circle12, circle13, circle14, circle15, circle16};
        positions[2]=new Circle[]{circle20, circle21, circle22, circle23, circle24, circle25, circle26};
        positions[3]=new Circle[]{circle30, circle31, circle32, circle33, circle34, circle35, circle36};
        positions[4]=new Circle[]{circle40, circle41, circle42, circle43, circle44, circle45, circle46};
        positions[5]=new Circle[]{circle50, circle51, circle52, circle53, circle54, circle55, circle56};
        paneForGame.setHgap(5);

    }
    public static void main(String args[]){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        setGameMatrix(gameMatrix);
        settingSceneC4(primaryStage);
        primaryStage.setScene(connect4);
        primaryStage.show();
    }
}
