public class insertUsingRec {
    

    //---------- Insert at any Index using recursion --------;


    public void inSert(int data , int index){
        head = inSert(data, index, head);
    }

    public Node inSert(int data , int Position , Node node){
        if(Position == 0){
            Node temp = new Node(data, node);
            return temp;
        }
        node.next = inSert(data, Position - 1 , node.next);
        return node;
    }


    public static void main(String[] args) {
        insertUsingRec ll = new insertUsingRec();

        ll.add(50);
        ll.add(40);
        ll.add(30);
        ll.add(20);
        ll.add(10);
        ll.add(5);

        ll.inSert(80, 4);
        ll.Print(ll.head);
    }

    public void Print(Node head){

        if(head == null){
            return;
        }

        while (head != null) {
            System.out.print(head.data+"-->");
            head = head.next;
        }
    }
    
    
    Node head;
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
        Node (int data , Node next){
            this.data = data;
            this.next = next;
        }   
    }

    public void add(int data){
        Node node = new Node(data);
        if(head  == null){
            head  = node;
            return;
        }
        node.next = head;
        head = node;
    }


}
