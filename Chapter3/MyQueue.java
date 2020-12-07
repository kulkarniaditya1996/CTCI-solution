
//Owner: Aditya Kulkarni
//CreatedOn: 30/11/2020

import java.util.NoSuchElementException;

class MyQueue <T> {
	private T data;
	private MyQueue <T> next;
	private MyQueue<T> top;
	private MyQueue<T> head;
	MyQueue (T data){
		this.data = data;
		this.next = null;
	}
	
	MyQueue (){
		this.top = null;
		this.head = null;
	}
	
	public void add(T data){
		MyQueue<T> node = new MyQueue<T>(data);
		if(top == null){
			top = node;
			head = node;
		}
		else{
			top.next = node;
			top = node;
		}
	}
	
	public T remove(){
		T data;
		if(head == null){
			throw new NoSuchElementException();
		}
		else{
			data = head.data;
			head = head.next;
		}
		return data;
	}
	
	public T peek(){
		T data;
		if(head == null){
			throw new NoSuchElementException();
		}
		else{
			data = head.data;
		}
		return data;
	}
	
	public boolean isEmpty(){
		if(head == null) return true;
		else return false;
	}
	
}