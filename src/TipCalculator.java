import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.print("Bill: ");
        double bill = scan.nextDouble();

        System.out.print("Total number of people: ");
        int people = scan.nextInt();

        System.out.print("Tip percentage: ");
        double tip = scan.nextDouble();


        double tip2 = (bill/people)*(tip/100);
        tip2 = Math.round(tip2*100.0)/100.0;
        double tip3= (tip2+bill/people);
        tip3 = Math.round(tip3*100.0)/100.0;
        System.out.println("The total bill is "+bill);
        System.out.println("The total number of people is "+people);
        System.out.println("The tip percentage is "+tip);
        System.out.println("The total tip per person is " + tip2);
        System.out.println("The total tip amount is "+ (tip3*100.0)/100.0);
        System.out.println("The total bill including tip is " +(bill+tip3));


    }
}
