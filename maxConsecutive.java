import java.util.Scanner;

public class Q3Array {
    
    static int maxConsecutive(int[] arr){
        if(arr.length == 0)  return 0;

        int maxCount = 0, count = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] == arr[i-1]){
                count++;
            }
            else if(arr[i] != 1 || arr[i] != 0)
            {
                System.out.println("Enter the 0s or 1s digit only!");
                break;
            }
            else {
                maxCount = Math.max(maxCount,count);
                count = 1;
            }
            
        }
        return Math.max(maxCount,count);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Max count is: "+maxConsecutive(arr));
        sc.close();

    }

}
