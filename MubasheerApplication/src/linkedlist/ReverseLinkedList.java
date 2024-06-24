package linkedlist;

public class ReverseLinkedList {
	
	public static void main(String[] args) {
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
		
		System.out.println("Original Linked List: ");
		printLinkedList(head);
		
		head=reverseLinkedList(head);
		System.out.println("Reversed Linked List: ");
		printLinkedList(head);
	}

	private static Node reverseLinkedList(Node head) {
		Node prev=null;
		Node current=head;
		Node nextNode=null;
		while(current!=null) {
			nextNode=current.next;
			current.next=prev;
			prev=current;
			current=nextNode;
			
		}
		return prev;
	}

	private static void printLinkedList(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
		
	}

}
