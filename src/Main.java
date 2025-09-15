//Improved Dice roller by Kathryn Kelly
//I spent ten fucking hours trying to figure out user input, I put the non-working code down at the bottom of the page.
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        while (true){

        Scanner inputReader = new Scanner(System.in);

        System.out.println("How many sides does the dice have?");
        var howManySides = inputReader.nextInt();

        System.out.println("How many times does the dice roll?");
        int howManyTimes = inputReader.nextInt();

        int[] results = new int[howManyTimes];

        //Get results
        for (int i = 0; i < howManyTimes; i++) {

            results[i] = (int) (Math.random() * (howManySides) + 1);
        }

        System.out.println("Here's your numbers:");
        System.out.println(Arrays.toString(results));

        System.out.println("Max: " + resultMath.calculateMax(results));
        System.out.println("Min: " + resultMath.calculateMin(results));
        System.out.println("Average: " + resultMath.calculateAverage(results));
        System.out.println("Median: " + resultMath.calculateMedian(results));
        System.out.println("Total: " + resultMath.calculateTotal(results));


        System.out.println("Do you want to stop rolling? Type 0 if so");

        int RerollCheck = inputReader.nextInt();

        if (RerollCheck == 0){
            break;
        }

    }}}

/*
:(
//Good ol' endless loop until the user submits a valid number
        //Creating a loop for each input 'cause it feels cleaner from a user's standpoint
        //I spent, like, ten hours in total trying to figure this out, I give up on it. It's fucking hellish
        boolean sideCheck = false;
        while (!sideCheck){
            System.out.println("How many sides does the dice have?");
            var userInputCheck = 0;
            try {
                userInputCheck = inputReader.nextInt();
            } catch (Exception e) {
                System.out.println("Please insert a valid number");
                continue;
            }
            sideCheck = true;
        }
 */
