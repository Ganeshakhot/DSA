/* Sort a ll using Bubble sort 
 * 
*/

public class SortLL {
    Node head;
    static int length;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void Sortt(Node node){
        if (node == null) {
            return ;
        }
        
        while (node != null) {
            Node cr = node;
            while(cr != null){
                if (node.data > cr.data) {
                    int temp = node.data;
                    node.data = cr.data;
                    cr.data = temp;
                }
                cr = cr.next;
            }   
            node = node.next; 
        }
    }
    public void Print() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            length++;
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void Sort() {
        Node crNode = head;
        Node temp;

        while (crNode != null) {
            temp = crNode;

            while (temp != null) {
                if (temp.data < crNode.data) {
                    int tp = temp.data;
                    temp.data = crNode.data;
                    crNode.data = tp;
                }
                temp = temp.next;
            }
            crNode = crNode.next;
        }
    }

   

    public static void main(String[] args) {

        SortLL ll = new SortLL();

        ll.add(5);
        ll.add(4);
        ll.add(3);
        ll.add(2);
        ll.add(1);
        ll.add(8);

        ll.Print();
        System.out.println("\n");

        ll.Sortt(ll.head);
        ll.Print();

       
    }
}
