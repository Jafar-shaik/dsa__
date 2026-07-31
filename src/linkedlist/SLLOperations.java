package linkedlist;

public class SLLOperations {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 5, 3, 7, 8, 2, 15, 192};
        Node head = createLL(arr);
        printLL(head);
        head = addFirst(new Node(44), head);
        printLL(head);
        head = addLast(new Node(44), head);
        printLL(head);
        System.out.println("Printing reverse");
        reversePrint(head);
    }

    public static Node createLL(int[] arr) {
        System.out.println("Creating SLL");
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    public static void printLL(Node head){
        while(head != null) {
            System.out.print(head.data + " -> ");

            head = head.next;
        }System.out.println();
    }

    public static int lengthLL(Node head) {
        int len = 0;
        while(head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    public static Node addFirst(Node node, Node head) {
        System.out.println("Adding Node at first Node");
        node.next = head;
        return node;
    }

    public static Node addLast(Node node, Node head) {
        System.out.println("Adding Node at last Node");
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        return head;
    }

    public static void reversePrint(Node head) {
        if(head == null) {
            return;
        }

        reversePrint(head.next);
        System.out.print(head.data + " ->");
    }

}
