import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Paintball  {
    String[] shootingPositions=new String[2];
    String[] hidingPositions=new String[2];
    String results = "tie";
    public static final int xMax= 400;
    public static final int yMax= 400;
    private static GridPane group = new GridPane();
    Text displayRulesGuard = new Text("        First select your guarding position: \n\n First must go player 1, then player 2 selects its hiding spot");
    Text displayRulesShoot = new Text("        Then select your shooting position: \n\n First must go player 1, then player 2 selects its shooting spot");
    private static Scene showRules = new Scene(group, xMax, yMax);
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
    public void settingShootingScene(Stage primaryStage){
        Shoot playerShoot = new Shoot();
        System.out.println(Integer.toString(playerShoot.player));
        GridPane paneForShoot = new GridPane();
        playerShoot.setGroupForGame1(paneForShoot);
        Scene shootingScene = new Scene(paneForShoot, xMax, yMax);
        primaryStage.setScene(shootingScene);
        playerShoot.OK.setOnAction(actionEvent2 -> {
            shootingPositions = playerShoot.shootingPosition;
            String[] player1 = new String[]{hidingPositions[0], shootingPositions[0]};
            String[] player2 = new String[]{hidingPositions[1], shootingPositions[1]};
            CalculateResults calculate = new CalculateResults(player1, player2);
            results = calculate.winner();
            if (results == "tie") {
                settingHidingScene(primaryStage);
            }


        });

    }


    public void settingHidingScene(Stage primaryStage){
        GridPane paneForHide = new GridPane();
        Scene hidingScene = new Scene(paneForHide, xMax, yMax);
        Hide playerHide = new Hide();
        System.out.println(Integer.toString(playerHide.player));
        playerHide.setGroupForGame1(paneForHide);
        primaryStage.setScene(hidingScene);
        hidingPositions = playerHide.hidingPosition;
        playerHide.OK.setOnAction(actionEvent1 -> {
            settingShootingScene(primaryStage);
            });}


    public void starting(Stage primaryStage,Stage secondaryStage) {
        setGroup(group);
            primaryStage.setScene(showRules);
            primaryStage.setTitle("Paintball");
            primaryStage.show();
            next.setOnAction(actionEvent0 -> {
                settingHidingScene(primaryStage);});





}



}
