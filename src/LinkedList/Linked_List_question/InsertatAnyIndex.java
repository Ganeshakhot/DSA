package LinkedList.Linked_List_question;
public class InsertatAnyIndex{
	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		
		Node(int data,Node next){
			this.data = data;
			this.next = next;
			
		}
	}
	
	public void add(int data){
		Node node = new Node(data,null);
		if(head == null){
			head = node;
			return;
		}
		node.next = head;
		head = node;
	}
	
	public void addLast(int data){
		Node node = new Node(data,null);
		if(head == null){
			head = node;
			return;
		}
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = node;
	}
	
	public void Print(){
		Node temp = head;
		
		while(temp != null){
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}
		
	}
	public int getLength(){
		Node temp = head;
		int len = 0;
		while(temp != null){
			len++;
			temp = temp.next;
		}
		return len;
	}
	
    public int get(int n){
		Node temp = head;
		for(int i = 1 ; i < n ; i++){
			temp = temp.next;
		}
		return temp.data;
	} 
	
	public void Insertat(int index , int data){
		if(index == 0){
			add(data);
			return;
		}
		if(index == getLength()){
			addLast(data);
			return;
		}
		
		Node temp = head;
		for(int i = 1 ; i < index ; i++){
			temp = temp.next;
		}
		Node node = new Node(data,temp.next);
		temp.next = node;
	}
	
	public void deleteLast(){
		if(head == null){
			return;
		}
	
		Node sl = head;
		Node ls = head.next;
		while(ls.next != null){
			sl = sl.next;
			ls = ls.next;
		}
		sl.next = null; 
	}
	
	public static void main(String [] args){
		InsertatAnyIndex ll = new InsertatAnyIndex();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.addLast(40);
		ll.addLast(40);
		ll.addLast(40);
		
		ll.getLength();
		
		ll.get(3);
		
		
		
		
		
		
	}
}