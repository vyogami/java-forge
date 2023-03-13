package playground;

public class Digits {

    static int numberOfDigts(int number){
        int count = 0;
        while(number != 0){count++;
            number /= 10;
        }
        return count;
    }

    static int numberOfDigtsUsingString(int number){
        return Integer.toString(number).length();
    }

    static int reverse(int number){
        int reverse = 0;
        while(number != 0){
            reverse = reverse*10 + (number % 10);
            number /= 10;
        }

        return reverse;
    }

    static int reverseUsingStringBuilder(int number){
        StringBuilder reverse = new StringBuilder(Integer.toString(number)).reverse();
        return Integer.parseInt(reverse.toString());
    }
}
