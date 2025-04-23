public class Main {
    public static void main(String[] args) {

        // Bubble Sort
        BubbleSort bs = new BubbleSort();
        int[] bubbleArr = {5, 3, 8, 4, 2};
        System.out.println("Bubble Sort:");
        bs.bubbleSort(bubbleArr);
        bs.printArray(bubbleArr);

        // Insertion Sort
        InsertionSort is = new InsertionSort();
        int[] insertionArr = {7, 2, 9, 1, 5};
        System.out.println("\nInsertion Sort:");
        is.insertionSort(insertionArr);
        is.printArray(insertionArr);

        // Selection Sort
        SelectionSort ss = new SelectionSort();
        int[] selectionArr = {9, 4, 6, 2, 7};
        System.out.println("\nSelection Sort:");
        ss.selectionSort(selectionArr);
        ss.printArray(selectionArr);

        // Merge Sort
        int[] mergeArr = {10, 3, 15, 7, 8};
        System.out.println("\nMerge Sort:");
        MergeSort ms = new MergeSort();
        ms.mergeSort(mergeArr, 0, mergeArr.length - 1);
        ms.printArray(mergeArr);

        // Quick Sort
        int[] quickArr = {11, 6, 9, 3, 12};
        System.out.println("\nQuick Sort:");
        QuickSort qs = new QuickSort();
        qs.quickSort(quickArr, 0, quickArr.length - 1);
        qs.printArray(quickArr);

        // Heap Sort
        int[] heapArr = {20, 15, 30, 5, 10};
        System.out.println("\nHeap Sort:");
        HeapSort hs = new HeapSort(heapArr);
        hs.sort();
        hs.printArray();

        // Bucket Sort
        int[] bucketArr = {42, 32, 33, 52, 37, 47, 51};
        System.out.println("\nBucket Sort:");
        BucketSort bks = new BucketSort(bucketArr);
        bks.bucketSort();
        bks.printArray();

        // Binary Heap
        System.out.println("\nBinary Heap (Min Heap):");
        BinaryHeap bh = new BinaryHeap(10);
        bh.insertInHeap(12);
        bh.insertInHeap(7);
        bh.insertInHeap(25);
        bh.insertInHeap(17);
        bh.insertInHeap(15);
        bh.levelOrder();
        System.out.println("Extracted head: " + bh.extractHeadOfHeap());
        bh.levelOrder();
    }
}
