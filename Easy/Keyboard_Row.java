package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Keyboard_Row {
    public String[] findWords(String[] words) {
        List<String> ans = new ArrayList();
        for (String s : words){
            if (isValid(s)) ans.add(s);
        }
        String[] ret = new String[ans.size()];
        for (int i = 0; i < ans.size(); i++){
            ret[i] = ans.get(i);
        }
        return ret;
    }

    public boolean isValid(String word){
        int flag = fromRow(word.charAt(0));
        for (char c : word.toCharArray()){
            if (fromRow(c) != flag) return false;
        }
        return true;
    }

    public int fromRow(char c){
        List<Character> one = new ArrayList(
                Arrays.asList('q','w','e','r','t','y','u','i','o','p','Q','W','E','R','T','Y','U','I','O','P'));
        List<Character> two = new ArrayList(
                Arrays.asList('a','s','d','f','g','h','j','k','l','A','S','D','F','G','H','J','K','L'));
        List<Character> three = new ArrayList(
                Arrays.asList('z','x','c','v','b','n','m','Z','X','C','V','B','N','M'));
        if (one.contains(c)) return 1;
        if (two.contains(c)) return 2;
        if (three.contains(c)) return 3;
        return -1;
    }
}
