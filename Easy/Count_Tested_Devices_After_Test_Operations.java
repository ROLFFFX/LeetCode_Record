package Easy;

public class Count_Tested_Devices_After_Test_Operations {
    public int countTestedDevices(int[] batteryPercentages) {
        int count = 0;
        for (int i : batteryPercentages){
            if (i - count > 0){
                count++;
            }
        }
        return count;
    }
}
