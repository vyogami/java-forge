package maths.numericalmethods;

public class Bisection {
    
    public static double function(double x){
        return x*x*x - x - 4;
    }

    public static double solve(double a, double b){
        double c = (a+b)/2;
        int count = 1;

        while(function(c) != 0){
            c = (a+b)/2;
            System.out.println("x" + count + ": " + c); 
            
            if(function(c) > 0){
                b = c; 
            }
            else{
                a = c;
            }

            count++;
        }

        return c;

    }
}
