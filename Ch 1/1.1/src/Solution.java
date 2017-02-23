import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by Kingpin on 2/21/17.
 */
public class Solution {

    public static void main(String[] args) {

        // Given a string, see if it has all unique characters, without using additional data structures
        String s = "nopqrstuvwxyzabcdefghijklm";
        String s1 = "abcdefghhijklmnop";
        String s2 = "lskcmaegkclaofkp";
        String s3 = "poiuytrewqkjhgfdsamnbvcxz"

        System.out.println(checkUniquenessWithDataStructure(s));
        System.out.println(checkUniquenessWithDataStructure(s1));

    }

    private static boolean checkUniquenessWithDataStructure(String s) {
        // Size of the alphabet
        int size_of_alphabet = 256;
        boolean bits[] = new boolean[size_of_alphabet];
        for (int i=0; i < s.length(); i ++) {
            int value = Character.getNumericValue(s.charAt(i));
            if (bits[value]) {
                // bits is true. character exists already
                return false;
            } else {
                bits[value] = true;
            }
        }
        return true;
    }

}
