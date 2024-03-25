
//User function Template for Java

class Solution {
    void solve(String curr, int rem, int n, ArrayList<String> ans) {
        if(curr.length() == n) {
            ans.add(curr);
            return;
        }
        
        solve(curr+"1", rem+1, n, ans);
        
        if(rem > 0) {
            solve(curr+"0", rem-1, n, ans);
        }
    }
    
    ArrayList<String> NBitBinary(int n) {
        ArrayList<String> ans = new ArrayList<String>();
        solve("", 0, n, ans);
        return ans;
    }
}
