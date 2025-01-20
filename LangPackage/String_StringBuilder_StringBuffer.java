package LangPackage;

public class String_StringBuilder_StringBuffer
{
    public static void main(String[] args) {
        System.out.println("String, String Builder and String Buffer classes");

        System.out.println("String: An immutable sequence of characters in Java, meaning its value cannot be changed once created.\n" +
                "StringBuffer: A mutable sequence of characters that is thread-safe and synchronized, allowing for modifications without creating new objects.\n" +
                "StringBuilder: Similar to StringBuffer but without synchronization, making it faster and more efficient for single-threaded environments.");

        String s1=new String("Hello");
        StringBuffer s2=new StringBuffer("Hello");
        StringBuilder s3=new StringBuilder("Hello");

        s1.concat(" World");
        s2.append(" World");
        s3.append(" World");

        System.out.println(s1+"\n"+s2+"\n"+s3);
        //here we observe that World is not concatenated with the String pbject s1 because it is immutable whereas it gets appended with the object of StringBuffer and StringBuilder because they are mutable

        

    }
}
