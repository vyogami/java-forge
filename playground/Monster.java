package playground;

import java.util.Arrays;

public class Monster {
    static char[][] battleBoard = new char[10][10];

    public static void buildBattleBoard(){
        for(char[] character : battleBoard){
            Arrays.fill(character, '*');
        }
    }

    public static void fun(){
        buildBattleBoard();
        redrawBoard();
        for(int row = 0; row < battleBoard.length; row++){
            for(int column = 0; column < battleBoard.length; column++){
                if(row != 0 && column != 0){
                    buildBattleBoard();
                }
                battleBoard[row][column] = 'C';
                clearScreen();
                redrawBoard();
            }
        }
    }

    public static void redrawBoard(){
        int numberOfchar = 1;
        while(numberOfchar <= 30){System.out.print('-'); numberOfchar++;}
        numberOfchar = 1;
        System.out.println();

        for(int row = 0; row < battleBoard.length; row++){
            for(int column = 0; column < battleBoard.length; column++){
                System.out.print("|" + battleBoard[row][column] + "|");
            }
            System.out.println();
        }

        while(numberOfchar <= 30){System.out.print('-'); numberOfchar++;}
        System.out.println();
    }

    public static void clearScreen(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
}
