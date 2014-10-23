import java.util.Random;
package first;

/**
 * Created by vladkork on 2014.10.22..
 */
public class Random {

    public static int generate(int min,int max) {

        return

    }

    public static void main(String[] args) {

        System.out.println(generate(0,10));

    }

    public static void main(String[] args){

        Random aRandom = new Random();

        System.out.println(aRandom.nextInt());

        //print a random number between 1 and 10
        System.out.println(aRandom.nextInt(10) + 1);

        System.out.println(aRandom.nextDouble());
        System.out.println(aRandom.nextBoolean());
    }
}
