// second largest no.
// import java.util.Arrays;
// class Q1Array{

//     public static int reverse(int arr[]){

//         Arrays.sort(arr);

//         int n = arr.length;

//         for(int i=n-2;i>=0;i--)
//         {
//             if(arr[i] != arr[n-1])
//             {return arr[i];}
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
        
//         int arr[] = {55,4,6,7,99};
//         System.out.println(reverse(arr));
//     }
// }
// TC:O(n logn)

//second largest no. with user input
import java.util.Arrays;
import java.util.Scanner;
class Q1Array{

    public static int reverse(int arr[]){
        Arrays.sort(arr);
        int n = arr.length;

        for(int i=n-2;i>=0;i--)
        {
            if(arr[i] != arr[n-1])
            {return arr[i];}
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter number of elements: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter "+  size + " elements");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        sc.close();
 
        System.out.println("2nd largest number is: " + reverse(arr));
    }
}


//2nd largest no. optimized approach 
// class Q1Array{
//     public static int secondLargestNum(int arr[]){
//         int largest = Integer.MIN_VALUE, secondlargest=Integer.MIN_VALUE;

//         for(int num: arr){
//             if(num > largest){
//                 secondlargest = largest;
//                 largest = num;
//             }
//             else if(num != largest && num > secondlargest ){
//                 secondlargest = num;
//             }
//         }

//         return (secondlargest == Integer.MIN_VALUE ? -1 : secondlargest);
//     }

//     public static void main(String[] args) {
//         int arr[] = {51,5,8,66,7};
//         System.out.println(secondLargestNum(arr));
//     }
// }

//TC: O(n)



//3rd largest no.

// import java.util.Arrays;

// class Q1Array{

//     static int reverse(int arr[]){
//         int n = arr.length;

//         Arrays.sort(arr);

//        for (int i=n-2;i>=0;i--){
//             if(arr[i] != arr[n-1]){
//                 if(arr[i] != arr[n-2])
//                 {return arr[i];}
//             }
//        }
//        return -1;
//     }

//     public static void main(String[] args) {
        
//         int arr[] = {10,55,33,4,7};
//         System.out.println(reverse(arr)); 
//     }

// }