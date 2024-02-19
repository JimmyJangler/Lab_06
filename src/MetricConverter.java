import java.util.Scanner;

public class MetricConverter
{
    public static void main(String[] args)
    {
        //scanner and variable declaration
        Scanner in = new Scanner(System.in);
        double meters = 0.0;
        double miles = 0.0;
        double feet = 0.0;
        double inches = 0.0;
        boolean done = false;
        String trash = "";

        do {  //prompt for input
            System.out.print("What is the measurement in meters?: ");
            if (in.hasNextDouble())
            {
                meters = in.nextDouble();
                in.nextLine();//clear buffer
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered an invalid input: " + trash);
            }
        }while (!done);

        miles = meters / 1609.344;
        feet = meters * 3.28084;
        inches = meters * 39.3701;
        System.out.println(meters + " meters is equal to " + "\nmiles: " + miles + "\nfeet: " + feet + "\ninches: " + inches);

    }
}
