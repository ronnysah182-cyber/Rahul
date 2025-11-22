import java.util.Scanner;
/**
 * Write a description of class RickshawFare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rickshawfare{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter distance in km:");
        float distance=input.nextFloat();
        input.nextLine();
        System.out.println("Enter time in minutes: ");
        float time=input.nextFloat();
        input.nextLine();
        System.out.println("Are you local? (Yes or No): ");
        char type=input.nextLine().charAt(0);
        System.out.println("Are you travelling at night? (Yes or No): ");
        char travel=input.nextLine().charAt(0);
        float fare=(float)(21*distance)+(7*time);
        float Increased_fare= (float)2.70*fare;
        float Discount_fare=(float)1.70*fare;
        float final_fare=(type=='Y'&& travel=='Y')?Discount_fare:(type!='Y'&& travel=='Y')?Increased_fare:fare;
        System.out.println("Your final fare is: "+final_fare);
        
    }
}