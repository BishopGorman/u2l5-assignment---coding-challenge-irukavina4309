package main.java;
import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double startingLatitude;
        double startingLongitude;
        double endingLatitude;
        double endingLongitude;
        double distance;

        System.out.print("Enter the latitude of the starting location: ");
        startingLatitude = scanner.nextDouble();

        System.out.print("Enter the longitude of the starting location: ");
        startingLongitude = scanner.nextDouble();

        System.out.print("Enter the latitude of the starting location: ");
        endingLatitude = scanner.nextDouble();

        System.out.print("Enter the longitude of the ending location: ");
        endingLongitude = scanner.nextDouble();

        GeoLocation start = new GeoLocation(startingLatitude,startingLongitude);
        GeoLocation end = new GeoLocation(endingLatitude,endingLongitude);

        distance = start.distanceFrom(end);

        System.out.println("The distance is " + distance + " miles.");

    }
}
