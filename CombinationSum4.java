package LiKou;

import java.util.Arrays;

public class CombinationSum4 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        System.out.print(combinationSum4(nums,4));
    }
    public static int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        int len = nums.length;
        Arrays.sort(nums);
        for(int i = 1;i <= target;i++){
            for(int j = 0;j < len ; j++){
                if(i - nums[j] >= 0){
                    dp[i] += dp[i - nums[j]];
                }else{
                    break;
                }
            }
        }
        return dp[target];
    }
}
