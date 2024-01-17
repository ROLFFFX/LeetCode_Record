package Easy;

public class Number_of_Senior_Citizens {
    public int countSeniors(String[] details) {
        int c = 0;
        for (String s : details){
            int age = Integer.parseInt(s.substring(11, 13));
            if (age > 60) {
                c++;
            }
        }
        return c;
    }
}
