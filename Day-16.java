

//User function Template for Java

/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution
{

    static ArrayList <Integer> levelOrder(Node root) 
    {
        Queue<Node> q = new LinkedList<>() ;
        ArrayList<Integer> ans = new ArrayList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            Node val = q.poll();
            ans.add(val.data);
            if(val.left!=null){
                q.add(val.left);
            }
            if(val.right!=null){
                q.add(val.right);
            }
        }
        return ans;
    }
}

