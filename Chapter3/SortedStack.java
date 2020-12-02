//Owner: Aditya Kulkarni
//CreatedOn: 2/1/2020

import java.util.Comparator;

public class SortedStack <T> implements Comparator<T>{
	MyStack<T> mainStack = new MyStack<T>();
	MyStack<T> tempStack = new MyStack<T>();
	
	public void push(T data) {
		while(mainStack.peek() != null && compare(mainStack.peek(), data) == 1) {
			T temp  = mainStack.pop();
			tempStack.push(temp);
		}
		mainStack.push(data);
		while(!tempStack.isEmpty()) {
			T temp  = tempStack.pop();
			mainStack.push(temp);
		}
	}
	
	public T pop() {
		return mainStack.pop();
	}
	
	public T peek() {
		return mainStack.peek();
	}
	
	public boolean isEmpty() {
		return mainStack.isEmpty();
	}

	@Override
	public int compare(T o1, T o2) {
		
		if((int) o1 < (int)o2) {
			return 1;
		}
		return 0;
	}
	
}
