import java.util.Scanner; // before the class at top of the file

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double width = 0.0;
        double height = 0.0;
        double perimeter = 0.0;
        double area = 0.0;
        double diagonal = 0.0;
        String trash = ""; // use for bad input which will read as a String
        boolean done = false;
        do
        {
            System.out.print("Enter the width of the rectangle: ");
            if(in.hasNextDouble()) // OK safe to read in a double
            {
                width = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                done = true; // we got a valid number so we can end the loop
            }
            else
            {
                // Not a double so use nextLine() instead to read a String
                trash = in.nextLine();
                System.out.println("\nYou said the width was: " + trash);
                System.out.println("You have to enter a valid value!");
            }

        }while(!done); // initially done is false so !done i.e. NOT FALSE, is true
        // when done is true !done i.e. NOT TRUE is false
        do
        {
            System.out.print("Enter the height of the rectangle: ");
            if(in.hasNextDouble()) // OK safe to read in a double
            {
                height = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                done = true; // we got a valid number so we can end the loop
            }
            else
            {
                // Not a double so use nextLine() instead to read a String
                trash = in.nextLine();
                System.out.println("\nYou said the height was: " + trash);
                System.out.println("You have to enter a valid value!");
            }
        }while(!done); // initially done is false so !done i.e. NOT FALSE, is true
        // when done is true !done i.e. NOT TRUE is false
        perimeter = 2*(height + width);
        area = height * width;
        diagonal = Math.hypot(height,width);
        System.out.println("The perimeter of the rectangle with a width of " + width + " and a height of " + height + " is " + perimeter);
        System.out.println("The area of the rectangle with a width of " + width + " and a height of " + height + " is " + area);
        System.out.println("The diagonal of the rectangle with a width of " + width + " and a height of " + height + " is " + diagonal);
    }
}