package first;

/**
 * Created by vladkork on 2014.10.27..
 */
public class FindInArray {
    public static void main(String[] args) {
        System.out.println(getFromArr(67));
    }

    public static int getFromArr(int value) {
        int[] arr = new int[]{23, 54, 84, 12, 4, 1};
        int index;
        int count = 0;
        for (index = 0; index < arr.length ; index++) {
            if (arr[index] != value) {
                count++;
                if (count >= arr.length) {
                    index = -1;
                    System.out.print("No such value! ");
                    break;
                }
            }
            else if (arr[index] == value) {
                System.out.print("Value is in cell #");
                break;
            }
        }
        return index;
    }
}
