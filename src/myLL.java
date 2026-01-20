public class myLL<T> {
    private class Node<E> {
        public E value;
        public Node<E> next;
        public Node<E> previous;
        
        public Node(E value, Node<E> next, Node<E> previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
            if(this.next != null) {
                this.next.previous = this;
            }
            if (this.previous != null) {
                this.previous.next = this;
            }
        }
    }

    private Node<T> head;
    private Node<T> tail;

    public myLL() {
        head = null;
        tail = null;
    }

    public void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public void printBackwards() {
        if (tail == null) return;
        Node<T> current = tail;
        while (current != null) {
            System.out.println(current.value);
            current = current.previous;
        }

    }

    public void addToBack(T toAdd) {
        if (tail != null) {
            Node<T> newNode = new Node<>(toAdd, null, tail);
            tail = newNode;
            if (tail.previous.previous == null) {
                head = tail.previous;
            }
        } else {
            Node<T> newNode = new Node<>(toAdd, null, null);
            head = newNode;
            tail = newNode;
        }
    }

    public boolean contains(T toFind) {
        Node<T> start = head;
        while (start != null) {
            if (start.value.equals(toFind)) {
                return true;
            }
            start = start.next;
        }
        return false;
    }

    // remove the first node that has toRemove
    public T remove(T toRemove) {
        if (head.value.equals(toRemove)) {
            head = head.next;
            head.previous = null;
            return toRemove;
        }
        Node<T> start = head;
        if (start == null) {
            return null;
        }
        while (start.next != null) {
            T removed = start.next.value;
            if (removed.equals( toRemove)) {
                start.next = start.next.next;
                start.next.previous = start.next;
                return removed;
            }
            start.previous = start;
            start = start.next;

        }
        return null;
    }

}
