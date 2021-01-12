class Solution {
    int MissingNumber(int arr[], int n) {
        // Your Code Here
        int sum=0;
        int actual=(n*(n+1))/2;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        
        return actual-sum;
        
    }    
        
}
