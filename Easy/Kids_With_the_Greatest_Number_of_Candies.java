package Easy;

import java.util.ArrayList;
import java.util.List;

public class Kids_With_the_Greatest_Number_of_Candies {
    public List<Boolean> kidsWithCandies_2(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies){
            max = Math.max(max, candy);
        }
        //max now have max candies
        List<Boolean> ans = new ArrayList();
        for (int candy : candies){
            ans.add(candy + extraCandies >= max);
        }
        return ans;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies){
            if (candy > max){
                max = candy;
            }
        }
        //max now have max candies
        List<Boolean> ans = new ArrayList();
        for (int candy : candies){
            if (candy + extraCandies >= max){
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }
}
