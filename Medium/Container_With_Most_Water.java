package Medium;

public class Container_With_Most_Water {
    public static void main(String[] args) {
//        int[] height = {1,8,6,2,5,4,8,3,7};
        int[] height = {2,3,4,5,18,17,6};
        int ans = maxArea(height);

        System.out.println(ans);
    }

    public static int maxArea(int[] height) {
        // edge case handling
        if (height.length < 2){
            return 0;
        }
        if (height.length == 2){
            return Math.min(height[0], height[1]);
        }
        // two pointers, one left one right.
        // continue to move pointer with less height
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right){
            int curr = (right - left) * Math.min(height[left], height[right]);
            max = Math.max(curr, max);

            if (height[left] < height[right]){
                left++;
                continue;
            }
            right--;
        }
        return max;
    }
}
