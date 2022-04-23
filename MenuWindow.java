package application.projectds1;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MenuWindow {
    static Stage menuStage = new Stage();

    protected static void PrintMenuStage () {


        // make RootPane and adjust it
        BorderPane RootPane = new BorderPane();
        RootPane.setPadding( new Insets( 10, 10, 10, 10 ) );

        // set prefWidth and prefHeight for Nodes
        int prefWidth = 170;
        int prefHeight = 50;

        // make Pane and adjust it
        GridPane Pane = new GridPane();
        Pane.setHgap( 15 );
        Pane.setVgap( 15 );
        Pane.setAlignment( Pos.CENTER );

        // make Read ComboBox, adjust it and set Action on it
        ComboBox<String> read = new ComboBox<>();
        read.setPromptText( "Select to Read" );
        read.getItems().addAll( "Read Flights info", "Read Passengers info" );
        read.setPrefSize( prefWidth, prefHeight );
        read.setOnAction( e -> {
            if (read.getValue().equals( "Read Flights info" )) {
                Read.readFlights();
                if (!Read.flightsDatabase.isEmpty()) {
                    Alert Done = new Alert( Alert.AlertType.INFORMATION );
                    Done.setContentText( "Done successfully" );
                    Done.show();
                } else {
                    Alert Error = new Alert( Alert.AlertType.ERROR );
                    Error.setContentText( "Error" );
                    Error.show();
                }
            } else {
                Read.readPassengers();
                if (!Read.passengersDatabase.isEmpty()) {
                    Alert Done = new Alert( Alert.AlertType.INFORMATION );
                    Done.setContentText( "Done successfully" );
                    Done.show();
                } else {
                    Alert Error = new Alert( Alert.AlertType.ERROR );
                    Error.setContentText( "Error" );
                    Error.show();
                }
            }
        } );

        // make Flights ComboBox, adjust it and  set Action on it
        ComboBox<String> Flights = new ComboBox<>();
        Flights.setPromptText( "Flight Options" );
        Flights.getItems().addAll( "Add Flight", "Edit Flight" );
        Flights.setPrefSize( prefWidth, prefHeight );
        Flights.setOnAction( e -> {
            if (Flights.getValue().equals( "Add Flight" )) {
                FlightWindow.addFlight();
                menuStage.close();
            } else {
                FlightWindow.editFlight();
                menuStage.close();
            }
        } );

        // make Tickets ComboBox, adjust it and set Action on it
        ComboBox<String> Tickets = new ComboBox<>();
        Tickets.setPromptText( "Tickets Options" );
        Tickets.getItems().addAll( "Reserve Tickets", "Cancel a Reservation", "Check Tickets" );
        Tickets.setPrefSize( prefWidth, prefHeight );
        Tickets.setOnAction( e -> {
            if (Tickets.getValue().equals( "Reserve Tickets" )) {
                TicketWindow.ReserveTicket();
                menuStage.close();
            } else if (Tickets.getValue().equals( "Cancel a Reservation" )) {
                TicketWindow.CancelReserve();
                menuStage.close();
            } else {
                TicketWindow.CheckTicket();
                menuStage.close();
            }
        } );

        // make Display ComboBox, adjust it and set Action on it
        ComboBox<String> Display = new ComboBox<>();
        Display.setPromptText( "Display Options" );
        Display.getItems().addAll( "Display Flights info", "Display Passengers info" );
        Display.setPrefSize( prefWidth, prefHeight );
        Display.setOnAction( e -> {
            if (Display.getValue().equals( "Display Flights info" )) {
                DisplayWindow.DisplayFlights();
                menuStage.close();
            } else {
                DisplayWindow.DisplayPassengers();
                menuStage.close();
            }
        } );

        // make Search Button , adjust it and set Action on it
        Button Search = new Button( "Search" );
        Search.setPrefSize( prefWidth, prefHeight );
        Search.setOnAction( e -> {
            searchWindow();
            menuStage.close();
        } );

        // make Exit Button , adjust it and set Action on it
        Button Exit = new Button( "Exit" );
        Exit.setPrefSize( prefWidth, prefHeight );
        Exit.setOnAction( e -> menuStage.close() );

        // Add nodes to GridPane
        Pane.add( read, 0, 0 );
        Pane.add( Search, 0, 1 );
        Pane.add( Flights, 1, 0 );
        Pane.add( Display, 1, 1 );
        Pane.add( Tickets, 2, 0 );

        // insert backGround and Icon
        Image icon = new Image( "file:airplane.png" );
        Background background = new Background(
                new BackgroundImage( new Image( "file:backGround.jpg" ), null, null, null, null ) );

        RootPane.setCenter( Pane );
        RootPane.setBottom( Exit );
        RootPane.setBackground( background );

        Scene scene = new Scene( RootPane );

        // adjust menuStage
        menuStage.setScene( scene );
        menuStage.setTitle( "AirPlane System" );
        menuStage.setMaximized( true );
        menuStage.getIcons().add( icon );
        menuStage.show();
    }


    private static void searchWindow () {
        Stage searchStage = new Stage();

        //Make RootPane , adjust it
        GridPane RootPane = new GridPane();
        RootPane.setPadding( new Insets( 10, 10, 10, 10 ) );
        RootPane.setAlignment( Pos.CENTER );
        RootPane.setHgap( 10 );
        RootPane.setVgap( 10 );

        // make Labels , adjust them, and insert them into RootPane
        Label flightNumber = new Label( "Flight Number" );
        Label TicketNumber = new Label( "Ticket number" );
        Label FullName = new Label( "Full name" );
        Label PassportNumber = new Label( "Passport number" );
        Label Nationality = new Label( "Nationality" );
        Label Birthdate = new Label( "Birthdate" );

        RootPane.add( flightNumber, 0, 0 );
        RootPane.add( TicketNumber, 0, 1 );
        RootPane.add( FullName, 0, 2 );
        RootPane.add( PassportNumber, 0, 3 );
        RootPane.add( Nationality, 0, 4 );
        RootPane.add( Birthdate, 0, 5 );

        flightNumber.setFont( Font.font( "Courier New", FontWeight.BOLD, 15 ) );
        TicketNumber.setFont( Font.font( "Courier New", FontWeight.BOLD, 15 ) );
        FullName.setFont( Font.font( "Courier New", FontWeight.BOLD, 15 ) );
        PassportNumber.setFont( Font.font( "Courier New", FontWeight.BOLD, 15 ) );
        Nationality.setFont( Font.font( "Courier New", FontWeight.BOLD, 15 ) );
        Birthdate.setFont( Font.font( "Courier New", FontWeight.BOLD, 15 ) );

        // make TextField , adjust them, and insert them into RootPane
        TextField flightNumberText = new TextField();
        TextField TicketNumberText = new TextField();
        TextField FullNameText = new TextField();
        TextField PassportNumberText = new TextField();
        TextField NationalityText = new TextField();
        TextField BirthdateText = new TextField();

        RootPane.add( flightNumberText, 1, 0 );
        RootPane.add( TicketNumberText, 1, 1 );
        RootPane.add( FullNameText, 1, 2 );
        RootPane.add( PassportNumberText, 1, 3 );
        RootPane.add( NationalityText, 1, 4 );
        RootPane.add( BirthdateText, 1, 5 );

        // make Search Button , adjust it and set Action on it
        Button Search = new Button( "Search" );
        Search.setPrefSize( 170, 50 );
        Search.setOnAction( e -> {

            System.out.println( Read.passengersDatabase.search( null ) );
            Alert Done = new Alert( Alert.AlertType.INFORMATION );
            Done.setContentText( "Done successfully" );
            Done.show();


        } );
        RootPane.add( Search, 0, 6 );

        // make Back Button , adjust it and set Action on it
        Button Back = new Button( "Back" );
        Back.setPrefSize( 170, 50 );
        Back.setOnAction( e -> {
            searchStage.close();
            PrintMenuStage();
        } );
        RootPane.add( Back, 1, 6 );

        // insert backGround and Icon
        Image icon = new Image( "file:airplane.png" );
        Background background = new Background(
                new BackgroundImage( new Image( "file:BackGroundFlight.jpg" ), null, null, null, null ) );

        RootPane.setBackground( background );

        Scene scene = new Scene( RootPane );

        // adjust passengerStage
        searchStage.setScene( scene );
        searchStage.setTitle( "Flights Information" );
        searchStage.setMaximized( true );
        searchStage.getIcons().add( icon );
        searchStage.show();


    }

}
