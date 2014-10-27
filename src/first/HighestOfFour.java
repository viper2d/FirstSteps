package first;

/**
 * Created by prov on 10/27/14.
 */
public class HighestOfFour {
    public static void main(String[] args) {
        System.out.println(getHighestNumber(3, 7, 12, 33));

    }

    public static int getHighestNumber(int a, int b) {
        if (a > b) {
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

}

