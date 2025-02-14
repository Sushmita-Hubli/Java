package CollectionFramework;

import java.util.List;
import java.util.TreeSet;

public class TreeSet1
{
    public static void main(String[] args) {
        System.out.println("TreeSet in Java\n" +
                "TreeSet is a class in the Java Collection Framework that implements the NavigableSet interface and is based on a Red-Black Tree. It stores unique elements in sorted order and provides logarithmic time complexity (O(log n)) for operations like add, remove, and search.\n" +
                "\n" +
                "Key Features:\n" +
                "\n" +
                "Stores unique elements in sorted (ascending) order\n" +
                "Implements NavigableSet, providing methods for range queries\n" +
                "Thread-unsafe but can be synchronized manually\n");

        TreeSet<Integer> ts=new TreeSet<>(List.of(10,30,50,70,10,40));
        ts.add(25);
        System.out.println(ts);
        System.out.println(ts.ceiling(57));
        System.out.println(ts.floor(57));
    }
}
