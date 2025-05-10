import java.util.*;

public class Main {
  public static void main(String[] args) {
    // Step 1: Create nodes
    ArrayList<WeightedNode> nodeList = new ArrayList<>();
    nodeList.add(new WeightedNode("A", 0));
    nodeList.add(new WeightedNode("B", 1));
    nodeList.add(new WeightedNode("C", 2));
    nodeList.add(new WeightedNode("D", 3));
    nodeList.add(new WeightedNode("E", 4));

    // Step 2: Create graph
    WeightedGraph graph = new WeightedGraph(nodeList);

    // Step 3: Add weighted edges
    graph.addWeightedEdge(0, 1, 4);  // A -> B
    graph.addWeightedEdge(0, 2, 1);  // A -> C
    graph.addWeightedEdge(2, 1, 2);  // C -> B
    graph.addWeightedEdge(1, 3, 1);  // B -> D
    graph.addWeightedEdge(2, 3, 5);  // C -> D
    graph.addWeightedEdge(3, 4, 3);  // D -> E

    // Step 4: Run Dijkstra’s Algorithm
    System.out.println("Dijkstra from A:");
    graph.dijkstra(nodeList.get(0));  // Source: A

    // Reset distances and parents for Bellman-Ford
    for (WeightedNode node : nodeList) {
      node.distance = Integer.MAX_VALUE;
      node.parent = null;
    }

    // Step 5: Run Bellman-Ford Algorithm
    System.out.println("\nBellman-Ford from A:");
    graph.bellmanFord(nodeList.get(0));  // Source: A
  }
}

