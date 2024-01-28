package Easy;

public class Number_of_Changing_Keys {
    public int countKeyChanges(String s) {
        int count = 0;
        s = s.toLowerCase();
        char prev = s.charAt(0);
        for (char c : s.toCharArray()){
            if (prev != c){
                prev = c;
                count++;
            }
        }
        return count;
    }
}
