import java.util.*;
public class RemoveZeros {
    public static void main(String[] args) {
        int arr[] = {10,20,0,0,30,0,40,50};
        int count = 0;
        for(int a = 0; a < arr.length; a++){
            if(arr[a] != 0){
                swap(arr, a, count);
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int arr[], int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
