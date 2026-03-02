
import java.util.Scanner;
public class Guess {
  public static void main(String[] args) {
int corrguess = 1616;   
int guess = 50;
int num;
 Scanner sc = new Scanner(System.in);
    while (true) {
     System.out.print("enter number____: ");
    num = sc.nextInt();

        if (num > corrguess) {
        System.out.println("Your guess is HIGH.");
 } 
        else if (num < guess) {  
        System.out.println("Your guess is LOW.");
 } 
         else {
        System.out.println("Correct Range! Game Over"); 
            }
        }
    }
} 

 
