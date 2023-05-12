package snippets;


public class Pattern {
    public static void numberHalfPyramid(int numberOfRows){
        for(int row = 1; row <= numberOfRows; row++){
            for(int column = 1; column <= row; column++){
                System.out.print(row);
            }
            System.out.println();
        }
    }

    public static void astrixHalfPyramid(int numberOfRows){
        for(int row = 1; row <= numberOfRows; row++){
            for(int column = 1; column <= row; column++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void astrixInvertedHalfPyramid(int numberOfRows){
        for(int row = numberOfRows; row >= 1; row--){
            for(int column = 1; column <= row; column++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void astrixReflectedHalfPyramid(int numberOfRows){
        for(int row = 1; row <= numberOfRows; row++){
            // For printing preceding whitespaces
            for(int whitespaceColumn = 1; whitespaceColumn <= (numberOfRows - row); whitespaceColumn++){
                System.out.print(' ');
            }

            for(int column = 1; column <= row; column++){
                System.out.print('*');
            }

            System.out.println();
        }
    }

    public static void astrixInvertedReflectedHalfPyramid(int numberOfRows){
        for(int row = numberOfRows; row >= 1; row--){
            // For printing preceding whitespaces
            for(int whitespaceColumn = 1; whitespaceColumn <= (numberOfRows - row); whitespaceColumn++){
                System.out.print(' ');
            }

            for(int column = 1; column <= row; column++){
                System.out.print('*');
            }

            System.out.println();
        }
    }

    public static void astrixPyramid(int numberOfRows){
        for(int row = 1; row <= numberOfRows; row++){
            // For printing preceding whitespaces
            for(int whitespaceColumn = 1; whitespaceColumn <= (numberOfRows - row); whitespaceColumn++){
                System.out.print(' ');
            }

            for(int column = 1; column <= (2 * row - 1); column++){
                System.out.print('*');
            }

            System.out.println();
        }
    }

    public static void astrixInvertedPyramid(int numberOfRows){
        for(int row = numberOfRows; row >= 1; row--){
            // For printing preceding whitespaces
            for(int whitespaceColumn = 1; whitespaceColumn <= (numberOfRows - row); whitespaceColumn++){
                System.out.print(' ');
            }

            for(int column = 1; column <= (2 * row - 1); column++){
                System.out.print('*');
            }

            System.out.println();
        }
    }

    public static void astrixHollowPyramid(int numberOfRows){
        for(int row = 1; row <= numberOfRows; row++){
            // For printing preceding whitespaces
            for(int whitespaceColumn = 1; whitespaceColumn <= (numberOfRows - row); whitespaceColumn++){
                System.out.print(' ');
            }

            for(int column = 1; column <= (2 * row - 1); column++){
                if(row == numberOfRows){
                    System.out.print('*');
                }
                else{
                    if(column == 1 || column == (2* row -1)){
                        System.out.print('*');
                    }
                    else{
                        System.out.print(' ');
                    }
                }
            }

            System.out.println();
        }
    }

    public static void astrixRectangle(int numberOfRows, int numberOfColumns) {
        for(int row = 1; row <= numberOfRows; row++){
            for(int column = 1; column <= numberOfColumns; column++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void astrixHollowRectangle(int numberOfRows, int numberOfColumns) {
        for(int row = 1; row <= numberOfRows; row++){
            for(int column = 1; column <= numberOfColumns; column++){
                if(row == 1 || row == numberOfRows){
                    System.out.print('*');
                }
                else{
                    if(column == 1 || column == numberOfColumns){
                        System.out.print('*');
                    }
                    else{
                        System.out.print(' ');
                    }
                }
            }
            System.out.println();
        }
    }

    public static void astrixPseudoRectangle(int numberOfRows) {
        for(int row = 1; row <= numberOfRows; row++){
            for(int column = 1; column <= numberOfRows; column++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void astrixHollowPseudoRectangle(int numberOfRows) {
        for(int row = 1; row <= numberOfRows; row++){
            for(int column = 1; column <= numberOfRows; column++){
                if(row == 1 || row == numberOfRows){
                    System.out.print('*');
                }
                else{
                    if(column == 1 || column == numberOfRows){
                        System.out.print('*');
                    }
                    else{
                        System.out.print(' ');
                    }
                }
            }
            System.out.println();
        }
    }

    public static void astrixSquare(int numberOfRows) {
        for(int row = 1; row <= numberOfRows; row++){
            for(int column = 1; column <= numberOfRows; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void astrixHollowSquare(int numberOfRows) {
        for(int row = 1; row <= numberOfRows; row++){
            for(int column = 1; column <= numberOfRows; column++){
                if(row == 1 || row == numberOfRows){
                    System.out.print("* ");
                }
                else{
                    if(column == 1 || column == numberOfRows){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
