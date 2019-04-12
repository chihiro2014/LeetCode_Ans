package leetcode.array;

import java.util.Arrays;

/**
 * leetcode.ans.array
 *
 * @author : 姬野永远
 * @date : 11/04/2019 12:20 AM
 * @Email : liujch1996@gmail.com
 */
public class SquaresOfSortedArrays977 {


    public static void main(String[] args) {
        int[] a = {1,23,4,5,-1,6,2,10};
        int[] b = sortedsquares2(a);
        /*for (int aB : b) {
            System.out.println(aB);
        }*/
        for (int i = 0;i<b.length;i++){
            System.out.println(b[i]);
        }

    }

    private static int[] sortedSquares(int[] a){
        int n = a.length;
        int[] ans = new int[n];
        for (int i =0; i<n;i++){
            ans[i] = a[i]*a[i];
        }
        Arrays.sort(ans);
        return ans;
    }

    private static int[] sortedsquares1(int[] A){
        int N = A.length;
        int j = 0;
        while (j < N && A[j] < 0) {
            j++;
        }
        int i = j-1;

        int[] ans = new int[N];
        int t = 0;

        /*while (i >= 0 && j < N) {
            if (A[i] * A[i] < A[j] * A[j]) {
                ans[t++] = A[i] * A[i];
                i--;
            } else {
                ans[t++] = A[j] * A[j];
                j++;
            }
        }*/

        while (i >= 0) {
            ans[t++] = A[i] * A[i];
            i--;
        }
        while (j < N) {
            ans[t++] = A[j] * A[j];
            j++;
        }
        Arrays.sort(ans);

        return ans;
    }

    private static int[] sortedsquares2(int[] A){
        int N = A.length;
        int j = 0;
        while (j < N && A[j] < 0)
            j++;
        int i = j-1;

        int[] ans = new int[N];
        int t = 0;

        while (i >= 0 && j < N) {
            if (A[i] * A[i] < A[j] * A[j]) {
                ans[t++] = A[i] * A[i];
                i--;
            } else {
                ans[t++] = A[j] * A[j];
                j++;
            }
        }

        while (i >= 0) {
            ans[t++] = A[i] * A[i];
            i--;
        }
        while (j < N) {
            ans[t++] = A[j] * A[j];
            j++;
        }

        return ans;
    }
}
