import java.util.Arrays;

public class 冒泡排序 {


    private static void test(int[] arr) {
        if (arr != null && arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[ j ] > arr[ j + 1 ]) {
                    swap(arr, j, j+1);
                }
            }
        }

        System.out.println("arr = " + Arrays.toString(arr));


    }

    private static void swap(int[] arr, int i, int j) {
        arr[ i ] = arr[ i ] ^ arr[ j ];
        System.out.println("arr[i]+\" \"+arr[j] = " + arr[i]+" "+arr[j]);
        System.out.println();
        arr[ j ] = arr[ i ] ^ arr[ j ];
        System.out.println("arr[i]+\" \"+arr[j] = " + arr[i]+" "+arr[j]);
        System.out.println();
        arr[ i ] = arr[ i ] ^ arr[ j ];
        System.out.println("arr[i]+\" \"+arr[j] = " + arr[i]+" "+arr[j]);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 3};
        test(arr);
    }
}
