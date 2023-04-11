public class maxLL {
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


    int getMax(Node node){
        if(node == null)
            return - 1 ;

        if (node.next == null) {
            return node.data;
        }
        int max = node.data;
        while(node != null){
            if(max < node.data){
                max = node.data;
            }
            node = node.next;
        }
        return max;
    }


    public static void main(String [] args){
        maxLL ll = new maxLL();

        ll.insert(10);
        ll.insert(20);
        ll.insert(80);
        ll.insert(40);
        ll.insert(50);
        ll.insert(60);

        ll.Print(ll.head);

        System.out.println(ll.getMax(ll.head));
    }

    
}
