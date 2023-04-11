package LinkedList.Linked_List_question;

public class DeleteDup {
    
    Node head;
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }

        Node(int data , Node next){
            this.data = data;
            this.next = next;
        }
    }

    public Node duplicate(Node head){
        Node copy = head;
        if (copy == null) {
            return copy;
        }
        while(copy != null){

            if (copy.next != null && copy.data == copy.next.data) {
                copy.next = copy.next.next;
            }
            else{
                copy = copy.next;
            }
        }
        return head;
    }

    public void add(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void Print(Node head){
        if(head == null){
            return ;
        }

        while(head != null){
            System.out.print(head.data+"-->");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        DeleteDup ll = new DeleteDup();

        ll.add(2);
        ll.add(1);
        
        ll.add(1);


        ll.duplicate(ll.head);
        ll.Print(ll.head);
    }
}
