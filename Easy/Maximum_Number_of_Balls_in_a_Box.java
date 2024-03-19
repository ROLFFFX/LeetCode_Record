package Easy;

public class Maximum_Number_of_Balls_in_a_Box {
    public int countBalls(int lowLimit, int highLimit) {
        int[] bucket = new int[46];
        int max = 0;
        for (int i = lowLimit; i <= highLimit; i++) {
            int sum = 0;
            int number = i;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            bucket[sum]++;
            max = Math.max(max, bucket[sum]);
        }
        return max;
    }
}
