package utils;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class LogEntry implements Comparable<LogEntry> {
    String dateTime;
    int counter;
    String problemName;

    public LogEntry(String dateTime, int counter, String problemName) {
        this.dateTime = dateTime;
        this.counter = counter;
        this.problemName = problemName;
    }

    @Override
    public int compareTo(LogEntry other) {
        return Integer.compare(other.counter, this.counter); // For descending order
    }

    @Override
    public String toString() {
        return dateTime + "\t" + "|" + "\t" + counter + "\t" + "|" + "\t" + problemName;
    }
}

public class LogOrganizer {

    public static void main(String[] args) {
        String filename = "./log/public/log.txt";
        List<LogEntry> entries = new ArrayList<>();

        try {
            // Read the existing file and parse into LogEntry objects
            Path path = Paths.get(filename);
            List<String> allLines = Files.readAllLines(path);
            for (String line : allLines) {
                String[] parts = line.split("\t\\|\t");
                if (parts.length >= 3) {
                    String dateTime = parts[0].trim();
                    int counter = Integer.parseInt(parts[1].trim());
                    String problemName = parts[2].trim();
                    entries.add(new LogEntry(dateTime, counter, problemName));
                }
            }

            // Sort the entries
            Collections.sort(entries);

            // Write the sorted entries back to the file
            PrintWriter writer = new PrintWriter(new FileWriter(filename));
            for (LogEntry entry : entries) {
                writer.println(entry.toString());
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
