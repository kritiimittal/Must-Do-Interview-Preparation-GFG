class Solution {
    int height(Node node) {
       
       if(node==null){
           return 0;
       }
       
       if(node.left==null && node.right==null){
           return 1;
       }
       
        int l=height(node.left);
        int r=height(node.right);
        return l>r?l+1:r+1;
       
    }
}
