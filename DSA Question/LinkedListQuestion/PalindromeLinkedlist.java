class Solution {

    public Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }
         Node prev = head;
         Node curr = head.next;
         while(curr != null){
             Node next = curr.next;
             curr.next = prev;
             prev= curr;
             curr  = next;
         }
         head.next = null;
         head = prev;
         return head;
    }


    
   public Node firstMiddle( Node head)
   {
       Node hare=head;
       Node turtle=head;
       while(hare.next!=null && hare.next.next!=null){
           hare=hare.next.next;
           turtle=turtle.next;
       }
       return turtle;
   }
    
    
    //Main 
    public boolean isPalindrome(Node head) {
        if(head==null && head.next==null){
            return true;
        }
        Node  middle =firstMiddle(head);
        Node secondfirst = reverse(middle.next);
        Node firststart=head;

        while(secondfirst!=null){
            if(firststart.data!=secondfirst.data){
                return false;
            }
            
            firststart=firststart.next;
            secondfirst=secondfirst.next;
            
        }
       return true;
    }
}  