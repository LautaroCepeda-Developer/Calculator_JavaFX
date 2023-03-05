package l_lau_u.calculator_javafx;

import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        URL fxmlUrl = getClass().getResource("/l_lau_u/calculator_javafx/forms/calculatorform.fxml");
        if (fxmlUrl == null) {
            System.out.println("Error: no se pudo cargar el archivo FXML.");
        }
        else {
            FXMLLoader loader = new FXMLLoader(fxmlUrl);
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        
    }

    public static void main(String[] args) {
        launch(args);
    }
}