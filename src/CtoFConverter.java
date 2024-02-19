import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
        //scanner and variable declarations
        Scanner in = new Scanner(System.in);
        int tempC = 0;
        int tempF = 0;
        boolean done = false;
        String trash = "";

        //do while loop
        do {
            //prompt for input
            System.out.print("Enter the temperature in C: ");
            if (in.hasNextInt())
            { //converting C to F
                tempC = in.nextInt();
                in.nextLine();
                tempF = (tempC * 9/5) + 32;
                done = true; //close loop
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered an invalid input: " + trash);
            }

        }while (!done); //loop until set to true by test
        System.out.println(tempC + " Celsius is equivalent to " + tempF + " Fahrenheit.");

    }
}