package CollectionFramework;

public class Hashing_Technique
{
    public static void main(String[] args) {
        System.out.println("Hashing Technique in Java\n" +
                "Hashing is a technique used to store and retrieve data efficiently using a hash function that maps keys to indices in a hash table.\n" +
                "\n" +
                "1. Chaining (Separate Chaining)\n" +
                "Uses linked lists (or other data structures) to store multiple values at the same index (hash collision).\n" +
                "When a collision occurs, the new value is appended to the linked list at that index.\n" +
                "Commonly implemented using LinkedList or ArrayList in Java.\n" +
                "Advantages:\n" +
                "Handles collisions efficiently.\n" +
                "No need to resize the hash table frequently.\n" +
                "\n" +
                "Disadvantages:\n" +
                "Increased memory usage due to linked lists.\n" +
                "Performance degrades if many keys hash to the same index (long chains).\n" +
                "\n" +
                "2. Open Addressing\n" +
                "Stores all elements within the hash table itself (no extra data structures).\n" +
                "If a collision occurs, it probes for the next available slot using a predefined method.\n" +
                "Probing Techniques:\n" +
                "\n" +
                "Linear Probing → Check the next slot sequentially (index + 1, index + 2…).\n" +
                "Quadratic Probing → Check slots using a quadratic function (index + 1², index + 2²…).\n" +
                "Double Hashing → Uses a second hash function for probing.\n" +
                "Advantages:\n" +
                "No extra memory for linked lists.\n" +
                "More cache-friendly (better performance for small data).\n" +
                "\n" +
                "Disadvantages:\n" +
                "More prone to clustering (especially in linear probing).\n" +
                "Requires careful resizing to avoid performance degradation.\n" +
                "\n");
    }
}
