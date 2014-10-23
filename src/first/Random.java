package first;

/**
 * Created by vladkork on 2014.10.22..
 */
public class Random {

    public static int genRnd(int min, int max) {

        int rnum;
        rnum = min + (int) (Math.random() * ((max - min) + 1));
        return rnum;
    }

    public static void main(String[] args) {


        System.out.println(Random.genRnd(0, 10));

    }
}
