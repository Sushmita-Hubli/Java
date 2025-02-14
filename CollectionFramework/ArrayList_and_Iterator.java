package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList_and_Iterator
{
    static void show(int n)
    {
        if(n>60)
        {
            System.out.print(n+" ");
        }

    }
    public static void main(String args[])
    {
        System.out.println("ArrayList:\n" +
                "ArrayList is a resizable array implementation of the List interface in Java. It allows dynamic resizing, fast random access (O(1) time complexity), and supports duplicate elements while maintaining insertion order.\n" +
                "\n" +
                "Iterator:\n" +
                "Iterator is an interface in Java used to traverse elements of a Collection one by one. It provides methods like hasNext(), next(), and remove() to iterate safely and efficiently over collections like List, Set, and Queue.");

        System.out.println("\nImplementation of ArrayList is as follows:\n");

        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>(List.of(50,60,70,70,80)); //another way of adding elements in a List
        ArrayList<Integer> al3=new ArrayList<>(List.of(8,8)); //another way of adding elements in a List

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

        //for all loop
        for(Integer x:al)
        {
            System.out.print(x+" ");
        }
        System.out.println();

//lambda expression way 1
        al.forEach((x)->{
            System.out.print(x+" ");
        });
        System.out.println();

        //lambda expression way 2
        al.forEach(System.out::println);
        System.out.println();

        //using Iterator-->iterates through the ArrayList in forward direction only
        Iterator<Integer> it=al.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();


        //using ListIterator-->we can iterate through the arraylist in both the directions. and it has more methods than iterator
        ListIterator<Integer> it1=al.listIterator();
        while(it1.hasNext())
        {
            System.out.print(it1.next()+" ");
        }
        System.out.println();

//forEach
        al.forEach(n->show(n));
        System.out.println();
        al.forEach(ArrayList_and_Iterator::show);

    }
}
