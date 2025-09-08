//Dice roller by Kathryn Kelly
//Sorry that's it so simple, this week was fucked up
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.println("How many sides does the dice have?");
        int howManySides = inputReader.nextInt();

        System.out.println("How many times does the dice roll?");
        int howManyTimes = inputReader.nextInt();

        int[] results = new int[howManyTimes];

        //Get results
        for (int i = 0; i < howManyTimes; i++) {

            results[i] = (int) (Math.random() * (howManySides) + 1);
        }

        //Find highest
        int highestNumber = results[0];
        for (int x : results){
            if (highestNumber < x){
                highestNumber = x;
            }
        }

        //Find lowest
        int lowestNumber = results[0];
        for (int x : results){
            if (lowestNumber > x){
                lowestNumber = x;
            }
        }

        //Gather total
        int total = 0;
        for (int x : results){
            total = total + x;
        }

        //Find average:
        int average = total / howManyTimes;



        System.out.println("Here's your numbers:");
        System.out.println(Arrays.toString(results));

        System.out.println("Max: " + highestNumber);
        System.out.println("Min: " + lowestNumber);
        System.out.println("Average: " + average);
        System.out.println("Total: " + total);

    }}

