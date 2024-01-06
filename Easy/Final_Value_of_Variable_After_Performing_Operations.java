package Easy;

public class Final_Value_of_Variable_After_Performing_Operations {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for (String op : operations){
            if (op.charAt(1) == '+') ans++;
            else ans--;
        }
        return ans;
    }
}
