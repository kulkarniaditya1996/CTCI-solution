//Owner: Aditya Kulkarni
//CreatedOn: 1/12/2020

class minStack extends MyStack<NodewithMin>{
	public void push(int data) {
		int min = Math.min(mini(), data);
		super.push(new NodewithMin(min, data));
	}
	
	public int min() {
		return super.peek().min;
	}

	private int mini() {
		// TODO Auto-generated method stub
		if(super.isEmpty()) {
			return Integer.MAX_VALUE;
		}
		else {
			return super.peek().min;
		}
	}
}

class NodewithMin {
	int min;
	int data;
	public NodewithMin(int min, int data) {
		// TODO Auto-generated constructor stub
		this.min = min;
		this.data = data;
	}
}

//The above approach is not space efficient as we save data that is min for every node. To make it space efficient we maintain a different stack.
//Below is space efficient approach.

class minStack extends MyStack<Integer> {
	MyStack<Integer> min;
	minStack(){
		min = new MyStack<>();
	}
	public void push(int data) {
		super.push(data);
		if(mini() > data) {
			min.push(data);
		}
	}
	
	public Integer pop() {
		int value = super.pop();
		if(mini() == value) {
			min.pop();
		}
		return value;
	}
	private int mini() {
		// TODO Auto-generated method stub
		if(min.isEmpty()) {
			return Integer.MAX_VALUE;
		}
		else {
			return min.peek();
		}
	}
}