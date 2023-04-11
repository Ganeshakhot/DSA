package LinkedList;

public class LL{
    private Node head;

    class Node{

        private int data;
        private Node next;


        public Node(int data){
            this.data=data;
            this.next = null;
        }
    }

    // ----- add first -----
    public void Insert(int data){
        Node node = new Node(data);
        node.next= head;
        head=node;

        if(head ==null){
            head = node;
            return ;
        }
    }

    //    ---------  Add Last   ---------
    public void addlast(int data){
        Node newnode =new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node cn=head;
        while(cn.next != null){
            cn=cn.next;
        }
        cn.next = newnode;
    }

    //	------- delete first ----------

    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        head = head.next;


    }


    // ------ delete last ------

    public void deletelast(){
        if(head == null){
            System.out.println("ll is empty");
            return;
        }

        if(head.next == null){
            head=null;
            return;
        }
        Node sl=head;
        Node ln=head.next;

        while(ln.next != null){
            ln=ln.next;
            sl=sl.next;
        }
        sl.next=null;
    }

    //  ----- print -----
    public void Print(){

        if(head == null){
            System.out.println("NO data in linked list");
        }
        Node currnode = head;


        while(currnode != null){
            System.out.print(currnode.data+"->");
            currnode=currnode.next;

        }
        System.out.println("null");
    }


    public static void main(String [] args){
        LL ll = new LL();
        ll.Insert(10);
        ll.Insert(20);
        ll.Insert(30);
        ll.addlast(40);
        ll.Print();

        System.out.println("after deletion of first element");
        ll.deleteFirst();
        ll.Print();

        System.out.println("after deletion of last element");
        ll.deletelast();
        ll.Print();

    }
}






