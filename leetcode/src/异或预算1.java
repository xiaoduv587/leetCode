import java.util.Arrays;

public class 异或预算1 {


    /**
     * arr中，只有一种数，出现奇数次
     */
    private static void printOddTimesNum1(int[] arr) {
        int eor = 0;
        for (int value : arr) {
            eor ^= value;
        }
        System.out.println("eor1 = " + eor);
    }

    /**
     * arr中，只有两种数，出现奇数次
     */
    private static void printOddTimesNum2(int[] arr) {
        int eor = 0;
        for (int value : arr) {
            eor ^= value;
        }
        // eor = a^b
        // eor !=0
        // eor必然有一个位置上是1
        int rightOne = eor & (~eor + 1);    //提取最右侧的1

        int onlyOne = 0;
        for (int value : arr) {
            if ((value & rightOne) == rightOne) {
                onlyOne ^= value;
            }
        }

        System.out.println("eor2 = " + onlyOne + " " + (eor ^ onlyOne));
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 1, 2, 3, 4, 3, 4};
        printOddTimesNum1(arr1);

        int[] arr2 = {1, 2, 3, 1, 2, 3, 4, 3, 4, 4};
//        printOddTimesNum2(arr2);

        swap(arr1, 0, 1);





    }

    private static void swap(int[] arr, int a, int b) {
        arr[ a ] = arr[ a ] ^ arr[ b ];
        arr[ b ] = arr[ a ] ^ arr[ b ];
        arr[ a ] = arr[ a ] ^ arr[ b ];
    }
}
