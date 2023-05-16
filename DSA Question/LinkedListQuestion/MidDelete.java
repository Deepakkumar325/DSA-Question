
class Solution {
    Node deleteMid(Node head) {
        
       if(head == null && head.next == null){
           return null;
       }
        Node fast = head.next.next;
        
        Node slow = head;
        while(fast !=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next; 
        }
        slow.next = slow.next.next;
        
        return head;
        
    }
}