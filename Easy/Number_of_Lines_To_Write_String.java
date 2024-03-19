package Easy;

public class Number_of_Lines_To_Write_String {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int sum = 0;
        for (char c : s.toCharArray()){
            if (sum + widths[c - 'a'] <= 100) {
                sum += widths[c - 'a'];
            } else {
                lines++;
                sum = widths[c - 'a'];
            }
        }
        return new int[]{lines, sum};
    }
}
