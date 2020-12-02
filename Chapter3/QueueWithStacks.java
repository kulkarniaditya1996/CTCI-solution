//Owner: Aditya Kulkarni
//CreatedOn: 2/1/2020

import java.util.NoSuchElementException;

public class QueueWithStacks <T> {
	MyStack<T> mainStack = new MyStack<>();
	MyStack<T> tempStack = new MyStack<>();
	
	public void add(T data) {
		mainStack.push(data);
	}
	
	public T peek() {
		shiftStack();
		return tempStack.peek();
	}
	
	public T remove() {
		shiftStack();
		return tempStack.pop();
	}

	private void shiftStack() {
		// TODO Auto-generated method stub
		if(tempStack.isEmpty()) {
			while(!mainStack.isEmpty()) {
				T data = mainStack.pop();
				tempStack.push(data);
			}
		}
	}
}
