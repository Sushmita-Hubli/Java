package CollectionFramework;

import java.util.TreeSet;

class Point implements Comparable
{
    int x;
    int y;
    public Point(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    public String toString()
    {
        return "x="+x+" y="+y;
    }

    @Override
    public int compareTo(Object o) {
        Point p=(Point)o;
        if(this.x<p.x)
            return -1;
        else if(this.x>p.x)
            return 1;
        else {
            if (this.y < p.y)
                return -1;
            else if (this.y > p.y)
                return 1;
            else
                return 0;
        }
    }
}
public class ComparableInterface
{
    public static void main(String[] args) {
        System.out.println("The Comparable interface in Java is used to define the natural ordering of objects. It contains a single method:\n" +
                "\n" +
                "java\n" +
                "Copy\n" +
                "Edit\n" +
                "public int compareTo(T obj);\n" +
                "An object of a class implementing Comparable can be compared to another object of the same class. It is used for sorting objects in ascending order (default) and allows a class to define its own comparison logic.\n" +
                "\n" +
                "Key Features:\n" +
                "\n" +
                "Used for default sorting (natural ordering).\n" +
                "Modifies the class itself by implementing compareTo().\n" +
                "Works with sorting methods like Collections.sort().");

        TreeSet<Point> ts=new TreeSet<>();
        ts.add(new Point(1,1));
        ts.add(new Point(5,5));
        ts.add(new Point(5,2));
        System.out.println(ts);

        //on implementing the above we were gettong Exception in thread "main" java.lang.ClassCastException: class CollectionFramework.Point cannot be cast to class java.lang.Comparable (CollectionFramework.Point is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
        //	at java.base/java.util.TreeMap.compare(TreeMap.java:1606)
        //	at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:811)
        //	at java.base/java.util.TreeMap.put(TreeMap.java:820)
        //	at java.base/java.util.TreeMap.put(TreeMap.java:569)
        //	at java.base/java.util.TreeSet.add(TreeSet.java:259)
        //	at CollectionFramework.ComparableInterface.main(ComparableInterface.java:38) this exception.
        //so to avoid this error, we must have to override Comparable interface by our Point class bcoz treeset is a sorted set. but it doesnt know how to sort the elements of user defined class ()here Point class

        //Note: if our user defined class is overriding Comparable interface, then it must override compareTo() method

    }
}
