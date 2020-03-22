import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Shoot {
    public Button OK= new Button();
    String[] shootingPosition= new String[2];
    int player=0;
    public void setGroupForGame1(GridPane groupForGame) {
        OK.setText("Ok");
        OK.setPrefSize(100,10);
        groupForGame.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        Text title= new Text("Shooting\nposition\nplayer "+ Integer.toString(player+1));
        title.setFont(Font.font("Arial", FontWeight.BLACK, 22));
        groupForGame.add(title,1,0);
        groupForGame.setVgap(20);
        groupForGame.setHgap(20);
        Rectangle hidePosition1 = new Rectangle(10,10,100,100);
        groupForGame.add(hidePosition1,1,1);
        Button hidePosition1Btn = new Button();
        hidePosition1Btn.setBackground(Background.EMPTY);
        hidePosition1Btn.setPrefSize(100,100);
        groupForGame.add(hidePosition1Btn,1,1);
        Rectangle hidePosition2 = new Rectangle(10,10,100,100);
        groupForGame.add(hidePosition2,2,1);
        Button hidePosition2Btn = new Button();
        hidePosition2Btn.setBackground(Background.EMPTY);
        hidePosition2Btn.setPrefSize(100,100);
        groupForGame.add(hidePosition2Btn,2,1);
        Rectangle hidePosition3 = new Rectangle(10,10,100,100);
        groupForGame.add(hidePosition3,3,1);
        Button hidePosition3Btn = new Button();
        hidePosition3Btn.setBackground(Background.EMPTY);
        hidePosition3Btn.setPrefSize(100,100);
        groupForGame.add(hidePosition3Btn,3,1);
        hidePosition1Btn.setOnAction(actionEvent -> {
            if(player!=1) {
                shootingPosition[player] = "1";
                player = 1;
                title.setText("Shooting\nposition\nplayer "+ Integer.toString(player+1));

            }else{
                shootingPosition[player] = "1";
                groupForGame.add(OK,3,2);
            }
        });
        hidePosition2Btn.setOnAction(actionEvent -> {
            if (player != 1) {
                shootingPosition[player] = "2";
                player = 1;
                title.setText("Shooting\nposition\nplayer "+ Integer.toString(player+1));
            }else{
                shootingPosition[player] = "2";
                groupForGame.add(OK,3,2);
            }
        });
        hidePosition3Btn.setOnAction(actionEvent -> {
            if(player!=1) {
                shootingPosition[player] = "1";
                player = 1;
                title.setText("Shooting\nposition\nplayer "+ Integer.toString(player+1));
            }else{
                shootingPosition[player] = "2";
                groupForGame.add(OK,3,2);
            }
        });
    }
}
