package playground;

public class Digits {

    public static int numberOfDigts(int number){
        int count = 0;
        while(number != 0){count++;
            number /= 10;
        }
        return count;
    }

    public static int numberOfDigtsUsingString(int number){
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

    public static int reverseUsingStringBuilder(int number){
        return Integer.parseInt(new StringBuilder().append(number).reverse().toString());
    }
}
