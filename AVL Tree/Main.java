public class Main {
    public static void main(String[] args) {
        AVL avl = new AVL();

        // Inserting nodes
        avl.insert(30);
        avl.insert(10);
        avl.insert(20);
        avl.insert(40);
        avl.insert(50);
        avl.insert(25);

        System.out.print("Pre-order traversal: ");
        avl.preOrder(avl.root);
        System.out.println();

        System.out.print("In-order traversal: ");
        avl.inOrder(avl.root);
        System.out.println();

        System.out.print("Post-order traversal: ");
        avl.postOrder(avl.root);
        System.out.println();

        System.out.print("Level-order traversal: ");
        avl.levelOrder();
        System.out.println();

        // Searching
        avl.search(avl.root, 25);
        avl.search(avl.root, 60);

        // Deletion
        avl.delete(40);
        System.out.print("Level-order after deleting 40: ");
        avl.levelOrder();
        System.out.println();
    }
}
