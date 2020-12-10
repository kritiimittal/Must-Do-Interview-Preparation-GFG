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
    	while(i<2){
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
