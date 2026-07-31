package linkedlist;

public class AddAtPos {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7, 8, 2, 15, 12};
        Node head = SLLOperations.createLL(arr);
        SLLOperations.printLL(head);
        head = add(40, 0, head);
        SLLOperations.printLL(head);

        // invalid cases
        head = add(20, -1, head);
        SLLOperations.printLL(head);
        head = add(20, 15, head);
        SLLOperations.printLL(head);

        head = add(4, 2, head);
        SLLOperations.printLL(head);
        head = add(20, SLLOperations.lengthLL(head), head);
        SLLOperations.printLL(head);
    }
    public static Node add(int ele, int pos, Node head) {
        Node newNode = new Node(ele);
        if(pos == 0) {
            head = SLLOperations.addFirst(newNode, head);
            return head;
        }

        if(pos > SLLOperations.lengthLL(head) || pos < 0){
            return head;
        }

        Node temp = head;
        for(int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }
}
