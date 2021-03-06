import java.util.IllegalFormatCodePointException;

//给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否
//则返回 -1。
//
//
//示例 1:
//
// 输入: nums = [-1,0,3,5,9,12], target = 9
//输出: 4
//解释: 9 出现在 nums 中并且下标为 4
//
//
// 示例 2:
//
// 输入: nums = [-1,0,3,5,9,12], target = 2
//输出: -1
//解释: 2 不存在 nums 中因此返回 -1
//
//
//
//
// 提示：
//
//
// 你可以假设 nums 中的所有元素是不重复的。
// n 将在 [1, 10000]之间。
// nums 的每个元素都将在 [-9999, 9999]之间。
//
// Related Topics 二分查找
public class 二分查找704 {

    //leetcode submit region begin(Prohibit modification and deletion)
    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            System.out.print("left = " + left);
            System.out.print("----------right = " + right);
            int mid = left + (right - left) / 2;
            System.out.println("----------mid = " + mid);
            if (nums[ mid ] == target) {
                return mid;
            } else if (nums[ mid ] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;

    }
//leetcode submit region end(Prohibit modification and deletion)

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 12;
        final int search = search(nums, target);
        System.out.println("search = " + search);
    }
}

