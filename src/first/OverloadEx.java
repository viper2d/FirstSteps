package first;

/**
 * Created by vladkork on 2014.10.22..
 */
public class OverloadEx {

    public static void overLoad(int a, long b) {
        System.out.println(a+b);
    }

    public static void overLoad(int a, int b, int c) {
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        overLoad(10,10,10);
        overLoad(10,10);
    }

}
