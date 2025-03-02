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
