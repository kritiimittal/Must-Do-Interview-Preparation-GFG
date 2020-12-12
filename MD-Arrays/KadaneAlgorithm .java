class Kadane{
    
    // Function to find subarray with maximum sum
    // arr: input array
    // n: size of array
    int maxSubarraySum(int arr[], int n){
        
        int sum=0;
        int maxi=arr[0];
        for(int i=0;i<arr.length;i++){
            
            sum+=arr[i];
            if(sum>maxi){
                maxi=sum;
            }
            
            if(sum<0){
                sum=0;
            }
            
            
        }
        return maxi;
        
    }
    
}

