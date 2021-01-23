package LiKou;

public class CuttingRope {
    public static void main(String[] args) {
        System.out.println(cuttingRope(10));
    }
    public static int cuttingRope(int n){
        if(n <= 2)
            return 1;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2 ; i <= n; i++){
            for(int j = 1;j < i;j++){
                dp[i] = Math.max(Math.max(dp[i],j*(i-j)),Math.max(dp[j]*(i-j),(dp[j]*dp[i-j])));
                System.out.println(dp[i]);
            }
        }
        return dp[n];
    }
}
