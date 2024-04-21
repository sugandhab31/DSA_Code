package leetcode_75;

import java.util.Stack;

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
        Stack<String> st = new Stack<String>();
        for (int i = 0; i < s.length(); i++) {
            String str = new String();
            while(i<s.length() && s.charAt(i)!=' '){
                str = str + s.charAt(i);
                i++;
            }
            if (str.length()>0){
                st.push(str);
            }
        }
        String result = new String();
        while (st.size()>1) {
            result = result + st.pop() + " ";
        }
        result = result + st.pop();
        return result;
    }

}
    