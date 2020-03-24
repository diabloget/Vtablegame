import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.animation.*;
import javafx.util.Duration;

public class Simon extends Application {
    public GridPane gamePane = new GridPane();
    public Scene simonScene =  new Scene(gamePane,400,400, Color.BLACK);
    private CreateTransition transitions = new CreateTransition();


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        gamePane.setHgap(20);
        gamePane.setVgap(20);
        transitions.createSquares(gamePane);

        primaryStage.setScene(simonScene);
        primaryStage.show();

    }
}
