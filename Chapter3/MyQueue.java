
//Owner: Aditya Kulkarni
//CreatedOn: 30/11/2020

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
	
	public void push(T data){
		MyQueue<T> node = new MyQueue<T>(data);
		if(top == null){
			top = node;
			head = node;
		}
		else{
			node.next = top;
			top = node;
		}
	}
	
	public T pop(){
		T data;
		if(head == null){
			return null;
		}
		else{
			data = head.data;
			head = head.next;
		}
		return data;
	}
	
	public T peep(){
		T data;
		if(head == null){
			return null;
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