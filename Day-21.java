class Solution {

    int[] Series(int n) {
        // code here
       int marr[]=new int [n+1];
       marr[0]=0;
       marr[1]=1;
       for (int i=2;i<n+1;i++)
       {
           marr[i]=(marr[i-1]+marr[i-2])%1000000007;
       }
       return marr;
        
    }
}
