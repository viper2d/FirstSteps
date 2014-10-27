package first;

/**
 * Created by prov on 10/27/14.
 */
public class HighestOfArr {

    public static void main(String[] args) {

        System.out.println("Highest number using 'For': " + maxFor());
        System.out.println("Highest number using 'Foreach': " + maxForEach());
    }

    public static int maxFor() {

        int[] arr = new int[] {4, 6, 12, 8, 10};
        int highest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            }
        }
        return highest;
    }

    public static int maxForEach() {
        int[] arr = new int[] {4, 6, 12, 8, 10};
        int highest = arr[0];

        for (int i : arr) {
            if (i > highest) {
                highest = i;
            }
        }
        return highest;
    }

}
