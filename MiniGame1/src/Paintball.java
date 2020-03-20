import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Paintball  {
    Stage primaryStage;
    Stage secondaryStage = new Stage();
    String results = "tie";
    public Shoot playerShoot= new Shoot();
    public Hide playerHide = new Hide();
    public static final int xMax= 400;
    public static final int yMax= 400;
    private static GridPane group = new GridPane();
    public static GridPane groupForGame = new GridPane();
    Text displayRulesGuard = new Text("        First select your guarding position: \n\n First must go player 1, then player 2 selects its hiding spot");
    Text displayRulesShoot = new Text("        Then select your shooting position: \n\n First must go player 1, then player 2 selects its shooting spot");
    private static Scene showRules = new Scene(group, xMax, yMax);
    private static Scene game = new Scene(groupForGame, xMax, yMax);
    private static Scene shoot;
    Button next = new Button();





    public void setGroup(GridPane group) {
        Paintball.group = group;
        next.setText("OK");
        displayRulesGuard.setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));
        displayRulesShoot.setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));
        group.add(displayRulesGuard,0,1);
        group.add(displayRulesShoot, 0, 5);
        group.add(next,1,6);
        group.setVgap(10);
        group.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
    }




    public void starting(Stage primaryStage) {
        this.primaryStage=primaryStage;
        setGroup(group);
            primaryStage.setScene(showRules);
            primaryStage.setTitle("Paintball");
            primaryStage.show();
            next.setOnAction(actionEvent0 -> {
                playerHide.setGroupForGame1(groupForGame);
                primaryStage.setScene(game);
                playerHide.OK.setOnAction(actionEvent1 -> {
                    GridPane groupForShoot = new GridPane();
                    playerShoot.setGroupForGame1(groupForShoot);
                    shoot = new Scene(groupForShoot, xMax, yMax);
                    primaryStage.setScene(shoot);
                    playerShoot.OK.setOnAction(actionEvent2 -> {
                        String[] hidingPositions=playerHide.hidingPosition;
                        String[] shootingPositions=playerShoot.shootingPosition;
                        String [] player1 = new String[]{hidingPositions[0],shootingPositions[0]};
                        String [] player2 = new String[]{hidingPositions[1],shootingPositions[1]};
                        CalculateResults calculate = new CalculateResults(player1, player2);
                        results = calculate.winner();
                        if(results=="tie"){

                        }


                });

            });

        });

}



}
