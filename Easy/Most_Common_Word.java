package Easy;

import java.util.HashMap;
import java.util.Map;

public class Most_Common_Word {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] arr = paragraph.toLowerCase().split("[!?',;. ]");
        HashMap<String, Integer> map = new HashMap();
        for (String s : arr){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        map.remove("");
        for (String s : banned){
            if (map.containsKey(s)){
                map.remove(s);
            }
        }
        int max = 0;
        String ans = "";
        // for (Map.Entry<String, Integer> entry : map.entrySet()){
        //     System.out.println("----");
        //     System.out.println(entry.getKey());
        //     System.out.println(entry.getValue());
        //     System.out.println("----");
        // }
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getValue() > max){
                max = entry.getValue();
                ans = entry.getKey();
            }
        }
        return ans;
    }
}
