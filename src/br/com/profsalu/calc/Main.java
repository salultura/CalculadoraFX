package br.com.profsalu.calc;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			//Carrega o FXML ao projeto 
			Parent root = FXMLLoader.load(getClass().getResource("/br/com/profsalu/calc/view/UICalc.fxml"));
			
			//Cria uma cena
			Scene scene = new Scene(root);
			
			//Vincula o arquivo css a cena
			scene.getStylesheets().add(getClass().getResource("/br/com/profsalu/calc/view/application.css").toExternalForm());
			
			//Define o titulo da pagina
			primaryStage.setTitle("Calculadora FX");
			
			//Atribui o icone da aplicacao			
			primaryStage.getIcons().add(new Image("/img/ic_calculadora.png"));
			
			//Atribui a cena ao primaryStage
			primaryStage.setScene(scene);
			
			//Exibe o conteudo
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
