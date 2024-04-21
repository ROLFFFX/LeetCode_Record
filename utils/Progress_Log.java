package utils;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Progress_Log {

    public static void main(String[] args) {
        String s = "Find All Groups of Farmland";
        String ans = "";
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                ans += "_";
            } else {
                ans += c;
            }
        }
        System.out.println(ans);

        String filename = "./log/public/log.txt";
        Map<String, String> problemLog = new HashMap<>();
        int maxCounter = 234; // Start from 234, so the first new entry will be 235

        try {
            // Read the existing file
            File file = new File(filename);
            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split("\t\\|\t");
                    if (parts.length >= 3) {
                        problemLog.put(parts[2], parts[0] + "\t" + "|" + "\t" + parts[1]);
                        int currentCounter = Integer.parseInt(parts[1].trim());
                        if (currentCounter > maxCounter) {
                            maxCounter = currentCounter;
                        }
                    }
                }
                reader.close();
            }

            // Update or add the current problem
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = now.format(formatter);

            if (!problemLog.containsKey(s)) {
                maxCounter++; // Increment counter for new problem
            }
            problemLog.put(s, "Problem solved at: " + formattedDateTime + "\t" + "|" + "\t" + maxCounter);

            // Write the updated content back to the file
            PrintWriter writer = new PrintWriter(new FileWriter(filename));
            for (Map.Entry<String, String> entry : problemLog.entrySet()) {
                writer.println(entry.getValue() + "\t" + "|" + "\t" + entry.getKey());
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        LogOrganizer.main(null);
    }
}
