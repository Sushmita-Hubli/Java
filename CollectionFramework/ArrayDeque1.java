package CollectionFramework;

import java.util.ArrayDeque;

public class ArrayDeque1
{
    public static void main(String[] args) {
        System.out.println("ArrayDeque is a resizable, array-based implementation of the Deque interface in Java. It allows efficient addition and removal of elements from both ends (O(1) time complexity) and is faster than LinkedList for queue operations. It does not allow null elements and can be used as both a stack and a queue.");

        ArrayDeque<Integer> dq=new ArrayDeque<>();
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);

        dq.forEach(x-> System.out.print(x+" "));
        System.out.println();

        dq.offerFirst(50);
        dq.offerFirst(60);
        dq.offerFirst(70);

        dq.forEach(x-> System.out.print(x+" "));
        System.out.println();

       //stack implementation
//        dq.offerLast(10);
//        dq.offerLast(20);
//        dq.offerLast(30);
//        dq.offerLast(40);
//        dq.pollLast();


        //queue implementation
//        dq.offerLast(10);
//        dq.offerLast(20);
//        dq.offerLast(30);
//        dq.offerLast(40);
//        dq.pollFirst();



    }
}
