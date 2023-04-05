package Latihan2;

public class LinkQueue {
	public FirstLastList theList;
	
	public LinkQueue() {
		theList = new FirstLastList();
	}
	
	public boolean isEmpty() {
		return theList.isEmpty();
	}
	
	public void enqueue (String j) {
		theList.insertLast(j);
	}
	
	public String dequeue() {
		return theList.deleteFirst();
	}
	
	public void displayQueue() {
		theList.displaylist();
	}
	
	public void PrintHead() {
		theList.displayHead();
	}
	
}
