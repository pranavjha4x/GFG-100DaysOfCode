class Solution
{
    public void swapElements(int[] arr, int n)
    {
        // Code here
        if(n<2){
            return ;
        }
        for(int i=2;i<n;i++){
            int t=arr[i-2];
            arr[i-2]=arr[i];
            arr[i]=t;
        }
    }
}
