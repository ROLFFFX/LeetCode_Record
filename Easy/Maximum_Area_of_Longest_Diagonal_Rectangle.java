package Easy;

public class Maximum_Area_of_Longest_Diagonal_Rectangle {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxLen = 0;
        int maxArea = 0;
        for (int[] dimension:dimensions){
            if (dimension == null || dimension.length != 2) continue;
            int length = dimension[0];
            int width = dimension[1];
            double currLen = Math.sqrt(length*length + width*width);
            // If there are multiple rectangles with the longest diagonal,
            // return the area of the rectangle having the maximum area.
            if (currLen > maxLen){
                maxLen = currLen;
                maxArea = length * width;
            } else if (currLen == maxLen){
                maxArea = Math.max(maxArea, length * width);
            }
        }
        return maxArea;
    }
}
