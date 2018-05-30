package Chap2_LinkedLists;


/**
 * Simple LinkedList
 * @author Tim
 *
 */
public class Node {

	private Node next = null;
	private int data;
	
	public Node(int data) {
		this.data = data;
	}
	
	
	public void appendToTail(int data) {
		Node end = new Node(data);
		Node n = this;
		
		while(n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
	
	public int getData() {
		return data;
	}
	
}
