package Multithreading;

public class States
{
    public static void main(String[] args) {
        System.out.println("States of a Thread:\n" +
                "1.New: A thread is in this state when it is created but not yet started. This happens after the thread object is instantiated but before the start method is called.\n" +
                "\n" +
                "Runnable: After the start method is called, the thread moves to the runnable state. It is ready to run and is waiting for CPU time. However, it may not be running immediately as the CPU scheduler determines which thread to run.\n" +
                "\n" +
                "Running: When the thread scheduler picks a thread from the runnable pool, it moves to the running state. In this state, the thread’s run method is executing.\n" +
                "\n" +
                "Blocked/Waiting: A thread enters this state when it is waiting for a resource or a signal from another thread to proceed. This can happen when the thread is waiting for I/O operations to complete, or it has called methods like wait() or is waiting for a lock.\n" +
                "\n" +
                "Timed Waiting: This state is similar to the waiting state, but the thread will wait for a specified amount of time. Examples include methods like sleep(time), wait(time), or join(time).\n" +
                "\n" +
                "Terminated: A thread moves to this state once it has completed its execution. After a thread terminates, it cannot be restarted.");
    }
}
