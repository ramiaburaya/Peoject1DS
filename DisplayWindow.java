package application.projectds1;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class DisplayWindow {

    protected static void DisplayPassengers () {
        Stage passengerStage = new Stage();
        BorderPane RootPane = new BorderPane();
        RootPane.setPadding( new Insets( 10, 10, 10, 10 ) );


        // make Back Button , adjust it and set Action on it
        Button Back = new Button( "Back" );
        Back.setPrefSize( 170, 50 );
        Back.setOnAction( e -> {
            passengerStage.close();
            MenuWindow.PrintMenuStage();
        } );

        RootPane.setBottom( Back );

        // insert Icon
        Image icon = new Image( "file:airplane.png" );
        Scene scene = new Scene( RootPane );

        // adjust passengerStage
        passengerStage.setScene( scene );
        passengerStage.setTitle( "Passengers Information" );
        passengerStage.setMaximized( true );
        passengerStage.getIcons().add( icon );
        passengerStage.show();
    }

    protected static void DisplayFlights () {
        Stage FlightStage = new Stage();

        BorderPane pane = new BorderPane();
        pane.setPadding( new Insets( 10, 10, 10, 10 ) );


        // make Back Button , adjust it and set Action on it
        Button Back = new Button( "Back" );
        Back.setPrefSize( 170, 50 );
        Back.setOnAction( e -> {
            FlightStage.close();
            MenuWindow.PrintMenuStage();
        } );
        pane.setBottom( Back );

        // insert Icon
        Image icon = new Image( "file:airplane.png" );
        Scene scene = new Scene( pane );

        // adjust passengerStage
        FlightStage.setScene( scene );
        FlightStage.setTitle( "Flights Information" );
        FlightStage.setMaximized( true );
        FlightStage.getIcons().add( icon );
        FlightStage.show();
    }
}
