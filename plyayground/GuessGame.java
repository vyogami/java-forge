import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            
            int correctInt = randInt(50), guessInt;

            while(true) {
                System.out.print("\nChoose a number between 0 and 50: ");
                guessInt = sc.nextInt(); 

                if(guess(guessInt, correctInt)){
                    System.out.println("***** Woah! Aapko milte hai ek crore *****");
                    break;
                }
                else{
                    if(guessInt > correctInt){
                        System.out.println("Try guessing a little lower ;)");
                    }
                    else{
                        System.out.println("Try guessing a little higher ;)");
                    }
                }
            }

            System.out.print("\nDo you want to play again?(Y/n) ");
            sc.nextLine();
            choice = sc.nextLine();

       }
    }

    public static int randInt(int upperLimit) {
        return (int) (Math.random()* upperLimit);        
    }

    public static boolean guess(int guessInt, int correctInt){
        return guessInt == correctInt ? true : false;
    }

}
