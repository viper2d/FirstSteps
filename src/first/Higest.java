package first;

/**
 * Created by prov on 10/23/14.
 */
public class Higest {

    public static void main(String[] args) {
        System.out.println(getHighestNumber(3, 7));

    }

    public static int getHighestNumber(int a, int b) {
        if (a > b){
            return a;
        } else {
            return b;
        }
    }

}
