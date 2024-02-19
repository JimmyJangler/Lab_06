import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        //scanner and variable declarations
        Scanner in = new Scanner(System.in);
        double tankSize = 0.0;
        double gasMileage = 0.0;
        double gasPrice = 0.0;
        double miles = 0.0;
        double costPerMile = 0.0;
        double hundredMiles = 0.0;
        double distance = 0.0;
        boolean done = false;
        boolean doneTwo = false;
        boolean doneThree = false;
        String trash = "";
        String trashTwo = "";
        String trashThree = "";

        //do while loop prompting input
        do {
            System.out.print("How many gallons of gas are in the tank?: ");
            if (in.hasNextDouble())
            {
                tankSize = in.nextDouble();
                in.nextLine(); //clear buffer
                done = true; //end loop
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered an invalid value: " + trash);
            }
        }while (!done);

        do {
            System.out.print("What is the fuel efficiency in miles per gallon?: ");
            if (in.hasNextDouble())
            {
                gasMileage = in.nextDouble();
                in.nextLine(); //clear buffer
                doneTwo = true; //end loop
            }
            else
            {
                trashTwo = in.nextLine();
                System.out.println("You entered an invalid value: " + trashTwo);
            }
        }while (!doneTwo);

        do {
            System.out.print("What is the price of gas per gallon?: $");
            if (in.hasNextDouble())
            {
                gasPrice = in.nextDouble();
                in.nextLine();
                doneThree = true;
            }
            else
            {
                trashThree = in.nextLine();
                System.out.println("You entered an invalid value: " + trashThree);
            }
        }while (!doneThree);

        costPerMile = gasPrice / gasMileage;
        distance = gasMileage * tankSize;
        hundredMiles = costPerMile * 100;
        System.out.println("It will cost $ " + hundredMiles + " to travel 100 miles!");
        System.out.println("The car will go " + distance + " miles with " + tankSize + " gallons of gas.");

    }
}
