import java.lang.reflect.Constructor;
import java.util.Arrays;

public class BosClass {

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        int yeniArr[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i] = arr[i];

        }
        yeniArr[arr.length - 1] = 7;
        arr = yeniArr;
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

    }


}