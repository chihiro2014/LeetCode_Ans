package leetcode.hash;

import java.util.HashSet;

/**
 * leetcode.hash
 *
 * @author : 姬野永远
 * @date : 12/04/2019 7:03 PM
 * @Email : liujch1996@gmail.com
 */
public class JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        boolean[] isJ = new boolean[128];
        for (char c:J.toCharArray()){
            isJ[c] = true;
        }
        int count = 0;
        for (char c: S.toCharArray()){
            if (isJ[c])
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        JewelsAndStones newTest = new JewelsAndStones();
        System.out.println(newTest.numJewelsInStones("AbCd","AEDsasdeAdEv"));
    }
}
