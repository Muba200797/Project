package linkedlist;

public class LinkedListHasACycleTest {

	public static void main(String[] args) {
		Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next =head.next;
        
        System.out.println("Does this LL has a cycle: "+hasCycle(head));

	}

	public static boolean hasCycle(Node head) {
		
		if(head==null || head.next==null) {
			return false;
		}
		
		Node slow=head;
		Node fast=head.next;
		
		while(fast!=null && fast.next!=null) {
			if(slow==fast) {
				return true;
			}
			slow=slow.next;
			fast=fast.next.next;
		}
		return false;
		
	}
		
		

	

	

}
