// Online Java Compiler
// Use this editor to write, compile and run your Java code onlin
import java.util.Arrays;
import java.util.Scanner;
class Main {
    
    public static int thirdlargest(int arr[]){
        Arrays.sort(arr);
        int n = arr.length;
        
        return arr[n-3];
        
    } 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(thirdlargest(arr));
    }
}
