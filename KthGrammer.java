class Solution {
    public int kthGrammar(int n, int k) {
        if (n == 1 && k == 1)
            return 0;
        double mid = Math.pow(2, n - 1) / 2;
        if (k <= mid)
            return kthGrammar(n - 1, k);
        else
            return kthGrammar(n - 1, k - (int)mid) == 0 ? 1 : 0;
    }
}
// Problem Link: https://leetcode.com/problems/k-th-symbol-in-grammar/