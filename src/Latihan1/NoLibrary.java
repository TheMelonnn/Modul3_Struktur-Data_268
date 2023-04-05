package Latihan1;
//LATIHAN 1 TANPA LIBRARY
public class NoLibrary {
	private int maxSize;
	private String[] stackArray;
	private int top;
	
	public NoLibrary (int a) {
		maxSize = 5;
		stackArray = new String [maxSize];
		top = -1;
	}
	
	public void push (String j) {
		stackArray[++top] = j;
	}
	
	public String pop() {
		return stackArray[top--];
	}
	
	public String peek () {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == maxSize-1);
	}
	
	public int search(Object o){
        if (isEmpty()) {
            System.out.println("Stack empty");
            return -1;
        }
        for (int i = 0; i <= top; i++) {
            if (stackArray[i].equals(o)) {
                return top - i + 1;
            }
        }
        return -1;
    }
	
}
