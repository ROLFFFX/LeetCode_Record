package Easy;

import java.util.Stack;

public class Crawler_Log_Folder {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack();
        for (String op : logs){
            switch(op){
                case "./":
                    break;
                case "../":
                    if (!stack.isEmpty()){
                        stack.pop();
                    }
                    break;
                default:
                    stack.push(op);
            }
        }
        return stack.size();
    }
}
