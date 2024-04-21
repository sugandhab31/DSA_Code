package leetcode_75;

public class productExceptSelf {
    public static void main(String[] args) {
        int[] result = new int[100];
        result = Solution(new int[]{-1,1,0,-3,3});
        
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] Solution(int[] num) {
        int[] result = new int[num.length];
        int total_array_product = 1, product = 1, count = 0;

        for (int i = 0; i < num.length; i++) {
            if(num[i]!=0){
                product = num[i]*product;
            } else if (num[i] == 0) {
                count++;
            }
            total_array_product = num[i]*total_array_product;
        }

        if (count>1){
            return new int[num.length];
        }

        for (int i = 0; i < num.length; i++) {
            if(num[i] == 0){
                result[i] = product;                
            } else {
                result[i] = total_array_product/num[i];
            }
            
        }
        return result;
    }
}
