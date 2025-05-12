import java.util.ArrayList;

public class FloydWarshall {

    ArrayList<WeightedNode> nodeList = new ArrayList<>();

    // Constructor
    public FloydWarshall(ArrayList<WeightedNode> nodeList) {
        this.nodeList = nodeList;
    }

    void floydWarshall() {
        int size = nodeList.size();
        int[][] V = new int[size][size];

        // Initializing Distance table from adjacency list
        for (int i = 0; i < size; i++) {
            WeightedNode first = nodeList.get(i);
            for (int j = 0; j < size; j++) {
                WeightedNode second = nodeList.get(j);
                if (i == j)
                    V[i][j] = 0;
                else if (first.getWeightMap().containsKey(second)) {
                    V[i][j] = first.getWeightMap().get(second);
                } else {
                    V[i][j] = Integer.MAX_VALUE / 10;
                }
            }
        }

        // Floyd Warshall's Algorithm
        for (int k = 0; k < size; k++) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (V[i][j] > V[i][k] + V[k][j]) {
                        V[i][j] = V[i][k] + V[k][j];
                    }
                }
            }
        }

        // Detect Negative Cycle
        boolean hasNegativeCycle = false;
        for (int i = 0; i < size; i++) {
            if (V[i][i] < 0) {
                hasNegativeCycle = true;
                System.out.println("Negative cycle detected at node: " + nodeList.get(i));
            }
        }

        if (!hasNegativeCycle) {
            // Print Distance Matrix
            for (int i = 0; i < size; i++) {
                System.out.print("Minimum distances from node " + nodeList.get(i) + ": ");
                for (int j = 0; j < size; j++) {
                    System.out.print(V[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    // Add a weighted edge between two nodes
    public void addWeightedEdge(int i, int j, int d) {
        WeightedNode first = nodeList.get(i - 1);
        WeightedNode second = nodeList.get(j - 1);
        first.getWeightMap().put(second, d);
    }
}
