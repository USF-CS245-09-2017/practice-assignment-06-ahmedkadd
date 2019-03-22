
public class ArrayQueue<T> implements Queue<T> {
	private final int SIZE = 10;
	private T[] array;
	private int top;
	
	public ArrayQueue() {
		array = (T[]) new Object[SIZE];
		top = -1;
	}
 	
	public T dequeue() {
		if (top < 0) {
			throw new ArrayIndexOutOfBoundsException();
		} 
		
		try {
			return array[0];
		} finally {
			for (int i = 1; i <= top; i++) {
				array[i - 1] = array[i];
			}
			top--;
		}
	}
	
	public void enqueue(T item) {
		if (top >= array.length - 1) {
			T[] newArray = (T[]) new Object[array.length * 2]; 
			System.arraycopy(array, 0, newArray, 0, array.length);
			array = newArray;
		}
		array[++top] = item;
	}
	
	public boolean empty() {
		return top < 0;
	}
}
