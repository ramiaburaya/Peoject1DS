package application.projectds1;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FlightWindow {
    protected static void addFlight () {
        Stage addFlightStage = new Stage();

        //Make RootPane , adjust it
        GridPane RootPane = new GridPane();
        RootPane.setPadding( new Insets( 10, 10, 10, 10 ) );
        RootPane.setAlignment( Pos.CENTER );
        RootPane.setHgap( 10 );
        RootPane.setVgap( 10 );


        // make Labels , adjust them, and insert them into RootPane
        Label flightNumber = new Label( "Flight Number" );
        Label airLineName = new Label( "AirLine Name" );
        Label source = new Label( "Source" );
        Label destination = new Label( "Destination" );
        Label capacity = new Label( "Capacity" );

        RootPane.add( flightNumber, 0, 0 );
        RootPane.add( airLineName, 0, 1 );
        RootPane.add( source, 0, 2 );
        RootPane.add( destination, 0, 3 );
        RootPane.add( capacity, 0, 4 );

        flightNumber.setFont( Font.font( "Courier New", FontWeight.BOLD, 15 ) );
        airLineName.setFont( Font.font( "Courier New", FontWeight.BOLD, 15 ) );
        source.setFont( Font.font( "Courier New", FontWeight.BOLD, 15 ) );
        destination.setFont( Font.font( "Courier New", FontWeight.BOLD, 15 ) );
        capacity.setFont( Font.font( "Courier New", FontWeight.BOLD, 15 ) );


        // make TextField , adjust them, and insert them into RootPane
        TextField flightNumberText = new TextField();
        TextField airLineNameText = new TextField();
        TextField sourceText = new TextField();
        TextField destinationText = new TextField();
        TextField capacityText = new TextField();

        RootPane.add( flightNumberText, 1, 0 );
        RootPane.add( airLineNameText, 1, 1 );
        RootPane.add( sourceText, 1, 2 );
        RootPane.add( destinationText, 1, 3 );
        RootPane.add( capacityText, 1, 4 );


        // make Add Button , adjust it and set Action on it
        Button Add = new Button( "Add" );
        Add.setPrefSize( 170, 50 );
        RootPane.add( Add, 0, 5 );
        Add.setOnAction( e -> {
            if (isNumeric( flightNumberText.getText() ) && isNumeric( capacityText.getText() )) {
                Read.flightsDatabase.append( new Flight( Integer.parseInt( flightNumberText.getText() ), airLineNameText.getText(), sourceText.getText(), destinationText.getText(), Integer.parseInt( capacityText.getText() ) ) );
                Alert Done = new Alert( Alert.AlertType.INFORMATION );
                Done.setContentText( "Done successfully" );
                Done.show();

            } else {
                Alert Error = new Alert( Alert.AlertType.ERROR );
                Error.setContentText( "Please Enter only number in Flight Number, Capacity " );
                Error.show();
            }
        } );


        // make Back Button , adjust it and set Action on it
        Button Back = new Button( "Back" );
        Back.setPrefSize( 170, 50 );
        RootPane.add( Back, 1, 5 );
        Back.setOnAction( e -> {
            addFlightStage.close();
            MenuWindow.PrintMenuStage();
        } );


        // insert backGround and Icon
        Image icon = new Image( "file:airplane.png" );
        Background background = new Background(
                new BackgroundImage( new Image( "file:BackGroundFlight.jpg" ), null, null, null, null ) );
        RootPane.setBackground( background );

        Scene scene = new Scene( RootPane );
        addFlightStage.setScene( scene );
        addFlightStage.setMaximized( true );
        addFlightStage.setTitle( "Add Flight" );
        addFlightStage.getIcons().add( icon );
        addFlightStage.show();
    }

    protected static void editFlight () {
        Stage editFlightStage = new Stage();

        //Make RootPane , adjust it
        GridPane RootPane = new GridPane();
        RootPane.setPadding( new Insets( 10, 10, 10, 10 ) );
        RootPane.setAlignment( Pos.CENTER );
        RootPane.setHgap( 10 );
        RootPane.setVgap( 10 );


        // make Labels , adjust them, and insert them into RootPane
        Label flightNumber = new Label( "Flight Number" );
        Label airLineName = new Label( "AirLine Name" );
        Label source = new Label( "Source" );
        Label destination = new Label( "Destination" );
        Label capacity = new Label( "Capacity" );

        RootPane.add( flightNumber, 0, 0 );
        RootPane.add( airLineName, 0, 1 );
        RootPane.add( source, 0, 2 );
        RootPane.add( destination, 0, 3 );
        RootPane.add( capacity, 0, 4 );

        flightNumber.setFont( Font.font( "Courier New", FontWeight.BOLD, 15 ) );
        airLineName.setFont( Font.font( "Courier New", FontWeight.BOLD, 15 ) );
        source.setFont( Font.font( "Courier New", FontWeight.BOLD, 15 ) );
        destination.setFont( Font.font( "Courier New", FontWeight.BOLD, 15 ) );
        capacity.setFont( Font.font( "Courier New", FontWeight.BOLD, 15 ) );


        // make TextField , adjust them, and insert them into RootPane
        TextField flightNumberText = new TextField();
        TextField airLineNameText = new TextField();
        TextField sourceText = new TextField();
        TextField destinationText = new TextField();
        TextField capacityText = new TextField();

        RootPane.add( flightNumberText, 1, 0 );
        RootPane.add( airLineNameText, 1, 1 );
        RootPane.add( sourceText, 1, 2 );
        RootPane.add( destinationText, 1, 3 );
        RootPane.add( capacityText, 1, 4 );


        // make Edit Button , adjust it and set Action on it
        Button Edit = new Button( "Edit" );
        Edit.setPrefSize( 85, 50 );
        Edit.setOnAction( e -> {
            if (isNumeric( flightNumberText.getText() )) {
                Alert Done = new Alert( Alert.AlertType.INFORMATION );
                Done.setContentText( "Done successfully" );
                Done.show();

            } else {
                Alert Error = new Alert( Alert.AlertType.ERROR );
                Error.setContentText( "Please Enter only number in Flight Number, Capacity " );
                Error.show();
            }
        } );

        // make Search Button , adjust it and set Action on it
        Button search = new Button( "Search" );
        search.setPrefSize( 85, 50 );
        search.setOnAction( e -> {

        } );

        // make HBox for SearchButton and EditButton
        HBox buttonPane = new HBox( 10 );
        buttonPane.getChildren().addAll( Edit, search );
        RootPane.add( buttonPane, 0, 5 );

        // make Back Button , adjust it and set Action on it
        Button Back = new Button( "Back" );
        Back.setPrefSize( 170, 50 );
        RootPane.add( Back, 1, 5 );
        Back.setOnAction( e -> {
            editFlightStage.close();
            MenuWindow.PrintMenuStage();
        } );

        // insert backGround and Icon
        Image icon = new Image( "file:airplane.png" );
        Background background = new Background(
                new BackgroundImage( new Image( "file:BackGroundFlight.jpg" ), null, null, null, null ) );

        RootPane.setBackground( background );
        Scene scene = new Scene( RootPane );
        editFlightStage.setScene( scene );
        editFlightStage.setMaximized( true );
        editFlightStage.setTitle( "Edit Flight" );
        editFlightStage.getIcons().add( icon );
        editFlightStage.show();
    }

    protected static boolean isNumeric ( String s ) {
        try {
            int intValue = Integer.parseInt( s );
            return true;
        } catch (NumberFormatException e) {
            System.out.println( "Input String cannot be parsed to Integer." );
        }
        return false;

    }
}
