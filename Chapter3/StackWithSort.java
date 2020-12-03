//Owner: Aditya Kulkarni
//CreatedOn: 3/12/2020

import java.util.Comparator;

public class StackWithSort <T> implements Comparator<T>{
	MyStack<T> mainStack = new MyStack<T>();
	MyStack<T> tempStack = new MyStack<T>();
	
	public void push(T data) {
		mainStack.push(data);
	}
	
	public T pop() {
		return mainStack.pop();
	}
	
	public T peek() {
		return mainStack.peek();
	}
	
	public int compare(T o1, T o2) {
		
		if((int) o1 < (int)o2) {
			return 1;
		}
		else return 0;
	}
	
	public void sort() {
		while(!mainStack.isEmpty()) {
			T data = mainStack.pop();
			while(tempStack.peek() != null && compare(data, tempStack.peek()) ==1 ) {
				mainStack.push(tempStack.pop());
			}
			tempStack.push(data);
		}
		while(!tempStack.isEmpty()) {
			mainStack.push(tempStack.pop());
		}
		
	}
}