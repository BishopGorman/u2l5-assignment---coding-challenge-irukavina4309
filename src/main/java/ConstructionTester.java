package main.java;
import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double taxRate;
        double totalPrice;
        double grandTotal;
        int numBoards;
        int numWindows;

        System.out.println("Enter the sales tax rate:");
        taxRate = scanner.nextDouble();

        System.out.println("How many boards do you need?");
        numBoards = scanner.nextInt();

        System.out.println("How many windows do you need?");
        numWindows = scanner.nextInt();

        Construction bghsPRJ = new Construction(8,11,taxRate);

        totalPrice = bghsPRJ.lumberCost(numBoards) + bghsPRJ.windowCost(numWindows);
        grandTotal = bghsPRJ.grandTotal(totalPrice);

        System.out.println("Total: " + totalPrice);
        System.out.println("Grand Total: " + grandTotal);

    }
}
