class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}
class RemoveDuplicate {
        static Node insertBeginning(Node head, int data)
        {
            Node newNode = new Node(data);
    
            newNode.next = head;
            head = newNode;
    
            return head;
        }
            static Node addAtEnd(Node head, int data) {
                Node temp=head;
                Node newNode = new Node(data);
    
                //Checks if the list is empty
                if (head == null) {
                    //If list is empty, both head will point to new node
                    head = newNode;
                }
                else {
                    while(temp.next!=null)
                    {
                        temp=temp.next;
                    }
                    temp.next=newNode;
                }
                return head;
            }
            
             
            public static Node deleteDuplicates(Node head) {
            
                Node cur = head;
            
                if(head == null || head.next == null ){
                          return head;
                }
                while(cur!=null && cur.next!=null){
                    if(cur.data == cur.next.data){
                        cur.next = cur.next.next;
                    }
                    else{
                       cur = cur.next;
                    }
                }
                return head;
                    
                }

            public static void Display(Node head){
                 
                Node temp = head;
                while(temp!=null){
                    System.out.print(temp.data+" -> ");
                    temp = temp.next;
                }    
                System.out.println("null");
            }    
             
            
            public static void main(String[] args) {
            Node head = null;    
            head = insertBeginning(head,2);
            head = insertBeginning(head,1);
            head = addAtEnd(head,3);
            head = addAtEnd(head,4);
            head = addAtEnd(head,4);
            head = addAtEnd(head,5);

            deleteDuplicates(head);
            Display(head);
        }    
    }    
    
