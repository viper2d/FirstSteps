package first;
import java.util.Arrays;
/**
 * Created by vladkork on 2014.10.27..
 */
public class BubbleSort {
    public static void main(String[] args) {
        System.out.println(bubbleSort());
    }
    public static int bubbleSort() {
        int[] arr = new int[]{5,3,2,1,4};
        int highest = arr[0];
        int m = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                m = arr[i];
                //arr[i] = arr[i + 1];
               // arr[i + 1] = m;
            }
        }
        return m;
    }
}
