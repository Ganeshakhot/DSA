
public class Practice {
    static Node head;
    

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        Node(int data , Node next){
            this.data = data;
            this.next = next;
        }
    }

    public void add(int data){
        Node node = new Node(data);

        if (head == null) {
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    } 
    
    public void Print(Node head){
        if(head == null){
            return;
        }
        
        while (head != null) {
            System.out.print(head.data +"-->");
            head = head.next;
        }
    }

    public void deleteDup(Node head){
        Node temp = head;

        while (temp != null) {
            if (temp.next != null &&temp.data == temp.next.data) {
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
    }

   public static void main(String[] args) {
       

        Practice ll = new Practice();

        

        ll.deleteDup(head);
        ll.Print(head);
   }

}
