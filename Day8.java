
//User function Template for Java


class Solution {
    String removeDuplicates(String str) {
HashSet<Character> H=new HashSet<>();
String ans="";
for(int i=0;i<str.length();i++){
    if(H.contains(str.charAt(i)))
    continue;
    ans+=str.charAt(i);
    H.add(str.charAt(i));
}
return ans;

    }
}
