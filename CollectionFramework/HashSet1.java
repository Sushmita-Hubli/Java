package CollectionFramework;
import java.util.*;

public class HashSet1
{
    public static void main(String[] args) {

        System.out.println("HashSet is a class in the Java Collection Framework that implements the Set interface using a hash table. It stores unique elements only and does not maintain any insertion order. Internally, it uses a HashMap to store elements.\n" +
                "\n" +
                "Key Features:\n" +
                "\n" +
                "No duplicate elements allowed\n" +
                "Unordered collection (does not maintain insertion order)\n" +
                "Allows null values\n" +
                "Constant-time performance (O(1)) for add, remove, and contains operations in average cases");

        HashSet<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);

        hs.forEach(x-> System.out.print(x+" "));
        System.out.println();

        //we also have
        HashSet<Integer> hs2=new HashSet<>(20,0.75f);//here 20 is capacity of hashset and 0.75 is the loading factor . means only 75% of the hashset cells can be filled with data

    }
}
