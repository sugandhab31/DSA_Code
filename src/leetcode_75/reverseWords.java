package leetcode_75;

/**
 * Given an input string s, reverse the order of the words.
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * Return a string of the words in reverse order concatenated by a single space.
 * Note - that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
 */

public class reverseWords {
    public static void main(String[] args) {
        System.out.println(reverseAllWords("a good   example"));
    }

    /**
     * 
     * @param s
     * @return
     */
    
    public static String reverseAllWords(String s){
        String result = new String();
        String[] strArr;
        s = s.trim(); //removes extra spaces from start and end
        strArr = s.split(" ");

        for (String str : strArr) {
            if (str.trim() == ""){
                continue;
            } else {
                result = str+" "+result;
            }
        }

        return result.trim();
    }

}
