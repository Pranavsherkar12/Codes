// Online C# Editor for free
// Write, Edit and Run your C# code using C# Online Compiler

using System;

public class HelloWorld
{
    static string maxStringSize(string[] str){
        
        if(str.Length == 0) return null;
        
        string maxString = str[0];
        
        foreach(string s in str){
            if(s.Length > maxString.Length){
                maxString = s;
            }
        }
        return maxString;
    }
    
    public static void Main(string[] args)
    {
        // string[] str = {"Alice","Bob","Charlie","David"};
        // string sizeStr = maxStringSize(str);
        // Console.WriteLine ("String with max size is: "+sizeStr);
        Console.WriteLine("Enter the number of strings:");
        int n = int.Parse(Console.ReadLine());

        string[] str = new string[n];

        Console.WriteLine("Enter the strings:");
        for (int i = 0; i < n; i++)
        {
            str[i] = Console.ReadLine();
        }

        string sizeStr = maxStringSize(str);
        Console.WriteLine("String with max size is: " + sizeStr);
    }
}
