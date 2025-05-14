import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // Step 1: Create nodes
    WeightedNode nodeA = new WeightedNode("A", 0);
    WeightedNode nodeB = new WeightedNode("B", 1);
    WeightedNode nodeC = new WeightedNode("C", 2);
    WeightedNode nodeD = new WeightedNode("D", 3);
    WeightedNode nodeE = new WeightedNode("E", 4);

    // Step 2: Add them to a list
    ArrayList<WeightedNode> nodeList = new ArrayList<>();
    nodeList.add(nodeA);
    nodeList.add(nodeB);
    nodeList.add(nodeC);
    nodeList.add(nodeD);
    nodeList.add(nodeE);

    // Step 3: Initialize sets
    DisjointSet.makeSet(nodeList);

    // Step 4: Perform unions
    DisjointSet.union(nodeA, nodeB);
    DisjointSet.union(nodeC, nodeD);
    DisjointSet.union(nodeA, nodeC); // Merges the sets A-B and C-D
    DisjointSet.union(nodeA, nodeE); // Adds E into the same set

    // Step 5: Print nodes in the same set as A
    DisjointSet.findSet(nodeA).printAllNodesofThisSet();

    // Optional: Demonstrate different sets
    System.out.println("Set representative of node E: " + DisjointSet.findSet(nodeE));
    System.out.println("Set representative of node B: " + DisjointSet.findSet(nodeB));
  }
}

