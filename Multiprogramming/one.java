package Multiprogramming;

public class one
{
    public static void main(String[] args) {
        System.out.println("Multitasking:\n" +
                "Multitasking refers to the capability of an operating system to run multiple tasks or processes at the same time, giving the appearance that they are executing simultaneously. This can be done in two ways:\n" +
                "\n" +
                "Preemptive Multitasking: The operating system decides when to switch between tasks.\n" +
                "Cooperative Multitasking: Each task decides when to yield control.\n" +
                "Example: On a personal computer, you can have a web browser, a text editor, and a music player running simultaneously. The OS switches between these tasks so quickly that it seems they are running at the same time.\n" +
                "\n" +
                "Multiprogramming:\n" +
                "Multiprogramming refers to the ability of the operating system to load multiple programs into memory and have them ready for execution. The CPU executes one program while others are waiting for I/O operations, effectively using CPU time more efficiently.\n" +
                "\n" +
                "Example: In an old batch processing system, multiple jobs (like printing, calculations, and sorting) are loaded into memory. The CPU switches to another job when the current one is waiting for I/O, like reading data from a disk.\n" +
                "\n" +
                "Multithreading:\n" +
                "Multithreading is the ability of a single process to manage multiple threads of execution. Each thread can run concurrently within the same program, sharing resources like memory, while executing independently.\n" +
                "\n" +
                "Example: A web server handles multiple client requests using multithreading. Each client request is handled by a separate thread, allowing the server to process many requests simultaneously.\n" +
                "\n" +
                "Differences:\n" +
                "Scope:\n" +
                "Multiprogramming deals with multiple programs.\n" +
                "Multitasking deals with multiple tasks (which can be parts of the same or different programs).\n" +
                "Multithreading deals with multiple threads within a single program.\n" +
                "Objective:\n" +
                "Multiprogramming aims to maximize CPU utilization.\n" +
                "Multitasking aims to provide the illusion of concurrent task execution.\n" +
                "Multithreading aims to improve performance by parallel execution of threads within a program.");



        System.out.println("run() method must be overriden in a class which is extending from Thread class to achieve Multithreading\n" +
                "Inside the main class we have to create the object of this MYThread class which is extending from the Thread class. and we have to call start() method on this object in order to run the thread.\n" +
                "Note: start() is a ,inbuilt method in Thread class . we have to call this start method on our object in order to call the run() method . we should not call the run method using object directly.\n" +
                "Once the object.start() method is called,  a thread is created ");
        System.out.println(" it is compulsory to override the run method when extending the Thread class to achieve multithreading in Java. The run method contains the code that defines the task a thread will perform when it starts executing.\n" +
                "\n" +
                "Here’s why it is necessary:\n" +
                "\n" +
                "When you create a new thread by extending the Thread class, you provide the specific task or logic that the thread should execute by overriding the run method.\n" +
                "The start method of the Thread class internally calls the run method. If you do not override run, the thread will execute the default implementation of run in the Thread class, which does nothing.");

        System.out.println("If you are using Runnable interface to achieve multithreading, then we have to first create object of the class which is implementing from Runnable interface . then we have to create object of Thread class and then pass the class object inside parenthesis of the Thread class constructor. Thread t=new Thread(m). here m is the object of class which is implementing from Runnable interface");

    }


}
