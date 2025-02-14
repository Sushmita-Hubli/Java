package CollectionFramework;

public class Basic_Info
{
    public static void main(String[] args) {

        System.out.println("Java Collection Framework (JCF) provides a set of interfaces and classes for storing and manipulating groups of objects efficiently.\n" +
                "\n" +
                "It includes List, Set, Queue, and Map interfaces, each serving different data handling needs.\n" +
                "\n" +
                "List (ArrayList, LinkedList, Vector, Stack) allows ordered storage with duplicate elements.\n" +
                "\n" +
                "Set (HashSet, LinkedHashSet, TreeSet) stores unique elements without duplicates.\n" +
                "\n" +
                "Map (HashMap, LinkedHashMap, TreeMap, Hashtable) stores key-value pairs where keys must be unique.\n" +
                "\n" +
                "Queue (PriorityQueue, LinkedList) follows FIFO (First-In-First-Out) for scheduling tasks.\n" +
                "\n" +
                "The Collections class provides utility methods for sorting, searching, and synchronization.\n" +
                "\n" +
                "Synchronization is needed for thread safety, using Collections.synchronizedList() or ConcurrentHashMap.\n" +
                "\n" +
                "Sorting is done using Collections.sort() (natural order) or Comparator for custom sorting.\n" +
                "\n" +
                "The framework improves code efficiency, performance, and reusability by providing well-optimized data structures.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n");


        System.out.println("complete inheritance cycle of Collection Frame work is as follows:\n" +
                "Iterable interface<--Collection interface<--(List interface<--(ArrayList class),(LinkedList class),(Vector class),(Stack class)),(Queue interface<--(Deque interface<--ArrayDeque class),(PriorityQueue class)),(Set interface<--(sortedSet interface<--TreeSet class),(HashSet class),(LinkedHashSet))" +
                "\nMap interface<--(sortedMap interface<--TreeMap class),(HashMap class),(LinkedHashMap class),(HashTable class)");

        System.out.println("Few of the important methods of Collection interface which is Parent of List interface,Queue interface and Set interface are:\n" +
                "add(E e),addAll(Collection<E> c),remove(Object o),removeAll(Collection<E> c),retainAll(Collection<E> c),clear(),isEmpty(),contains(Object o),containsAll(Collection<E> c),equals(Object o),size(),iterator(),toArray()");


    }
}
