package first;
import java.util.Arrays;

/**
 * Created by prov on 10/23/14.
 */
public class RandArr {

    public static void main(String[] args) {

        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = genRnd(10, 30);
        }

        System.out.println(Arrays.toString(arr));
    }

    public static int genRnd(int min, int max) {

        int rnum;
        rnum = min + (int) (Math.random() * ((max - min) + 1));
        return rnum;
    }

}
