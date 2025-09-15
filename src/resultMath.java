import java.util.Arrays;
public class resultMath {
    /**
     * Takes an Int array and returns the highest number
     * @return highest number of an array(int)
     */
    public static int calculateMax(int[] results){
        int highestNumber = results[0];
        for (int x : results){
            if (highestNumber < x){
                highestNumber = x;
            }
        }
        return highestNumber;
    }

    /**
     * Takes an Int array and returns the lowest number
     * @return lowest number of an array(int)
     */
    public static int calculateMin(int[] results){
        int lowestNumber = results[0];
        for (int x : results){
            if (lowestNumber > x){
                lowestNumber = x;
            }
        }
        return lowestNumber;
    }

    /**
     * Takes an Int array and adds together the contents to produce a total
     * @return total amount in an array(int)
     */
    public static double calculateTotal(int[] results){
        //Gather total
        int total = 0;
        for (int x : results){
            total = total + x;
        }
        return total;
    }

    /**
     * Takes an Int array and produces the average number
     * @return average number in an array(double)
     */
    public static double calculateAverage(int[] results) {
        int average = (int) (calculateTotal(results) / results.length);
        return average;
    }

    /**
     * Takes an Int array and produces its median
     * @return median in an array(double)
     */
    public static double calculateMedian(int[] results){
        Arrays.sort(results);
        if (results.length % 2 != 0)
            return results[results.length / 2];
        return (double) (results[(results.length - 1) / 2] + results[results.length / 2]) / 2.0;
    }
}
