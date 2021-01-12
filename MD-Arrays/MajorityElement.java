class Majority
{
    static int majorityElement(int arr[], int size)
    {
        // your code here
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<size;i++){
            if(map.containsKey(arr[i])){
                int val=map.get(arr[i])+1;
                map.put(arr[i],val);
            }else{
                map.put(arr[i],1);
            }
        }
        
        
        int max=-1;
        for(int i=0;i<size;i++){
            if(map.get(arr[i])>size/2){
                max=arr[i];
            }
            
        }
        
        return max;
        
        
        
    }
}
