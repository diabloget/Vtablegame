import javafx.application.Application;
import javafx.stage.Stage;

public class Test extends Application {
    Connect4 foo = new Connect4();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        foo.starting(primaryStage);
    }
}
