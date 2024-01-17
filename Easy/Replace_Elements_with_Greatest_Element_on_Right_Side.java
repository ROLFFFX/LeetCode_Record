package Easy;

public class Replace_Elements_with_Greatest_Element_on_Right_Side {
    public int[] replaceElements_optimized(int[] arr) {
        int max = -1;
        for (int i = arr.length-1; i >= 0; i--){
            if (arr[i] > max){
                int temp = max;
                max = arr[i];
                arr[i] = temp;
            } else {
                arr[i] = max;
            }
        }
        return arr;
    }
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
