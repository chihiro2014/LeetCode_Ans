package leetcode.array;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * leetcode.ans.array
 *
 * @author : 姬野永远
 * @date : 11/04/2019 1:35 AM
 * @Email : liujch1996@gmail.com
 */
public class SortArrayByParity {

    public static void main(String[] args) {

    }


    public static int[] sortArrayByParity(int[] A) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int aA : A) {
            list.add(aA);
        }
        Stream<Integer> evenList = list.stream()
                                       .parallel()
                                       .filter(n -> n % 2 == 0);

        Stream<Integer> oddList = list.stream()
                                      .parallel()
                                      .filter(n -> n % 2 == 1);

        Stream<Integer> concat = Stream.concat(evenList, oddList);
        int[] intArray = concat.mapToInt(Integer::valueOf).toArray();
        return intArray;

    }


}
