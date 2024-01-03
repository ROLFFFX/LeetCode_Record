package Medium;

public class Number_of_Laser_Beams_in_a_Bank {
    public int numberOfBeams(String[] bank) {
        ArrayList<Integer> rows = new ArrayList();
        for (String row : bank){
            int num_of_1 = numberOfOne(row);
            if (num_of_1 != 0){
                rows.add(num_of_1);
            }
        }
        int ans = 0;
        for (int i = 0; i < rows.size() - 1; i++){
            int curr = rows.get(i);
            ans += curr * rows.get(i+1);
        }
        return ans;
    }

    public static int numberOfOne(String row){
        int c = 0;
        for (int i = 0; i < row.length(); i++){
            if (row.charAt(i) == '1'){
                c++;
            }
        }
        return c;
    }
}
