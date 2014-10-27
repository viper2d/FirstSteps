package first;

/**
 * Created by vladkork on 2014.10.27..
 */
public class FindInArray {
    public static void main(String[] args) {
        System.out.println(getFromArr());
    }
    public static int getFromArr() {
        int[] arr = new int[]{23, 54, 84, 12, 4, 1};
        int value = 67;
        int index;
        for (index = 0; index < arr.length ; index++) {
            if (arr[index] == value){
                break;
            }
            else if (index > arr.length){
                System.out.println("-1");
            }
        }
        return index;
    }
}
