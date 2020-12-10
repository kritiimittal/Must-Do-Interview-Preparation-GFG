class Palindrome
{
    // Function to check if linked list is palindrome
    boolean isPalindrome(Node head) 
    {
        
        if(head==null || head.next==null){
            return true;
        }
        Stack<Node> s=new Stack<>();
        Node temp=head;
        while(temp!=null){
            s.push(temp);
            temp=temp.next;
            
        }
        
        temp=head;
        while(temp!=null){
           Node t=s.pop();
           if(t.data!=temp.data){
               return false;
           }
           temp=temp.next;
            
        }
        
        return true;
        
        
        
    }    
}

