public class Practice {
    public static void main(String[] args) {
        Node head = new Node('g', null);
        Node ryan = new Node('s', null);
        head.next = ryan;
        ryan.next = new Node('t', null);
        ryan.next.next = new Node('x', null);

        printList(head);
    }

    public static void printList(Node current) {
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
}
