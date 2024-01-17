package utils;

import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Progress_Log {

    public static void main(String[] args) {
        String s = "Unique Email Addresses";
        String ans = "";
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                ans += "_";
            } else {
                ans += c;
            }
        }
        System.out.println(ans);

        try {
            // Define the file name
            String filename = "log.txt";

            // Get current date and time
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = now.format(formatter);

            // Append the date and time to the file
            FileWriter fileWriter = new FileWriter(filename, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Program ran at: " + formattedDateTime);
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
