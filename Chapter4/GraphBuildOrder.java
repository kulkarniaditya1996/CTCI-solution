//Owner: Aditya Kulkarni
//CreatedOn: 7/12/2020

public class GraphBuildOrder <T> {
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
	
	public List<T> topSort() { 
		  List<T> visited = new LinkedList<>();
		  Stack<T> stack = new Stack<>();
		  for(T node : getAllVertex()) {
			  if(!visited.contains(node)) {
				  topSortUtil(node,visited,stack);
			  }
		  }
		  List<T> list = new LinkedList<>();
		  while (stack.empty() == false) 
	            list.add(stack.pop()); 
		  return list;
	}
	 
	private void topSortUtil(T node, List<T> visited, Stack<T> stack) {
		// TODO Auto-generated method stub
		if(node == null) return;
		visited.add(node);
		for(T n: map.get(node)) {
			if(!visited.contains(n)) {
				topSortUtil(n, visited, stack);
			}
		}
		stack.add(node);
	}

	private List<T> getAllVertex() {
		 List<T> list = new LinkedList<T>(map.keySet());
		 return list;
	}
	
}