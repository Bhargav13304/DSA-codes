import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<WeightedNode> nodeList = new ArrayList<>();
        nodeList.add(new WeightedNode("A", 0));
        nodeList.add(new WeightedNode("B", 1));
        nodeList.add(new WeightedNode("C", 2));
        nodeList.add(new WeightedNode("D", 3));

        FloydWarshall graph = new FloydWarshall(nodeList);

        // Define edges
        graph.addWeightedEdge(1, 2, 3);   // A -> B
        graph.addWeightedEdge(1, 3, 7);   // A -> C
        graph.addWeightedEdge(2, 3, 1);   // B -> C
        graph.addWeightedEdge(3, 4, 2);   // C -> D
        graph.addWeightedEdge(4, 1, 6);   // D -> A

        // Run Floyd-Warshall
        graph.floydWarshall();
    }
}
