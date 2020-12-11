class solve{
    public static long[] nextLargerElement(long[] arr, int n) { 
        // Your code here
        long ans[]=new long[n];
        ans[n-1]=-1;
        Stack<Long> s=new Stack<>();
        s.push(arr[n-1]);
        
        int i=n-2;
        while(i>=0){
         
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            
            if(s.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=s.peek();
            }
            s.push(arr[i]);
            i--;
            
            
        }
        
        return ans;
    } 
}
