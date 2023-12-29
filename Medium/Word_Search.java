package Medium;

import java.util.HashSet;

public class Word_Search {
    public static void main(String[] args) {
        char[][] board1 = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word1 = "ABCCED";
        exist(board1, word1);

    }

    public static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (find(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean find(char[][] board, String word, int i, int j, int index) {
        if (index == word.length()) {
            return true; // Word is found
        }
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false; // Out of bounds or character mismatch
        }

        char temp = board[i][j];
        board[i][j] = '*'; // Mark cell as visited

        boolean found = find(board, word, i + 1, j, index + 1) ||
                find(board, word, i - 1, j, index + 1) ||
                find(board, word, i, j + 1, index + 1) ||
                find(board, word, i, j - 1, index + 1);

        board[i][j] = temp; // Restore cell

        return found;
    }


//    public static boolean exist(char[][] board, String word) {
//        // locate all occurrences
//        char initial = word.charAt(0);
//        HashSet<String> occurrences = new HashSet();
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[0].length; j++) {
//                if (board[i][j] == initial){
//                    occurrences.add(i + "," + j);
//                }
//            }
//        }
//        // now occurrences have all locations where word starts.
//        for (String occur: occurrences){
//            if (find(board, word, occur)){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static boolean find(char[][] board, String word, String occur){
//        // start finding the word.
//        int row = board.length; // number of rows
//        int col = board[0].length; // number of columns
//        // return true when word is found.
//
//        // parse occur to get starting index
//        String[] parts = occur.split(",");
//        int row_start = Integer.parseInt(parts[0]);
//        int col_start = Integer.parseInt(parts[1]);
//        int index = 0;
//        while (row_start < row && col_start < col && row_start >= 0 && col_start >= 0){
//            if (board[row_start+1][col_start] == word.charAt(index)){
//                row_start++;
//                index++;
//            } else if (board[row_start-1][col_start] == word.charAt(index)) {
//                row_start--;
//                index++;
//            } else if (board[row_start][col_start+1] == word.charAt(index)) {
//                col_start++;
//                index++;
//            } else if (board[row_start][col_start-1] == word.charAt(index)) {
//                col_start--;
//                index++;
//            }
//        }
//        if (index == word.length()){
//            return true;
//        }
//        return false;
//    }
}
