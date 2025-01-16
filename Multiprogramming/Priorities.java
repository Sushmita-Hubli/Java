package Multiprogramming;

public class Priorities
{
    public static void main(String[] args) {
        System.out.println("Thread Priorities");
        System.out.println("In Java, each thread has a priority, which helps the thread scheduler determine the order in which threads should be executed. Thread priorities are integers that range from 1 to 10, where:\n" +
                "\n" +
                "1 is the MIN_PRIORITY (the lowest priority).\n" +
                "5 is the NORM_PRIORITY (the default priority).\n" +
                "10 is the MAX_PRIORITY (the highest priority).\n" +
                "When a thread is created, it inherits the priority of the thread that created it. You can change a thread's priority using the setPriority(int priority) method and retrieve it using the getPriority() method.");
    }
}
