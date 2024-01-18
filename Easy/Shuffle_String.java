package Easy;

public class Shuffle_String
{
    public String restoreString(String s, int[] indices) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < indices.length; i++){
            arr[indices[i]] = s.charAt(i);
        }
        String ans = new String(arr);
        return ans;
    }
}
