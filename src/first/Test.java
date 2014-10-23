package first;



/**
 * Created by vladkork on 2014.10.22..
 */
public class Test {

    public static double vat(double price){
        price = price + price / 100 * 21;
        return price;
    }

    public static void main(String[] args) {
        double incVat = vat(21);
        System.out.println(incVat);
    }
}
