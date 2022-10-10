import java.util.Scanner;
import java.lang.Math;
//docker build -t java_choose_image .
//docker run -it --rm --name choose_container java_choose_image

public class Choose {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        boolean exit = false;
        while(!exit) {
            System.out.println("What would you like to do? 1 to add two integers, 2 to multiply two integers, 3 to subtract two integers, 4 to calculate one integer to the power of another, and 5 to exit.");
            if(!input.hasNextInt()) {
                System.out.println("Input one of 1, 2, 3, 4, 5.");
                input.next();
                continue;
            }
            int selection = input.nextInt();
            if (selection == 5){
                break;
            }
            if(selection < 1 || selection > 5){
                System.out.println("Input one of 1, 2, 3, 4, 5.");
                continue;
            }
            System.out.println("Input two integers");
            while (!input.hasNextInt()) {
                System.out.println("Input an integer.");
            }
            int int1 = input.nextInt();
            while (!input.hasNextInt()) {
                System.out.println("Input an integer.");
            }
            int int2 = input.nextInt();
            int result = -1;
            switch (selection) {
                case 1:
                    result = int1 + int2;
                    break;
                case 2:
                    result = int1 * int2;
                    break;
                case 3:
                  result = int1 - int2;
                  break;
                default:
                  result = (int) Math.pow((double)int1, (double)int2);
            }
            System.out.println("Result is: "+ result);
        }
        input.close();
    }
}
