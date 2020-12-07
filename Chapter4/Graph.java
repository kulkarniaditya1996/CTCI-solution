//Owner: Aditya Kulkarni
//CreatedOn: 7/12/2020

public class Graph <T> {
	private Map<T,List<T>> map = new HashMap<>();
	
	public void addVertex(T data) {
		map.put(data, new LinkedList<T>());
	}
	
	public void addEdge(T source, T dest) {
		if(!map.containsKey(source)) {
			addVertex(source);
		}
		if(!map.containsKey(dest)) {
			addVertex(dest);
		}
		
		map.get(source).add(dest);
	}
	
	public boolean doesRouteExist(T source, T dest) {
		Queue<T> queue = new LinkedList<>();
		LinkedList<T> visited = new LinkedList<>();
		queue.add(source);
		while(!queue.isEmpty()) {
			T temp = queue.remove();
			visited.add(temp);
			for(T n : map.get(temp)) {
				if(!visited.contains(n)) {
					queue.add(n);
				}
				if(n == dest) {
					return true;
				}
			}
		}
		return false;
	}
	
}