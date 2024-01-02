package Medium;

public class String_Compression {
    public int compress(char[] chars) {
        if (chars.length == 1){
            return 1;
        }
        int modify = 0; // pointer that points to the index in chars to be modified.
        for (int i = 0; i < chars.length; i++){
            char curr = chars[i];   // current digit we are looking at
            int repeat = 1;
            // traverse rest of array, see how many time curr repeats
            for (int j = i + 1; j < chars.length && curr == chars[j]; j++){
                repeat++;
                i++;
            }
            // if curr doesn't repeat, save curr in input array and goes to next digit;
            if (repeat == 1){
                chars[modify] = curr;
                modify++;
            } else {
                // if curr repeats, save both curr and number of repeats
                chars[modify] = curr;
                modify++;
                // convert number of repeats into a char array
                char[] repeats = String.valueOf(repeat).toCharArray();
                // write number of repeats to input array
                for (int j = 0; j < repeats.length; j++){
                    chars[modify] = repeats[j];
                    modify++;
                }
            }
        }
        return modify;  // the new length of the array is the number of modifications we made
    }
}
