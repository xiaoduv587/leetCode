import java.util.Arrays;

public class 选择排序 {


    private static void selectSort(int[] a) {
        if (a == null || a.length < 2) {
            return;
        }

        int length = a.length;
        for (int i = 0; i < length - 1; i++) {  //i ~ N-1

            //最小值在哪个位置上 i~N-1
            int minIndex = i;

            // 查找第（i+1）个最小元素，放到下标为i的位置
            for (int j = i + 1; j < length; j++) { // i ~ N-1上找最小值的下标
                minIndex = a[ j ] < a[ minIndex ] ? j : minIndex;
            }
            // 如果minIndex的值变了，说明有更小的元素，则a[minIndex]和a[i]进行交换
            swap(a, i, minIndex);
        }

    }

    private static void swap(int[] a, int i, int minIndex) {
        int temp = a[ minIndex ];
        a[ minIndex ] = a[ i ];
        a[ i ] = temp;
    }

    public static void main(String[] args) {
        int a[] = {49, 38, 65, 97, 76, 13, 27, 27, 49};
        selectSort(a);
        System.out.println(Arrays.toString(a));
    }
}
