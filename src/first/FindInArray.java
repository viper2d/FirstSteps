package first;

/**
 * Created by vladkork on 2014.10.27..
 */
public class FindInArray {
    public static void main(String[] args) {
        System.out.println(getFromArr(67));
        System.out.println(getFromArr2());
        System.out.println(getFromArr3());
    }
    public static int getFromArr(int value) {
        int[] arr = new int[]{23, 54, 84, 12, 4, 1};
        int index;
        for (index = 0; index < arr.length ; index++) {
            if (arr[index] == value) {
                break;
            }
            else if (index > arr.length) {
                System.out.println("-1");
            }
        }
        return index;
    }

    public static int getFromArr2() {
        int valueToSearch= 3;
        int countFound = 0;
        int[] row= {3, 6, 3, 5, 3, 2, 3, 8};
        for (int cell: row) {
            if (cell!= valueToSearch) {
                continue;
            }
            countFound++;
        }
        return countFound;

    }

    public static int getFromArr3(int value) {
        int[] arr = new int[]{23, 54, 84, 12, 4, 1};
        int index;
        int count = 0;
        for (index = 0; index < arr.length ; index++) {
            if (arr[index] == value) {
                count = count++;
                break;
            }
            else if (count > arr.length) {
                System.out.println("-1");
            }
        }
        return index;
    }
}
