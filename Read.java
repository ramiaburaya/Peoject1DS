package application.projectds1;

import javafx.stage.FileChooser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
    static LinkedList<Passenger> passengersDatabase = new LinkedList<>();
    static LinkedList<Flight> flightsDatabase = new LinkedList<>();
    static Scanner input = null;
    static FileChooser fileChooser = new FileChooser();

    protected static void readPassengers () {

        // set Extension filer to just display to user Text Files
        fileChooser.getExtensionFilters().add( new FileChooser.ExtensionFilter( "Text Files", "*.txt" ) );

        File SelectedFile = fileChooser.showOpenDialog( MenuWindow.menuStage );
        //( "Passenger.txt" );
        try {
            input = new Scanner( SelectedFile );
            while (input.hasNext()) {
                String line = input.nextLine();
                String[] passengerInfo = line.split( "," );

                int flightNumber = Integer.parseInt( passengerInfo[0] );
                int ticket = Integer.parseInt( passengerInfo[1] );
                String name = passengerInfo[2];
                String passport = passengerInfo[3];
                String nationality = passengerInfo[4];
                String dob = passengerInfo[5];

                passengersDatabase.append( new Passenger( flightNumber, ticket, name, passport, nationality, dob ) );
            }

        } catch (FileNotFoundException ex) {
            System.out.println( "File not found." );
        }
        input.close();
        passengersDatabase.sort();
    }

    protected static void readFlights () {

        // set Extension filer to just display to user Text Files
        fileChooser.getExtensionFilters().add( new FileChooser.ExtensionFilter( "Text Files", "*.txt" ) );

        File SelectedFile = fileChooser.showOpenDialog( MenuWindow.menuStage );
        try {
            input = new Scanner( SelectedFile );
            while (input.hasNext()) {
                String line = input.nextLine();
                String[] flightsInfo = line.split( "," );

                int flightNumber = Integer.parseInt( flightsInfo[0] );
                String arline = flightsInfo[1];
                String sou = flightsInfo[2];
                String des = flightsInfo[3];
                int cap = Integer.parseInt( flightsInfo[4] );

                flightsDatabase.append( new Flight( flightNumber, arline, sou, des, cap ) );
            }

        } catch (FileNotFoundException ex) {
            System.out.println( "File Not Found" );
        }
        input.close();
        flightsDatabase.sort();
    }
}
