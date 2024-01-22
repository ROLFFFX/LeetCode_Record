package Easy;

public class Flipping_an_Image {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] arr : image){
            for (int i = 0; i < arr.length; i++){
                if (arr[i] == 1) arr[i] = 0;
                else arr[i] = 1;
            }
            int i = 0;
            int j = arr.length - 1;
            while (i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return image;
    }
}
