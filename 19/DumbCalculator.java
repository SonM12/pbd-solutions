import java.util.Scanner;

public class DumbCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is the first number?");
        double first = input.nextDouble();
        
        System.out.print("What is your second number?");
        double second = input.nextDouble();
        
        System.out.print("What is your third number?");
        double third = input.nextDouble();
        
        double result = (first+second+third)/2;
        
        System.out.println("");
        System.out.println("(" + first + "+" + second + "+" + third + ") / 2 is... " + result);
    }
}
