package Easy;

public class Number_of_Students_Doing_Homework_at_a_Given_Time {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++){
            if (startTime[i] <= queryTime && endTime[i] >= queryTime){
                count++;
            }
        }
        return count;
    }
}
