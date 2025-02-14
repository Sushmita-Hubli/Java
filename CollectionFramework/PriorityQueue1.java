package CollectionFramework;

import java.util.PriorityQueue;

public class PriorityQueue1
{
    public static void main(String[] args) {
        System.out.println("PriorityQueue is a queue implementation in Java that orders elements according to their natural ordering or a custom comparator. It follows a min-heap structure by default, meaning the smallest element is always at the head. It does not allow null values and does not guarantee FIFO order like a regular queue.");
        System.out.println("In a PriorityQueue, deletion follows the heap structure rules:\n" +
                "\n" +
                "Removing the Head (Poll/Remove) → The highest priority element (smallest by default) is removed first.\n" +
                "\n" +
                "poll() → Removes and returns the head or null if empty.\n" +
                "remove() → Removes the head but throws an exception if empty.");


        System.out.println("\n\n******SMALLER IS THE VALUE , HIGHER IS THE PRIORITY******");

        PriorityQueue<Integer> p=new PriorityQueue<>();
        p.add(20);
        p.add(10);
        p.add(30);
        p.add(5);p.add(15);
        p.add(3);
        System.out.println(p.peek());
        p.forEach(x->System.out.print(x+" "));
        p.poll();
        System.out.println("After deletion:");
        p.forEach(x->System.out.print(x+" "));




    }
}
