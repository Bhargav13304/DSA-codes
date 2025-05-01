import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    // Creating nodes
    ArrayList<GraphNode> nodeList = new ArrayList<>();
    nodeList.add(new GraphNode("A", 0));
    nodeList.add(new GraphNode("B", 1));
    nodeList.add(new GraphNode("C", 2));
    nodeList.add(new GraphNode("D", 3));
    nodeList.add(new GraphNode("E", 4));

    // Creating the graph
    Graph graph = new Graph(nodeList);

    // Adding undirected edges
    graph.addUndirectedEdge(0, 1); // A-B
    graph.addUndirectedEdge(0, 2); // A-C
    graph.addUndirectedEdge(1, 3); // B-D
    graph.addUndirectedEdge(2, 4); // C-E

    System.out.println("Graph:");
    System.out.println(graph.toString());

    System.out.println("BFS traversal:");
    graph.bfs();

    // Resetting visited status for next traversal
    resetVisited(nodeList);

    System.out.println("\nDFS traversal:");
    graph.dfs();

    // Resetting visited status for next traversal
    resetVisited(nodeList);

    System.out.println("\nTopological Sort (Using Directed Edges):");
    Graph directedGraph = new Graph(nodeList);
    directedGraph.addDirectedEdge(0, 1); // A -> B
    directedGraph.addDirectedEdge(0, 2); // A -> C
    directedGraph.addDirectedEdge(1, 3); // B -> D
    directedGraph.addDirectedEdge(2, 4); // C -> E

    directedGraph.topologicalSort();

    // Resetting visited status for SSSP
    resetVisited(nodeList);
    for (GraphNode node : nodeList) {
      node.parent = null;
    }

    System.out.println("\n\nSingle Source Shortest Path (using BFS) from node A:");
    graph.BFSForSSSPP(nodeList.get(0));
  }

  public static void resetVisited(ArrayList<GraphNode> nodeList) {
    for (GraphNode node : nodeList) {
      node.isVisited = false;
    }
  }
}
