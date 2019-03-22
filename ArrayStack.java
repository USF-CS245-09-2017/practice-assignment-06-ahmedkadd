
public class ArrayStack<T> implements Stack<T> {
	private final int SIZE = 10;
	private T[] array;
	private int top;
	
	public ArrayStack() {
		array = (T[]) new Object[SIZE];
		top = -1;
	}
	
	public void push(T item) {
		if (top >= array.length - 1) {
			T[] newArray = (T[]) new Object[array.length * 2]; 
			System.arraycopy(array, 0, newArray, 0, array.length);
			array = newArray;
		}
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
