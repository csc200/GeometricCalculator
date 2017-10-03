public class Rectangle {
	@Override
	public void start(Stage primaryStage) {
		TextInputDialog textInputDialog = new TextInputDialog("Geometric Calculaor");
		Optional<String> result = textInputDialog.showAndWait();
	}
	public static void main(String [] args) {
		launch(args);
	}
}
