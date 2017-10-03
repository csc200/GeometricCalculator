public class Rectangle {
	@Override
	public void start(Stage primaryStage) {
		TextInputDialog textInputDialog = new TextInputDialog("Geometric Calculaor");
		Optional<String> result = textInputDialog.showAndWait();
		String widthInput = result.get();
		double width = Doulbe.parseDouble(input);
	}

	public static void main(String [] args) {
		launch(args);
	}
}
