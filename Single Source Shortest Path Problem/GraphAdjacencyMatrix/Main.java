import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // Create node list
    ArrayList<GraphNode> nodeList = new ArrayList<>();
    nodeList.add(new GraphNode("A", 0));
    nodeList.add(new GraphNode("B", 1));
    nodeList.add(new GraphNode("C", 2));
    nodeList.add(new GraphNode("D", 3));
    nodeList.add(new GraphNode("E", 4));

    // Create Graph
    Graph graph = new Graph(nodeList);

    // Add Undirected Edges
    graph.addUndirectedEdge(0, 1); // A-B
    graph.addUndirectedEdge(0, 2); // A-C
    graph.addUndirectedEdge(1, 3); // B-D
    graph.addUndirectedEdge(2, 4); // C-E
    graph.addUndirectedEdge(3, 4); // D-E

    // Print Adjacency Matrix
    System.out.println("Graph:\n" + graph);

    // Run BFS
    System.out.print("BFS traversal: ");
    graph.bfs();
    System.out.println();

    // Reset visited flags
    for (GraphNode node : nodeList) {
      node.isVisited = false;
    }

    // Run DFS
    System.out.print("DFS traversal: ");
    graph.dfs();
    System.out.println();

    // Reset visited flags
    for (GraphNode node : nodeList) {
      node.isVisited = false;
    }

    // Print Single Source Shortest Path using BFS
    System.out.println("BFS for Single Source Shortest Path (SSSP) starting from A:");
    graph.BFSForSSSPP(nodeList.get(0));

    // Reset visited and parent for Topological Sort
    for (GraphNode node : nodeList) {
      node.isVisited = false;
      node.parent = null;
    }

    // Create a new directed graph for Topological Sort
    Graph directedGraph = new Graph(nodeList);
    directedGraph.addDirectedEdge(0, 2); // A -> C
    directedGraph.addDirectedEdge(2, 3); // C -> D
    directedGraph.addDirectedEdge(3, 4); // D -> E
    directedGraph.addDirectedEdge(1, 2); // B -> C

    // Topological Sort
    System.out.print("Topological Sort (for Directed Graph): ");
    directedGraph.topologicalSort();
    System.out.println();
  }
}

