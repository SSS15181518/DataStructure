//Remove duplicate from a sorted array
import java.util.*;
public class Removeduplicate{
public static void main(String[] args) {
    int arr[] = {20,20,20};
    int res = 1;
    for(int i = 1; i < arr.length; i++){
        if(arr[res-1]!=arr[i]){
            arr[res] = arr[i];
            res++;
        }
    }
    System.out.println(Arrays.toString(arr)+" Size of array :"+res);
}
}