package Easy;

import java.util.Stack;

public class Minimum_String_Length_After_Removing_Substrings {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        st.push(s.charAt(0));
        for(int i=1;i<n;i++)
        {
            if(!st.isEmpty()&&((s.charAt(i)=='B'&&st.peek()=='A')||(s.charAt(i)=='D'&&st.peek()=='C')))
            {
                st.pop();
            }
            else
                st.push(s.charAt(i));
        }
        return st.size();
    }
}
