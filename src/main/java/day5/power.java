/*
 *
 *Implement pow(x, n), which calculates x raised to the power n.
 *
 *
 *
 */
import java.util.*;
class Power{
    public static double myPow(double x, int n) {
        if(n == 0){
            return 1.0;
        }
        else if(n == 1){
            return x;
        }
        if(n < 0){
            if(n == Integer.MIN_VALUE){
                n += 1;
                return 1/ (x * myPow(x,-1 * n));
            }
            return myPow(1 / x,-1 * n );
        }
        if(n % 2 == 0){
            return myPow(x * x, n / 2);
        }
        return x * myPow(x * x, n / 2);
        
    }
    public static void main(String[] args){
	    Scanner ip = new Scanner(System.in);
	    System.out.println("Enter x and n");
	    double x = ip.nextDouble();
	    int n = ip.nextInt();
	    System.out.println(Power.myPow(x,n));
    }
}
