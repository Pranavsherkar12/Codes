// import java.util.Arrays;
// import java.util.Scanner;
import java.util.*;

public class Q2Array {
    
    static int maxProduct(int arr[]){
        
        int n = arr.length;
        Arrays.sort(arr);
        return Math.max(arr[0]*arr[1]*arr[n-1],
                        arr[n-1]*arr[n-2]*arr[n-3]);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of elements: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter "+ size + " elements: ");
        for(int i=0;i<size;i++){
           arr[i] =  sc.nextInt();
        }
        sc.close();
        int op = maxProduct(arr);
        System.out.println("Max product of 3 is: " + op);

       
    }
}
