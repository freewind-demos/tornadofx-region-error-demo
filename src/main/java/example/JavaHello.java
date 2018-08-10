package example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class JavaHello extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        FlowPane root = new FlowPane() {{
            Region region = new Region();
            region.setPrefSize(Double.MAX_VALUE, 0.0);
            getChildren().add(region);
        }};
        primaryStage.setScene(new Scene(root, 400, 200));
        primaryStage.show();
    }

}
