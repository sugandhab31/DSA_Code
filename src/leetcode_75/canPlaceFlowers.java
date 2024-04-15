package leetcode_75;

/**
 * You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, 
 * return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
 */

public class canPlaceFlowers {
    public static void main(String[] args) {
        System.out.println(canPlaceFlower(new int[]{1}, 0));
    }
/**
 * @param flowerbed
 * @param n
 * @return
 */
    public static Boolean canPlaceFlower(int[] flowerbed, int n){
        int m = flowerbed.length;
        for (int i =  0; i < m; ++i) {
            int l = i ==  0 ?  0 : flowerbed[i -  1];
            int r = i == m -  1 ?  0 : flowerbed[i +  1];
            if (l + flowerbed[i] + r ==  0) {
                flowerbed[i] =  1;
                --n;
            }
        }
        return n <=  0;
    }
}
