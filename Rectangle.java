import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import java.util.Optional;

public class Rectangle extends Application {
	@Override
	public void start(Stage primaryStage) {
		TextInputDialog textInputDialog = new TextInputDialog("Geometric Calculaor");
		Optional<String> result = textInputDialog.showAndWait();
		String widthInput = result.get();
		double width = Double.parseDouble(widthInput);
	}

	public static void main(String [] args) {
		launch(args);
	}
}
