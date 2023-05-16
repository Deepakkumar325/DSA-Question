class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class Detectloop {
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

    public static boolean detectLoop(Node head) {
        // Add code here
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
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
        head = addAtEnd(head, 3);
        Display(head);
        System.out.println(detectLoop(head)); // loop will be detected 
    }
}
