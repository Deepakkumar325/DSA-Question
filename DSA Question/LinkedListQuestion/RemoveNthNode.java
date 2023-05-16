class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class  RemoveNthNode {
    static Node insertBeginning(Node head, int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;

        return head;
    }

    static Node addAtEnd(Node head, int data) {
        Node temp = head;
        Node newNode = new Node(data);

        // Checks if the list is empty
        if (head == null) {
            // If list is empty, both head will point to new node
            head = newNode;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }

   

    public static Node removeNthFromEnd(Node head, int n) {
        if (head.next == null) {
            return null;
        }
        int size = 0;
        Node curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }
        if (n == size) {
            return head.next;
        }

        int index = size - n;
        int i = 1;
        Node prev = head;
        while (i < index) {
            prev = prev.next;
            i++;

        }
        prev.next = prev.next.next;
        return head;
    }

    public static void Display(Node head) {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertBeginning(head, 2);
        head = insertBeginning(head, 1);
        head = addAtEnd(head, 3);
        head = addAtEnd(head, 4);
        removeNthFromEnd(head,2);
        Display(head);
    }
}
