public class Practice {
    public static void main(String[] args) {
        /*
        Node head = new Node('g', null);
        Node ryan = new Node('s', null);
        head.next = ryan;
        ryan.next = new Node('t', null);
        ryan.next.next = new Node('x', null);

        printList(head);
        System.out.println(contains(head,'x'));
        System.out.println(remove(head, 't'));
        printList(head);
        
        myLL<Character> list = new myLL<>();
        list.addToBack('x');
        list.addToBack('m');
        list.addToBack('v');
        list.addToBack('q');
        list.printList();
        */
        myLL<Integer> intList = new myLL<>();
        intList.addToBack(5);
        intList.addToBack(10);
        intList.addToBack(25);
        intList.addToBack(400);

        //intList.printList();
        intList.printBackwards();
    }
}
