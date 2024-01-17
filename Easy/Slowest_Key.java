package Easy;

public class Slowest_Key {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int maxDuration = releaseTimes[0]; // The duration for the first key
        char slowestKey = keysPressed.charAt(0);

        for (int i = 1; i < releaseTimes.length; i++) {
            int currentDuration = releaseTimes[i] - releaseTimes[i - 1];

            // Compare both duration and lexicographical order
            if (currentDuration > maxDuration ||
                    (currentDuration == maxDuration && keysPressed.charAt(i) > slowestKey)) {
                maxDuration = currentDuration;
                slowestKey = keysPressed.charAt(i);
            }
        }

        return slowestKey;
    }
}
