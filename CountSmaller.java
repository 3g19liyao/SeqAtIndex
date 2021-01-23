package LiKou;

import java.util.ArrayList;
import java.util.List;

public class CountSmaller {
    public static void main(String[] args) {
        System.out.print(countSmaller(new int[]{5,2,6,1}));
    }
    public static List<Integer> countSmaller(int[] nums) {
        int len = nums.length;
        int[] count = new int[len];
        List<Integer> list = new ArrayList<>();
        for(int i = len - 1;i >= 0;i--){
            if(i == len - 1){
                count[i] = 0;
            }else{
                for(int j = i + 1;j < len;j++){
                    if(nums[j] < nums[i]){
                        count[i]++;
                    }else if(nums[j] == nums[i]){
                        count[i] = count[i] + 1 + count[j];
                    }
                }
            }
        }
        for(int x : count){
            list.add(x);
        }
        return list;
    }
}
