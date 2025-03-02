using System;
using System.Linq;

class Program
{
    static int MaxDigitNum(int n)
    {
        // Convert integer to string
        string strNum = n.ToString();
        // Sort in descending order
        string sortedStr = new string(strNum.OrderByDescending(c => c).ToArray());
        // Convert back to integer
        int sortedNum = int.Parse(sortedStr);
        return sortedNum;
    }

    static void Main()
    {
        Console.Write("Enter the number: ");
        int num = int.Parse(Console.ReadLine());
        Console.WriteLine("Maximum digit number is: " + MaxDigitNum(num));
    }
}


//2nd approach
using System;

public class HelloWorld
{
    
    static int maxDigits(int n){
        
        char[] digits = n.ToString().ToCharArray();
        int length = digits.Length;
        
        for(int i=0 ; i<length-1 ;i++){
            
            int maxIndex = i;
            for(int j= i+1; j<length; j++){
                if(digits[j] > digits[maxIndex]){
                    maxIndex = j;
                }
            }
            
            char temp = digits[i];
            digits[i] = digits[maxIndex];
            digits[maxIndex] = temp;
            
        }
        
        int res = int.Parse(new string(digits));
        return res;
        
    }
    
    public static void Main(string[] args)
    {
        Console.WriteLine ("Enter number: ");
        int num = int.Parse(Console.ReadLine());
        Console.WriteLine(maxDigits(num));
    }
}
