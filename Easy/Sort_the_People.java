package Easy;

public class Sort_the_People
{
    public String[] sortPeople(String[] names, int[] heights) {
        for (int i = 0; i < names.length; i++){
            // sort subarray 0 to names.length
            int max = 0;
            int max_index = 0;
            for (int j = i; j < names.length; j++){
                if (heights[j] > max){
                    max = heights[j];
                    max_index = j;
                }
            }
            String temp = names[i];
            names[i] = names[max_index];
            names[max_index] = temp;
            int h = heights[i];
            heights[i] = heights[max_index];
            heights[max_index] = h;
        }
        return names;
    }
}
