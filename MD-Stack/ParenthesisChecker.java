class Parenthesis
{
    // Function to return if the paranthesis are balanced or not
    static boolean ispar(String x)
    {
        
        if(x.length()==0){
            return true;
        }
        
        Stack<Character> s=new Stack<>();
        int i=0;
        while(i<x.length()){
            char c=x.charAt(i);
            if(c=='{'||c=='['||c=='('){
                s.push(c);
            }
            
            if(c==']'||c=='}'||c==')'){
                
            if(s.isEmpty()){
                return false;
            }    
            
            if(c==']' && s.peek()=='['){
                s.pop();
            }else if(c=='}' && s.peek()=='{'){
                s.pop();
            }else if(c==')' && s.peek()=='('){
                s.pop();
            }else{
                return false;
                
            }
            
            i++;
        }
        
        return s.isEmpty();
    }
    
}
