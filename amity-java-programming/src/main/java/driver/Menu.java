package driver;

import experiment1.Pattern;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args){

        // Creating a Scanner object
        int numberOfRows;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the dimension of the Half pyramid: ");
        numberOfRows = input.nextInt();
        input.close();
        Pattern.printNumberHalfPyramid(numberOfRows);
    }
}
