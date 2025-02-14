package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1
{
    public static void main(String[] args) {

        System.out.println("LinkedList is a doubly linked list implementation of the List and Deque interfaces in Java. It allows efficient insertion and deletion operations (O(1) time complexity) but has slower random access (O(n)). It can be used as a list, queue, or stack, making it more flexible than ArrayList.\n");
        LinkedList<Integer> al=new LinkedList<>();
        LinkedList<Integer> al2=new LinkedList<>(List.of(50,60,70,70,80)); //another way of adding elements in a List
        LinkedList<Integer> al3=new LinkedList<>(List.of(8,8)); //another way of adding elements in a List

        al.add(12);
        System.out.println(al);
        al.add(0,22);
        System.out.println(al);
        al.addAll(al2);
        System.out.println(al);
        al.addAll(0,al3);
        System.out.println(al);


        System.out.println(al.contains(50));

        System.out.println(al.get(3));

        System.out.println(al.indexOf(70));

        System.out.println(al.lastIndexOf(70));

        al.set(1,99);
        System.out.println(al);


        System.out.println("Iterating through the ArrayList\n");
        //common method for loop
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i)+" ");
        }
        System.out.println();

        al.addFirst(999);
        al.addLast(9000);
        System.out.println(al);
    }
}
