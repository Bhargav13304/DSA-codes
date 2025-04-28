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

    // Add edges
    graph.addUndirectedEdge(0, 1); // A - B
    graph.addUndirectedEdge(0, 2); // A - C
    graph.addUndirectedEdge(1, 3); // B - D
    graph.addUndirectedEdge(2, 3); // C - D
    graph.addUndirectedEdge(3, 4); // D - E

    // Print the graph
    System.out.println("Adjacency Matrix:");
    System.out.println(graph);
  }
}
