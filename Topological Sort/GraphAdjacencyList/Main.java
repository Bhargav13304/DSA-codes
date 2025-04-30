import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    // Create nodes
    ArrayList<GraphNode> nodeList = new ArrayList<>();
    nodeList.add(new GraphNode("A", 0));
    nodeList.add(new GraphNode("B", 1));
    nodeList.add(new GraphNode("C", 2));
    nodeList.add(new GraphNode("D", 3));
    nodeList.add(new GraphNode("E", 4));

    // Create graph
    Graph graph = new Graph(nodeList);

    // Add undirected edges
    graph.addUndirectedEdge(0, 1); // A-B
    graph.addUndirectedEdge(0, 2); // A-C
    graph.addUndirectedEdge(1, 3); // B-D
    graph.addUndirectedEdge(2, 4); // C-E

    System.out.println("Undirected Graph:");
    System.out.println(graph);

    System.out.print("BFS Traversal: ");
    graph.bfs();
    System.out.println();

    // Reset visit state
    for (GraphNode node : nodeList) {
      node.isVisited = false;
    }

    System.out.print("DFS Traversal: ");
    graph.dfs();
    System.out.println();

    // Reset visit state
    for (GraphNode node : nodeList) {
      node.isVisited = false;
      node.neighbors.clear(); // Clear previous undirected edges
    }

    // Add directed edges for Topological Sort
    graph.addDirectedEdge(0, 2); // A -> C
    graph.addDirectedEdge(0, 3); // A -> D
    graph.addDirectedEdge(1, 3); // B -> D
    graph.addDirectedEdge(2, 4); // C -> E
    graph.addDirectedEdge(3, 4); // D -> E

    System.out.println("\nDirected Graph for Topological Sort:");
    System.out.println(graph);

    System.out.print("Topological Sort: ");
    graph.topologicalSort();
  }
}
