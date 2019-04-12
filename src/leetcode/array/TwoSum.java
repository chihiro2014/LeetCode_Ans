package leetcode.array;

/**
 * leetcode.array
 *
 * @author : 姬野永远
 * @date : 12/04/2019 7:48 PM
 * @Email : liujch1996@gmail.com
 */
public class TwoSum {


    /**
     * General method for solving this problem.
     * Using a + b = c or c - a = b
     * Double for loop so it is O(n^2)
     * @param nums
     * @param target
     * @return
     */
    private int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        for (int i= 0;i<nums.length;i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target-nums[i]==nums[j]){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        throw new IllegalArgumentException("No results");

    }



    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{1, 2, 3, 4},5);
        for (int i = 0; i<result.length;i++){
            System.out.println(result[i]);
        }

    }
}
