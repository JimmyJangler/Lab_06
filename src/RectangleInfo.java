import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        //scanner and variable declarations
        Scanner in = new Scanner(System.in);
        int rectangleWidth = 0;
        int rectangleHeight = 0;
        int area = 0;
        int perimeter = 0;
        double diagonal = 0.0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("What is the Height of the rectangle?:");
            if (in.hasNextInt())
            {
                rectangleHeight = in.nextInt();
                in.nextLine();
                System.out.println("What is the Width of the rectangle?:");
                if (in.hasNextInt())
                {
                    rectangleWidth = in.nextInt();
                    in.nextLine();//clear buffer
                    done = true;//close do loop
                }
                else { //invalid input check
                    trash = in.nextLine();
                    System.out.println("You entered an invalid value: " + trash);
                }
            }
            else //checking for invalid input
            {
                trash = in.nextLine();
                System.out.println("You entered an invalid value: " + trash);
            }
        }while (!done); //calculations and output statements
        area = rectangleWidth * rectangleHeight;
        perimeter = (rectangleWidth * 2) + (rectangleHeight * 2);
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        diagonal =  Math.sqrt((rectangleHeight * rectangleHeight) + (rectangleWidth * rectangleWidth));
        String diagonalDisplay = String.format("%.2f", diagonal);
        System.out.println("The Diagonal of the rectangle is: " + diagonalDisplay);


    }
}
