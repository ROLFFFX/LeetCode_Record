package Easy;

public class Time_Needed_to_Buy_Tickets {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int c = 0;
        int i = 0;
        while (tickets[k] != 0) {
            if (tickets[i] != 0) {
                tickets[i]--;
                c++;
            }
            i++;
            if (i == tickets.length) i = 0;
        }
        return c;
    }
}
