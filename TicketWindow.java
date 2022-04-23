package application.projectds1;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class TicketWindow {
    protected static void ReserveTicket () {
        Stage ReserveTicketStage = new Stage();

        //Make RootPane , adjust it
        GridPane RootPane = new GridPane();
        RootPane.setPadding( new Insets( 10, 10, 10, 10 ) );
        RootPane.setAlignment( Pos.CENTER );
        RootPane.setHgap( 10 );
        RootPane.setVgap( 10 );


        // insert backGround and Icon
        Image icon = new Image( "file:airplane.png" );
        Background background = new Background(
                new BackgroundImage( new Image( "file:BackGroundFlight.jpg" ), null, null, null, null ) );
        RootPane.setBackground( background );

        Scene scene = new Scene( RootPane );

        // adjust menuStage
        ReserveTicketStage.setScene( scene );
        ReserveTicketStage.setTitle( "AirPlane System" );
        ReserveTicketStage.setMaximized( true );
        ReserveTicketStage.getIcons().add( icon );
        ReserveTicketStage.show();


    }

    protected static void CancelReserve () {
        Stage CancelReserveStage = new Stage();

        //Make RootPane , adjust it
        GridPane RootPane = new GridPane();
        RootPane.setPadding( new Insets( 10, 10, 10, 10 ) );
        RootPane.setAlignment( Pos.CENTER );
        RootPane.setHgap( 10 );
        RootPane.setVgap( 10 );

        // make Labels , adjust them, and insert them into RootPane
        Label fullName = new Label( "Full Name" );
        fullName.setFont( Font.font( "Courier New", FontWeight.BOLD, 20 ) );
        RootPane.add( fullName, 0, 0 );

        // make TextField , adjust them, and insert them into RootPane
        TextField fullNameText = new TextField();
        RootPane.add( fullNameText, 1, 0 );

        // make Back Button , adjust it and set Action on it
        Button Back = new Button( "Back" );
        Back.setPrefSize( 170, 50 );
        RootPane.add( Back, 1, 1 );
        Back.setOnAction( e -> {
            CancelReserveStage.close();
            MenuWindow.PrintMenuStage();
        } );

        // make Cancel Reserve Button , adjust it and set Action on it
        Button cancelReserve = new Button( "Cancel Reserve" );
        cancelReserve.setPrefSize( 170, 50 );
        RootPane.add( cancelReserve, 0, 1 );
        cancelReserve.setOnAction( e -> {


        } );

        // insert backGround and Icon
        Image icon = new Image( "file:airplane.png" );
        Background background = new Background(
                new BackgroundImage( new Image( "file:BackGroundFlight.jpg" ), null, null, null, null ) );
        RootPane.setBackground( background );

        Scene scene = new Scene( RootPane );


        // adjust menuStage
        CancelReserveStage.setScene( scene );
        CancelReserveStage.setTitle( "AirPlane System" );
        CancelReserveStage.setMaximized( true );
        CancelReserveStage.getIcons().add( icon );
        CancelReserveStage.show();
    }

    protected static void CheckTicket () {
        Stage CheckTicketStage = new Stage();

        //Make RootPane , adjust it
        GridPane RootPane = new GridPane();
        RootPane.setPadding( new Insets( 10, 10, 10, 10 ) );
        RootPane.setAlignment( Pos.CENTER );
        RootPane.setHgap( 10 );
        RootPane.setVgap( 10 );


        // insert backGround and Icon
        Image icon = new Image( "file:airplane.png" );
        Background background = new Background(
                new BackgroundImage( new Image( "file:BackGroundFlight.jpg" ), null, null, null, null ) );
        RootPane.setBackground( background );

        Scene scene = new Scene( RootPane );


        // adjust menuStage
        CheckTicketStage.setScene( scene );
        CheckTicketStage.setTitle( "AirPlane System" );
        CheckTicketStage.setMaximized( true );
        CheckTicketStage.getIcons().add( icon );
        CheckTicketStage.show();
    }
}
