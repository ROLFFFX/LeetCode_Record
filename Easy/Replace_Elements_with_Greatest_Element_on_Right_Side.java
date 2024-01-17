package Easy;

public class Replace_Elements_with_Greatest_Element_on_Right_Side {
    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            arr[i] = find(arr, i);
        }
        arr[arr.length - 1] = -1;
        return arr;
    }

    public int find(int[] arr, int i){
        int max = 0;
        for (int j = i + 1; j < arr.length; j++){
            max = Math.max(arr[j], max);
        }
        return max;
    }
}
