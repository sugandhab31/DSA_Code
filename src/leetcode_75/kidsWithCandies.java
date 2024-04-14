package leetcode_75;

import java.util.ArrayList;
import java.util.List;

/**
 * There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, 
 * and an integer extraCandies, denoting the number of extra candies that you have.
 * Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, 
 * they will have the greatest number of candies among all the kids, or false otherwise.
 * Note - that multiple kids can have the greatest number of candies.
 */

public class kidsWithCandies {
    public static void main(String[] args) {
        System.out.println(kidswithCandies(new int[]{2,3,5,1,3}, 3));
    }
    /**
     * 
     * @param candies
     * @param extraCandies
     * @return 
     */

    public static List<Boolean> kidswithCandies(int[] candies, int extraCandies){
        List<Boolean> resuList = new ArrayList<>();
        int max = 0;

            for (int i=0;i<candies.length;i++){
                if (max<=candies[i]){
                    max = candies[i];
                } 
            }

            for (int i=0; i<candies.length;i++){
                if (candies[i]+extraCandies >= max){
                    resuList.add(true);
                } else {
                    resuList.add(false);
                }                
            }
        return resuList;
    }
}
