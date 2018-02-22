import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your height in m?");
        double height = input.nextDouble();
        
        System.out.print("What is your weight in kg?");
        double weight = input.nextDouble();
        
        double result = weight/(height*height);
        
        System.out.println("Your BMI is " + result);
    }
}
