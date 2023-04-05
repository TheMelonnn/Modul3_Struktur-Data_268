package Latihan2;

public class FirstLastList {
	public Link first;
	public Link last;

	public FirstLastList() {
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertLast(String j) {
		Link newLink = new Link(j);

		if (isEmpty()) {
			first = newLink;
		} else {
			last.next = newLink;
		}
		last = newLink;
	}

	public String deleteFirst() {
		String temp = (String) first.Data;

		if (first.next == null) {
			last = null;
		}
		first = first.next;
		return temp;
	}

	public void displaylist() {
		Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}

		System.out.println("");
	}

	public void displayHead() {
		Link current = first;
		current.displayLink();
	}
}
