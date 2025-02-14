package CollectionFramework;

public class List
{
    public static void main(String[] args) {
        System.out.println("The List interface in Java is a part of the Collection Framework and represents an ordered collection of elements that allows duplicates. It provides indexed access to elements and maintains insertion order. Common implementations include ArrayList, LinkedList, Vector, and Stack.");
        System.out.println("Few of the methods of List interface are:\n" +
                "add(int index , E e), addAll(int index, Collection<E>)\n" +
                "remove(int index), get(int index), set(int index,E e), subList(int from, int to), indexOf(Object o),lastIndexOf(Object o),listIterator(), listIterator(int index)");


        System.out.println("The Set interface in Java is a part of the Collection Framework and represents an unordered collection of unique elements (no duplicates). It does not allow indexing and ensures uniqueness using hashing or tree structures. Common implementations include HashSet, LinkedHashSet, and TreeSet.");

        System.out.println("The Queue interface in Java is a part of the Collection Framework and represents an ordered collection that follows the FIFO (First-In-First-Out) principle. It provides methods for adding, removing, and inspecting elements. Common implementations include LinkedList, PriorityQueue, and ArrayDeque.\n" +
                "Few of the methods of Queue interface are:\n" +
                "add(E e),poll()-->removes the first element and returns null if queue is empty,remove()throws NoSuchElementException-->removes the first element from queue but throws exception when queue is empty, peek()-->returns the beginning element, element() throws NosuchElementException");
        
    }
}
