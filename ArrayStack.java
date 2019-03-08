
public class ArrayStack<T> implements Stack<T> {
	private final int SIZE = 10;
	private T[] array;
	private int top;
	
	
	public ArrayStack() {
		array = (T[]) new Object[SIZE];
		top = -1;
	}
	
	public void push(T item) {
		array[++top] = item;
		
	}
	
	public T pop() {
		if (top < 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			return array[top--];
		}
		
	}
	
	public T peek() {
		if (top < 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			return array[top];
		}
	}
	
	public boolean empty() {
		return top < 0;
	}
}
