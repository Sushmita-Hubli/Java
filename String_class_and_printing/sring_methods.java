package String_class_and_printing;

public class sring_methods
{
    public static void main(String[] args) {
        String a="   Java Programming   ";
        String b="Java";
        System.out.println(a.length());
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.trim());
        System.out.println(a.substring(5));
        System.out.println(a.substring(0,11)); //beginning,end+1
        System.out.println(a.replace('a','s'));
        System.out.println(b.startsWith("J"));
        System.out.println(b.endsWith("a"));
        System.out.println(b.charAt(2));
        System.out.println(b.indexOf("va"));
        System.out.println(b.lastIndexOf("Java")); //starts searching from last index
        System.out.println(a.equals(b));
        System.out.println(b.equalsIgnoreCase("jAVa"));
        System.out.println("\n\n");
        System.out.println(b.compareTo("java"));
        System.out.println(b.compareTo("JAVA"));
        System.out.println(b.compareTo("kava"));//NEGATIVE
        System.out.println(b.compareTo("Kava"));//-1
        System.out.println(b.compareTo("iava"));//NEGATIVE
        System.out.println(b.compareTo("Iava"));//POSITIVE
        System.out.println(b.compareTo("IAVA"));
        System.out.println("\n\n");
        System.out.println(b.valueOf(2));

    }
}
