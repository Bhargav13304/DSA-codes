import java.util.ArrayList;
class Main{
    public static void main(String[] args) {
        ArrayList<KnapsackItem> items = new ArrayList<>();
        int[] weight = {10, 40, 20, 30};
        int[] value = {60, 40, 100, 120};
        int capacity = 50;
        for(int i=0; i<weight.length; i++){
            items.add(new KnapsackItem(i+1, value[i], weight[i]));
        }
        FractionalKnapsack.knapSack(items, capacity);
        
    }
}
        
