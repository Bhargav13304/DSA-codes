public class Main {
    public static void main(String[] args) {
      BinaryHeap bh = new BinaryHeap(10);
  
      bh.insert(10, "Min");
      bh.insert(5, "Min");
      bh.insert(20, "Min");
      bh.insert(2, "Min");
      bh.insert(15, "Min");
  
      System.out.println("Level Order Traversal of Heap:");
      bh.levelOrder();
  
      System.out.println("Head of Heap: " + bh.peek());
  
      System.out.println("Extracted Head: " + bh.extractHeadOfBP("Min"));
  
      System.out.println("Level Order After Extraction:");
      bh.levelOrder();
  
      bh.deleteBH();
    }
  }
  
