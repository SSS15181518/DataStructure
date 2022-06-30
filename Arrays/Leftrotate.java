//Left rotate by d.
import java.util.*;
public class Leftrotate {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60}; int d =3;
//Reverse till d-1 then reverse the other half and then reverse the full array.
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int arr[], int low, int high){
        while(low < high){
            int tmp = arr[low];
            arr[low] = arr[high];
            arr[high] = tmp;
            low++;
            high--;
        }
    }
}
