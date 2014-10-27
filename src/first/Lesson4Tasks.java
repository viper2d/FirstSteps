package first;

import java.util.Arrays;

/**
 * Created by vladkork on 2014.10.27..
 */
public class Lesson4Tasks {
    public static void main(String[] args) {

        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = genRnd(10, 30);
        }
        System.out.println("Random array: " + Arrays.toString(arr));
        System.out.println();

        System.out.println("Highest of two: " + getHighestNumber(3, 7));
        System.out.println();

        System.out.println("Highest of four: " + getHighestNumber(3, 7, 12, 33));
        System.out.println();

        System.out.println("Highest number using 'For': " + maxFor());
        System.out.println("Highest number using 'Foreach': " + maxForEach());
        System.out.println();
    }

    public static int genRnd(int min, int max) {

        int rnum;
        rnum = min + (int) (Math.random() * ((max - min) + 1));
        return rnum;
    }

    public static int getHighestNumber(int a, int b) {
        if (a > b){
            return a;
        } else {
            return b;
        }
    }

    public static int getHighestNumber(int a, int b, int c, int d) {
        if (getHighestNumber(a, b) >= c && getHighestNumber(a, b) >= d) {
            return getHighestNumber(a, b);
        } else if (c >= getHighestNumber(a, b) && c >= d) {
            return c;
        } else {
            return d;
        }
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
