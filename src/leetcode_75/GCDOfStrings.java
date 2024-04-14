package leetcode_75;

/**
 * 1071. Greatest Common Divisor of Strings
 * For two strings s and t, we say "t divides s" if and only if s = t + t + t +... + t + t (i.e., t is concatenated with itself one or more times).
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 * Return the gcd string.
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 */

public class GCDOfStrings {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABABABAB", "ABAB"));
    }

    /**
     * 
     * @param word1 Input string 1
     * @param word2 Input string 2
     * @return {@link String} Greatest Common Divisor of Strings
     */
    public static String gcdOfStrings(String word1, String word2) {
        String result = new String();
        String str1 = new String();
        String str2 = new String();
        int gcd = 0;

        str1 = word1 + word2;
        str2 = word2 + word1;
        if (str1.equals(str2)) {
            gcd = gcd(word1.length(), word2.length());
        }

        result = word1.substring(0, gcd);
        return result;
    }

    static int gcd(int a, int b) {
        // if b=0, a is the GCD
        if (b == 0)
            return a;
        // call the gcd() method recursively by
        // replacing a with b and b with
        // difference(a,b) as long as b != 0
        else
            return gcd(b, Math.abs(a - b));
    }
}
