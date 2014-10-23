package first;

/**
 * Created by vladkork on 2014.10.22..
 */
public class Random {

    public static int generate(int min,int max)
    {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    public static void main(String[] args)
    {
        System.out.println(Random.generate(0,10));
    }
}
