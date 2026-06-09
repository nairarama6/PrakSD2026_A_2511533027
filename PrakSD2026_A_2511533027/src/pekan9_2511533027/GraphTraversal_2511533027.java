package pekan9_2511533027;

import java.util.*;

public class GraphTraversal_2511533027 {
	 private Map<String, List<String>> graph_3027 = new HashMap<>();

	    // Menambahkan edge (graf tak berarah)
	    public void addEdge_3027(String node1_3027, String node2_3027) {
	        graph_3027.putIfAbsent(node1_3027, new ArrayList<>());
	        graph_3027.putIfAbsent(node2_3027, new ArrayList<>());
	        graph_3027.get(node1_3027).add(node2_3027);
	        graph_3027.get(node2_3027).add(node1_3027);
	    }

	    // Menampilkan graf awal
	    public void printGraph_3027() {
	        System.out.println("Graf Awal (Adjacency List):");
	        for (String node_3027 : graph_3027.keySet()) {
	            System.out.print(node_3027 + " -> ");
	            List<String> neighbors_3027 = graph_3027.get(node_3027);
	            System.out.println(String.join(", ", neighbors_3027));
	        }
	        System.out.println();
	    }

	    // DFS rekursif
	    public void dfs_3027(String start_3027) {
	        Set<String> visited_3027 = new HashSet<>();
	        System.out.println("Penelusuran DFS:");
	        dfsHelper_3027(start_3027, visited_3027);
	        System.out.println();
	    }

	    private void dfsHelper_3027(String current_3027, Set<String> visited_3027) {
	        if (visited_3027.contains(current_3027)) return;
	        visited_3027.add(current_3027);
	        System.out.print(current_3027 + " ");
	        for (String neighbor_3027 : graph_3027.getOrDefault(current_3027, new ArrayList<>())) {
	            dfsHelper_3027(neighbor_3027, visited_3027);
	        }
	    }
	    
	 // BFS iteratif
		public void bfs_3027(String start_3027) {
		    Set<String> visited_3027 = new HashSet<>();
		    Queue<String> queue_3027 = new LinkedList<>();

		    queue_3027.add(start_3027);
		    visited_3027.add(start_3027);

		    System.out.println("Penelusuran BFS:");
		    while (!queue_3027.isEmpty()) {
		        String current_3027 = queue_3027.poll();
		        System.out.print(current_3027 + " ");

		        for (String neighbor : graph_3027.getOrDefault(current_3027, new ArrayList<>())) {
		            if (!visited_3027.contains(neighbor)) {
		                queue_3027.add(neighbor);
		                visited_3027.add(neighbor);
		            }
		        }
		    }
		    System.out.println();
		}

		// Main
		public static void main(String[] args) {
		    GraphTraversal_2511533027 graph_3027 = new GraphTraversal_2511533027();

		    // Contoh graf: A-B, A-C, B-D, B-E
		    graph_3027.addEdge_3027("A", "B");
		    graph_3027.addEdge_3027("A", "C");
		    graph_3027.addEdge_3027("B", "D");
		    graph_3027.addEdge_3027("B", "E");

		    // Cetak graf awal
		    System.out.println("Graf Awal adalah: ");
		    graph_3027.printGraph_3027();

		    // Lakukan penelusuran
		    graph_3027.dfs_3027("A");
		    graph_3027.bfs_3027("A");
		}

	}

