package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Uncommon_Words_from_Two_Sentences {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap();
        ArrayList<String> ans = new ArrayList();
        for (String s : s1.split(" ")){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        for (String s : s2.split(" ")){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                ans.add(entry.getKey());
            }
        }
        String[] ret = new String[ans.size()];
        for (int i = 0; i < ans.size(); i++){
            ret[i] = ans.get(i);
        }
        return ret;
    }
}
