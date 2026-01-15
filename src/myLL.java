public class myLL {
    private class Node {
        public char value;
        public Node next;
        
        public Node(char value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;

    public myLL() {
        head = null;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public boolean contains(char toFind) {
        Node start = head;
        while (start != null) {
            if (start.value == toFind) {
                return true;
            }
            start = start.next;
        }
        return false;
    }

    // remove the first node that has toRemove
    public char remove(char toRemove) {
        Node start = head;
        if (start == null) {
            return '\0';
        }
        if (start.value == toRemove) {

        }
        while (start.next != null) {
            char removed = start.next.value;
            if (removed == toRemove) {
                start.next = start.next.next;
                return removed;
            }
            head = start.next;
        }
        return '\0';
    }

}
