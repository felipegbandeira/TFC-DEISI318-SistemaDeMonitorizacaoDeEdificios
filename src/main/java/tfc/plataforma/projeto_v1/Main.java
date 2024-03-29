package tfc.plataforma.projeto_v1;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.*;
import java.awt.*;
import java.io.IOException;

public class Main extends Application{
    @Override
    public void start(Stage stage) throws IOException {
        Controller controller = new Controller();
        FXMLLoader alarmsPage = new FXMLLoader(Main.class.getResource("alarmes.fxml"));
        FXMLLoader listPage = new FXMLLoader(Main.class.getResource("lista.fxml"));
        FXMLLoader graphicsPage = new FXMLLoader(Main.class.getResource("graficos.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view.fxml"));

        //controller.conectar();
        fxmlLoader.setController(controller);
        Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth() ;
        double height = screenSize.getHeight();

        try {
            Scene scene = new Scene(fxmlLoader.load(), width, height);
            stage.setTitle("Home");
            stage.setScene(scene);
            stage.show();
            controller.setStage(stage);
            controller.setSceneHome(scene);
            controller.setHomePage(fxmlLoader);
            controller.setGraphicsPage(graphicsPage);
            controller.setAlarmsPage(alarmsPage);
            controller.setListPage(listPage);
            controller.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
