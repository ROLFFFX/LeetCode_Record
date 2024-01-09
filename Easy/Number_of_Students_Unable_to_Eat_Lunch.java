package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Number_of_Students_Unable_to_Eat_Lunch {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> sandwich = new Stack();
        for (int i = sandwiches.length - 1; i >=0; i--){
            sandwich.push(sandwiches[i]);
        }
        List<Integer> student = new ArrayList();
        for (int i : students) student.add(i);
        while (!sandwich.isEmpty() && student.contains(sandwich.peek())){
            student.remove(sandwich.pop());
        }
        return student.size();
    }
}
