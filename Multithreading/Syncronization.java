package Multithreading;

public class Syncronization
{
    public static void main(String[] args) {
        System.out.println("\n" +
                "Synchronization in multithreading is the coordination of threads to ensure that they don't interfere with each other while accessing shared resources or critical sections of code. It prevents thread interference and memory consistency errors by allowing only one thread to access a block of code at a time. This is achieved using synchronized blocks or methods in Java. Proper synchronization ensures thread-safe operations, maintaining data integrity.");

        System.out.println("Resource Sharing: In multithreading, resource sharing refers to multiple threads accessing common resources such as memory, files, or variables. Proper synchronization mechanisms are needed to manage this access to avoid conflicts.\n" +
                "\n" +
                "Critical Section: A critical section is a part of the code that accesses shared resources and must not be executed by more than one thread at a time to prevent data inconsistency.\n" +
                "\n" +
                "Mutual Exclusion: Mutual exclusion ensures that only one thread can enter the critical section at any given time, preventing simultaneous access to shared resources by multiple threads.\n" +
                "\n" +
                "Mutex/Locking: A mutex (mutual exclusion) is a synchronization primitive that allows only one thread to acquire the lock on a shared resource, ensuring exclusive access.\n" +
                "\n" +
                "Semaphore: A semaphore is a signaling mechanism used to control access to a resource by multiple threads. It maintains a counter to track how many threads can access the resource concurrently.\n" +
                "Monitor: A monitor is a high-level synchronization construct that combines mutual exclusion and condition variables, allowing threads to wait until they can safely enter a critical section.\n" +
                "");

    }
}
