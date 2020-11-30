//Owner: Aditya Kulkarni
//CreatedOn: 30/11/2020

class MyStack <T> {
	private T data;
	private MyStack <T> next;
	private MyStack<T> top;
	MyStack (T data){
		this.data = data;
	}
	
	MyStack (){
		this.top = null;
	}
	
	public void push(T data){
		MyStack<T> node = new MyStack<T>(data);
		if(top == null){
			top = node;
		}
		else{
			node.next = top;
			top = node;
		}
	}
	
	public T pop(){
		T data;
		if(top == null){
			return null;
		}
		else{
			data = top.data;
			top = top.next;
		}
		return data;
	}
	
	public T peep(){
		T data;
		if(top == null){
			return null;
		}
		else{
			data = top.data;
		}
		return data;
	}
	
	public boolean isEmpty(){
		if(top == null) return true;
		else return false;
	}
	
}