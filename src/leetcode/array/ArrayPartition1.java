package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * leetcode.array
 *
 * @author : 姬野永远
 * @date : 12/04/2019 1:53 AM
 * @Email : liujch1996@gmail.com
 */
public class ArrayPartition1 {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,5,6};
        System.out.println(arrayPairSum(nums));

    }
    public static int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i<nums.length;i+=2){
            sum += nums[i];
        }
        return sum;

    }

    /*@FunctionalInterface
    interface minCal{
        int min(int a, int b);
    }*/
}
