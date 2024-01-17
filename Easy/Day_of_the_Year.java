package Easy;

public class Day_of_the_Year {
    public int dayOfYear(String date) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] format_date = date.split("-");
        int ans = Integer.valueOf(format_date[2]);
        for (int i = 0; i < Integer.valueOf(format_date[1]) - 1; i++){
            ans+=days[i];
        }
        //year % 4 == 0 && year % 100 != 0 || year % 400 == 0
        if (Integer.valueOf(format_date[0]) % 4 == 0 &&
                (Integer.valueOf(format_date[0]) % 100 != 0 ||
                        Integer.valueOf(format_date[0]) % 400 == 0) &&
                Integer.valueOf(format_date[1]) > 2){
            ans++;
        }
        return ans;
    }
}
