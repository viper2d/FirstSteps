package first;

/**
 * Created by prov on 10/27/14.
 */
public class HighestOfArr {

    public static void main(String[] args) {

        System.out.println("Highest number: " + maxFor());
    }

    public static int maxFor() {

        int[] arr = new int[] {2, 4, 6, 8, 10};
        int max = arr[0];

        for (int ind = 0; ind < arr.length; ind++) {
            if (arr[ind] > max) {
                max = arr[ind];
            }
        }
        return max;
    }

}
