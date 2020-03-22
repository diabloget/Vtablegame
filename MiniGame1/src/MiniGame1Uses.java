import javafx.application.Application;
import javafx.stage.Stage;

public class MiniGame1Uses extends Application {
    public Paintball game = new Paintball();


    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) {
        Stage secondaryStage = new Stage();
        game.starting(primaryStage,secondaryStage);


    }



    @Override
    public void init() throws Exception {
        super.init();
    }
}
