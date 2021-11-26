package cad.lab3.nomer4_17;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Dannaia programma schitaet miles per gallons dlia vashih puteshestvii! " +
                "Dlia togo chtobi viiti iz programmi vvedite [-1] dlia liubogo znacenia!");

        Scanner scanner = new Scanner(System.in);

        int tripCounter = 1;

        Trip overallTrip = new Trip();

        while (true) {

            int miles;
            int gallons;

            System.out.print("Vvedite miles:");
            miles = scanner.nextInt();

            if (miles == -1) {
                break;
            }

            System.out.print("Vvedite gallons:");
            gallons = scanner.nextInt();

            if (gallons == -1) {
                break;
            }

            Trip trip = new Trip();
            trip.setMiles(miles);
            trip.setGallons(gallons);

            System.out.println("Trip " + tripCounter + " - miles per gallons: " + trip.getMilesPerGallon());

            overallTrip.addGallons(trip.getGallons());
            overallTrip.addMiles(trip.getMiles());

            tripCounter = tripCounter + 1;
        }

        double totalMilesPerGallon = overallTrip.getMilesPerGallon();

        if (totalMilesPerGallon > 0) {
            System.out.println("Total miles per gallon: " + totalMilesPerGallon);
        }
    }
}
