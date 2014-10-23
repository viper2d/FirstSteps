package first;

/**
 * Created by vladkork on 2014.10.22..
 */
public class Vat {

    public static void main(String[] args) {
        System.out.println(incVat(21));
    }

    public static double incVat(double price){
        price = price + price / 100 * 21;
        return price;
    }

}
