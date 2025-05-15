import java.util.ArrayList;

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
        Prims graph = new Prims(nodeList);

        // Step 3: Add edges
        graph.addWeightedUndirectedEdge(0, 1, 5);   // A-B
        graph.addWeightedUndirectedEdge(0, 2, 13);  // A-C
        graph.addWeightedUndirectedEdge(1, 2, 10);  // B-C
        graph.addWeightedUndirectedEdge(1, 3, 8);   // B-D
        graph.addWeightedUndirectedEdge(2, 3, 6);   // C-D
        graph.addWeightedUndirectedEdge(3, 4, 4);   // D-E

        // Step 4: Run Prim's Algorithm from node A (index 0)
        System.out.println("Running Prim's Algorithm on the graph:");
        graph.prims(nodeList.get(0));
    }
}
