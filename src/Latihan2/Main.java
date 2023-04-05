package Latihan2;


public class Main {
public static void main(String[] args) {
	LinkQueue queue = new LinkQueue();
	
	queue.enqueue("Java");
	queue.enqueue("DotNet");
	queue.enqueue("PHP");
	queue.enqueue("HTML");
	
	System.out.println("remove: "+ queue.dequeue());
	System.out.print("Element : ");
	queue.PrintHead();
	System.out.println("\nPool : "+ queue.dequeue());
	System.out.print("Peek : " );
	queue.PrintHead();
	
}
}
