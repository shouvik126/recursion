//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();//total testcases
        while (T-- > 0) {
            Hanoi obj = new Hanoi();
            int N;
            
            //taking input N
            N = sc.nextInt();

            //calling toh() method 
            System.out.println(obj.toh(N, 1, 3, 2));
        }
    }
}






// } Driver Code Ends


// User function Template for Java


// avoid space at the starting of the string in "move disk....."
class Hanoi {
    class Store {
        int n;
    }

    public long toh(int N, int from, int to, int aux) {
        Store obj = new Store();
        obj.n = 0;
        towerOfHanoi(N, from, to, aux, obj);
        return obj.n;
    }
    public void towerOfHanoi(int N, int from, int to, int aux, Store steps) {
        steps.n++;
        if (N == 1) {
            System.out.println("move disk " + N + " from rod " + from +" to rod " + to);
            return;
        }
        
        towerOfHanoi(N - 1, from, aux, to, steps);
        System.out.println("move disk " + N + " from rod " + from +" to rod " + to);
        towerOfHanoi(N - 1, aux, to, from, steps);
    }
}
