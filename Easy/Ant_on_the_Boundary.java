package Easy;

public class Ant_on_the_Boundary {
    public int returnToBoundaryCount(int[] nums) {
        int position = 0;
        int returnCount = 0;

        for (int num : nums) {
            position += num;
            if (position == 0) {
                returnCount++;
            }
        }

        return returnCount;
    }
}
