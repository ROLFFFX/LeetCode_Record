package Easy;

import java.util.HashSet;

public class isPathCrossing {
    public static void main(String[] args) {
//        Given a string path, where path[i] = 'N', 'S', 'E' or 'W',
//        each representing moving one unit north, south, east, or west,
//        respectively. You start at the origin (0, 0) on a 2D plane and
//        walk on the path specified by path.
//
//                Return true if the path crosses itself at any point,
//                that is, if at any time you are on a location you have
//                previously visited. Return false otherwise.
//        String test = "NES";
//        System.out.println(isPathCrossing(test));   //should be false
//        String test_2 = "NESW";
//        System.out.println(isPathCrossing(test_2)); //should be true
        String test_3 = "NES";
        System.out.println(isPathCrossing(test_3)); //should be true

    }
    public static boolean isPathCrossing(String path) {
        HashSet<String> position = new HashSet<>();
        char x = 0;
        char y = 0;
        position.add(x + "," + y);  //add origin
        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            switch (direction){
                case 'N': x++; break;
                case 'S': x--; break;
                case 'W': y--; break;
                case 'E': y++; break;
            }
            String curr_position = x + "," + y;
            if (position.contains(curr_position)){
                return true;
            }
            position.add(curr_position);
        }
        return false;
    }
/** Only checks if it crosses origin **/
//    public static boolean isPathCrossing(String path) {
//        if (path.length() < 2){
//            return false;
//        }
//        HashSet<Character> visited = new HashSet<>();
//        for (int i = 0; i < path.length(); i++) {
//            char c_d = path.charAt(i);  // current digit
//            if (c_d == 'N'){
//                if (visited.contains('S')){
//                    visited.remove('S');
//                } else {
//                    visited.add('N');
//                }
//            } else if (c_d == 'E'){
//                if (visited.contains('W')){
//                    visited.remove('W');
//                } else {
//                    visited.add('E');
//                }
//            } else if (c_d == 'S'){
//                if (visited.contains('N')){
//                    visited.remove('N');
//                } else {
//                    visited.add('S');
//                }
//            } else if (c_d == 'W'){
//                if (visited.contains('E')){
//                    visited.remove('E');
//                } else {
//                    visited.add('W');
//                }
//            }
//            // at the end of each iteration check if visited is empty
//            if (visited.isEmpty()){
//                return true;
//            }
//        }
//        return false;
//    }
}
