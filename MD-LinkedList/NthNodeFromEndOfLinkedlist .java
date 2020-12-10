class GfG
{
    // Function to find the nth node from end in the linked list
    // head: head of the linked list
    // n: nth node from end to find
    int getNthFromLast(Node head, int n)
    {
    	
    	Node fast=head;
    	Node slow=head;
    	
    	int i=0;
    	Node temp=head;
    	int len=0;
    	while(temp!=null){
    	    temp=temp.next;
    	    len++;
    	}
    	
    	if(len<n){
    	    return -1;
    	}
    	
    	while(i<n){
    	    fast=fast.next;
    	    i++;
    	}
    	
    	while(fast!=null){
    	    slow=slow.next;
    	    fast=fast.next;
    	}
    	
    	
    	return slow.data;
    	
    }
}
