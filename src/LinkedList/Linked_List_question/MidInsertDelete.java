public class MidInsertDelete {
    Node head;
    int len = 0;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
        Node(int data,Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        len++;
    }

    public void Print(Node temp) {
        if (head == null) {
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
    }

    public Node Middelete() {
        Node temp = head;
        int mid = len / 2;
        if (head == null) {
            return null;
        }
        while (mid-- > 1) {
            head = head.next;
        }
        head.next = head.next.next;
        return temp;
    }

    public void addMid(int data){
        
        int len = this.len;
        int mid = len / 2 ;
        Node temp = head;
        for (int i = 1; i <= mid; i++) {
            temp = temp.next ;
        }
        Node node = new Node(data, temp.next);
        temp.next = node;


    }

    public static void main(String[] args) {
        MidInsertDelete ll = new MidInsertDelete();

        
        ll.add(40);
        ll.add(30);
        ll.add(20);
        ll.add(10);
        

        ll.addMid(25);
        ll.Print(ll.head);
    }

}