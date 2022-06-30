import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 6, 2};
        int low = 0;
        int high = arr.length - 1;
        while(low < high){
            int tmp = arr[low];
            arr[low] = arr[high];
            arr[high] = tmp;
            low++;
            high--;
        }
        System.out.println("Reversed array:"+Arrays.toString(arr));
    }
}
