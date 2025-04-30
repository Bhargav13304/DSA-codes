import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // Step 1: Create the nodes
    ArrayList<GraphNode> nodeList = new ArrayList<>();
    nodeList.add(new GraphNode("A", 0));
    nodeList.add(new GraphNode("B", 1));
    nodeList.add(new GraphNode("C", 2));
    nodeList.add(new GraphNode("D", 3));
    nodeList.add(new GraphNode("E", 4));

    // Step 2: Create the graph and pass the node list
    Graph graph = new Graph(nodeList);

    // Step 3: Add directed edges as per topological graph structure
    graph.addDirectedEdge(0, 2); // A -> C
    graph.addDirectedEdge(0, 3); // A -> D
    graph.addDirectedEdge(1, 3); // B -> D
    graph.addDirectedEdge(2, 4); // C -> E
    graph.addDirectedEdge(3, 4); // D -> E

    // Step 4: Print the adjacency matrix representation
    System.out.println("Adjacency Matrix:");
    System.out.println(graph);

    // Step 5: Perform Topological Sort
    System.out.println("Topological Sort:");
    graph.topologicalSort();
  }
}
