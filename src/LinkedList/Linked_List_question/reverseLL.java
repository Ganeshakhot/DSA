public class reverseLL{
    Node head;
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;

        }
    }

    public void insert(int data){
        Node node = new Node(data);

        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;

    }

    public void Print(Node temp){
        if(temp == null){
            return;
        }
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }

    }

    public Node Reverse(Node node){
        Node next = null;
        Node curr = head;
        Node prev = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev=curr;
            curr = next;
        }
        node = prev;
        return node;
    }

    public static void main(String [] args){
        reverseLL ll= new reverseLL();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        ll.insert(60);

        ll.Print(ll.head);

        ll.head = ll.Reverse(ll.head);
        System.out.println("\n -----------------");
        ll.Print(ll.head);



    }

}