package leetcode_75;

/**
 * 1768. Merge Strings Alternately
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. 
 * If a string is longer than the other, append the additional letters onto the end of the merged string.
 * Return the merged string.
 */

 class Solution {
    /**
     * @param word1
     * @param word2
     * @return
     */
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abcd","xyz123"));
    }

    public static String mergeAlternately(String word1, String word2) {
        String result = new String();
        int i = 0;
        int j = 0;
        while (i<word1.length() && j<word2.length()) {            
            result = result+word1.charAt(i)+word2.charAt(j);
            i++; 
            j++;        
        }
        while (i!=word1.length()) {
            result = result+word1.charAt(i);
            i++;
        }
        while (j!=word2.length()) {            
            result = result+word2.charAt(j);
            j++;
        }
        

    return result;
    }
    
}