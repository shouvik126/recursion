//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int t=0;t<testCases;t++){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    Arrays.sort(arr);
		    System.out.print("()");
		    ArrayList <ArrayList<Integer>> res = new solve().AllSubsets(arr,n);
		    for (int i = 0; i < res.size (); i++)
		    {
		        System.out.print ("(");
		        for (int j = 0; j < res.get(i).size (); j++)
		        {
		            if (j != res.get(i).size()-1)
		                System.out.print ((res.get(i)).get(j) + " ");
		            else
		                System.out.print ((res.get(i)).get(j));
		        }
		        System.out.print (")");
		      
		    }
		    System.out.println();
		}
	}
}
// } Driver Code Ends

class solve
{
    //Function to find all possible unique subsets.
    public static ArrayList <ArrayList <Integer>> AllSubsets(int arr[], int n)
    {
        ArrayList<Integer> op = new ArrayList<>();
        ArrayList<ArrayList <Integer>> ans = new ArrayList<>();
        uniqueSubset(arr, op, ans);
        ArrayList<ArrayList <Integer>> yo = (ArrayList<ArrayList<Integer>>) ans.stream().distinct().collect(java.util.stream.Collectors.toList());
        Collections.sort(yo, new MyComparator());
        return yo;
    }
    
    static void uniqueSubset(int ip[], ArrayList<Integer> op, ArrayList<ArrayList <Integer>> ans) {
       if (ip.length == 0) {
            if (!op.isEmpty())
                ans.add(op);
            return;
        }
        uniqueSubset(Arrays.copyOfRange(ip, 1, ip.length), op, ans);
        ArrayList<Integer> op2 = new ArrayList<>(op);
        op2.add(ip[0]);
        uniqueSubset(Arrays.copyOfRange(ip, 1, ip.length), op2, ans);
    }
}
class MyComparator implements Comparator<ArrayList <Integer>> {

    @Override
    public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
        String s1 = "";
        for (Integer integer : o1)
            s1 = s1 + integer;
        String s2 = "";
        for (Integer integer : o2)
            s2 = s2 + integer;
        return s1.compareTo(s2);
    }
}

// Problem Link: https://practice.geeksforgeeks.org/problems/subsets-1587115621/1