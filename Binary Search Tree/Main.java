public class Main {
    public static void main(String[] args) {
      BinarySearchTree bst = new BinarySearchTree();
  
      // Insertion
      bst.insert(50);
      bst.insert(30);
      bst.insert(70);
      bst.insert(20);
      bst.insert(40);
      bst.insert(60);
      bst.insert(80);
  
      // Traversals
      System.out.print("PreOrder Traversal: ");
      bst.preOrder(bst.root);
      System.out.println();
  
      System.out.print("InOrder Traversal: ");
      bst.inOrder(bst.root);
      System.out.println();
  
      System.out.print("PostOrder Traversal: ");
      bst.postOrder(bst.root);
      System.out.println();
  
      System.out.print("Level Order Traversal: ");
      bst.levelOrder();
      System.out.println();
  
      // Searching
      bst.search(bst.root, 40);
      bst.search(bst.root, 100); // Not present
  
      // Deletion
      bst.deleteNode(bst.root, 50);
      System.out.print("InOrder after deleting 50: ");
      bst.inOrder(bst.root);
      System.out.println();
  
      // Delete entire tree
      bst.deleteBST();
    }
  }
  