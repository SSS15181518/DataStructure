import java.util.Scanner;
public class Secondlargestarrayelement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for(int a = 0; a <5; a++)
        {
            arr[a] = sc.nextInt();
        }
            int max = arr[0];
        for(int a = 0; a < arr.length; a++)
        {
            max = Math.max(max,arr[a]);
        }
            int secMax = Integer.MIN_VALUE;
        for(int a = 0; a < arr.length; a++)
        {
            if(arr[a] != max){
            secMax = Math.max(secMax,arr[a]);
            }
        }
        if(secMax == Integer.MIN_VALUE){
        System.out.println("No Second Max");
        }
        else
        System.out.println(secMax);
        sc.close();
    }
    
}