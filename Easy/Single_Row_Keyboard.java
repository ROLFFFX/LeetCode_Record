package Easy;

public class Single_Row_Keyboard {
    public int calculateTime(String keyboard, String word) {
        int prev = 0;
        int mv = 0;
        for (char c : word.toCharArray()){
            mv += Math.abs(keyboard.indexOf(c) - prev);
            prev = keyboard.indexOf(c);
        }
        return mv;
    }
}
