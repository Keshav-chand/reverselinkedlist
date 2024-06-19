class reverselinkedlist {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;

        while (current != null) {
            next = current.next;    // Store reference to next node
            current.next = prev;    // Reverse current node's pointer to previous node
            prev = current;         // Move prev to current node
            current = next;         // Move current to next node
        }
        
        node = prev;    // Previous node is now the head of reversed list
        return node;
    }

    void printlist(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");    // Print node data
            node = node.next;    // Move to next node
        }
        System.out.println();    // Print a new line after printing all nodes
    }

    public static void main(String[] args) {
        reverselinkedlist list = new reverselinkedlist();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        System.out.println("Given list:");
        list.printlist(head);

        head = list.reverse(head);

        System.out.println("\nReversed linked list:");
        list.printlist(head);
    }
}
