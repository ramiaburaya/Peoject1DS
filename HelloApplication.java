package application.projectds1;

import javafx.application.Application;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start ( Stage stage ) {
        MenuWindow.PrintMenuStage();


    }

    public static void main ( String[] args ) {
        Application.launch();
    }


}