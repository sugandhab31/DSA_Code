package leetcode_75;

/**
 * Given a string s, reverse only all the vowels in the string and return it.
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once. 
 */

public class reverseVowels {
    
    public static void main(String[] args) {
        System.out.println(reverseAllVowels("hello"));
    }

    /**
     * 
     * @param s
     * @return
     */

    public static String reverseAllVowels(String s){
        int l = 0,r = s.length()-1;
        String vowels = new String("aeiouAEIOU");
        char[] ch = s.toCharArray();
        char temp;

        while(l<r){            
            if(!vowels.contains(ch[l]+"")){
                l++;
            } else if (!vowels.contains(ch[r]+"")){
                r--;
            } else {
                temp = ch[l];
                ch[l] = ch[r];
                ch[r] = temp;
                l++;
                r--;
            }   
            
        }
        s = "";
        for (char c : ch) {
            s = s+c;
        }

        return s;
    }
}
