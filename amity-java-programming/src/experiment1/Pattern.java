package experiment1;
import java.util.Scanner;

/*
Aim: Write a program to print the following pattern.
1
2   3
4   5   6
7   8   9   10
*/

public class Pattern {

    public static void printNumberHalfPyramid(int numberOfRows) {
        int symbol = 1; // this symbol will be used to print the shape
        for(int row = 1; row <= numberOfRows; row++){
            for(int column = 1; column <= row; column++){
                System.out.print(symbol + " "); 
                symbol++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numberOfRows;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the dimension of the Half pyramid: ");
        numberOfRows = input.nextInt();
        printNumberHalfPyramid(numberOfRows);
    }
}