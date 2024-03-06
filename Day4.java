

//User function Template for Java

class Solution
{
    
    ArrayList<Integer> search(String pattern, String text)
    {
        // your code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<=text.length()-pattern.length(); i++){
            String a = text.substring(i,i+pattern.length());
            if(a.equals(pattern)){
                ans.add(i+1);
            }
        }
        return ans;
    }
}
