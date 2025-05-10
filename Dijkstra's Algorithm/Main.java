import java.util.*;

public class Main {
  public static void main(String[] args) {
    // Create nodes
    ArrayList<WeightedNode> nodeList = new ArrayList<>();
    nodeList.add(new WeightedNode("A", 0));
    nodeList.add(new WeightedNode("B", 1));
    nodeList.add(new WeightedNode("C", 2));
    nodeList.add(new WeightedNode("D", 3));

    // Create graph
    WeightedGraph graph = new WeightedGraph(nodeList);

    // Add weighted edges
    graph.addWeightedEdge(0, 1, 2); // A -> B (2)
    graph.addWeightedEdge(0, 2, 1); // A -> C (1)
    graph.addWeightedEdge(2, 3, 3); // C -> D (3)
    graph.addWeightedEdge(1, 3, 4); // B -> D (4)

    // Run Dijkstra's algorithm from node A
    System.out.println("Dijkstra's Shortest Paths from Node A:\n");
    graph.dijkstra(nodeList.get(0));
  }
}

