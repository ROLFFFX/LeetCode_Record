package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Repeated_DNA_Sequences {
    public List<String> findRepeatedDnaSequences(String s) {
        int start = 0;
        int end = 10;
        HashMap<String, Integer> map = new HashMap();
        for (; end <= s.length(); start++, end++){
            map.put(s.substring(start, end),
                    map.getOrDefault(s.substring(start, end), 0) + 1);
        }
        List<String> ans = new ArrayList();
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getValue() > 1){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}
