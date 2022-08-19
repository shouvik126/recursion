// { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //testcases        
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //input string
            String st = sc.next();
            
            //calling powerSet() function
            ArrayList<String> ans = new LexSort().powerSet(st);
            
            //sorting the result of the powerSet() function
            Collections.sort(ans);
    
            //printing the result
            for(String s: ans)
                System.out.print(s + " ");
            System.out.println();    
        }
    }
}


 // } Driver Code Ends
//User function Template for Java


class LexSort
{
    //Function to return the lexicographically sorted power-set of the string.
    static ArrayList<String> powerSet(String s)
    {
        ArrayList<String> ans = new ArrayList<>();
        subSetStrings(s, "", ans);
        return ans;
    }
    
    static void subSetStrings(String ip, String op, ArrayList<String> ans) {
        
        if (ip.length() == 0) {
            ans.add(op);
            return;
        }
        String op2 = op.concat(ip.charAt(0) + "");
        
        subSetStrings(ip.substring(1), op, ans);
        subSetStrings(ip.substring(1), op2, ans);
    }
}


 // Problem Link: https://practice.geeksforgeeks.org/batch-problems/power-set-using-recursion/1?track=sp-recursion&batchId=105#