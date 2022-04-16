import java.util.Scanner;

public class bodymassindex{
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int weight;

        double height, bmi;


        System.out.print("Please enter your height (in meters) :");

        height = scan.nextDouble();

        System.out.print("Please enter your weight :");

        weight = scan.nextInt();


        bmi = weight / (height * height);

        System.out.print("Your Body Mass Index :" + bmi);
    }
}
