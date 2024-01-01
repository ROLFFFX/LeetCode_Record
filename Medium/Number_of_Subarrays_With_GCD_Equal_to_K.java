package Medium;

public class Number_of_Subarrays_With_GCD_Equal_to_K {
    public int subarrayGCD(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            int temp = nums[i];
            for (int j = i; j < nums.length; j++){
                int currGCD = gcd(temp, nums[j]);
                if (currGCD < k){
                    break;
                }
                if (currGCD == k){
                    count++;
                }
                temp = currGCD;
            }
        }
        return count;
    }

    private int gcd(int a, int b){
        return b == 0 ? a :gcd(b, a % b);
    }
}
