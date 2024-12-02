package Exception_Handling;


class StackOverflowException extends Exception
{
 public String toString()
 {
     return "Stack is full";
 }
}

class StackUnderflowException extends Exception
{
    public String toString()
    {
        return "Stack is empty";
    }
}
class Stack
{
    int x;
    int top=-1;
    int arr[];

public Stack()
{
    this.arr=new int[5];
}
    public void push(int x) throws StackOverflowException
    {
        if (top>=4)
        {
            throw new StackOverflowException();
        }
        else {
            top++;

            this.x=x;
            arr[top]=x;
        }

    }

    public int pop() throws StackUnderflowException
    {
        if (top<0)
        {
            throw new StackUnderflowException();
        }
        else
        {
            this.x=arr[top];
            top--;

            return x;


        }
    }
    public void display()
    {
        for (int i=0;i<=top;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
public class Stack_Exceptions
{
    public static void main(String[] args) {
        Stack s=new Stack();
        try
        {
            s.push(2);
            s.display();

        }
        catch (StackOverflowException e)
        {
            System.out.println(e);
        }

        System.out.println();
        try
        {
            s.push(3);
            s.display();

        }
        catch (StackOverflowException e)
        {
            System.out.println(e);
        }

        System.out.println();
        try
        {
            s.push(3);
            s.display();

        }
        catch (StackOverflowException e)
        {
            System.out.println(e);
        }
//4th
        System.out.println();
        try
        {
            s.push(3);
            s.display();

        }
        catch (StackOverflowException e)
        {
            System.out.println(e);
        }

        //5th
        System.out.println();
        try
        {
            s.push(3);
            s.display();

        }
        catch (StackOverflowException e)
        {
            System.out.println(e);
        }
        //6th
        System.out.println();
        try
        {
            s.push(3);
            s.display();

        }
        catch (StackOverflowException e)
        {
            System.out.println(e);
        }

        //popping
        System.out.println();
        try
        {
            s.pop();
            s.display();
        }
        catch(StackUnderflowException e)
        {
            System.out.println(e);
        }

        System.out.println();
        try
        {
            s.pop();
            s.display();
        }
        catch(StackUnderflowException e)
        {
            System.out.println(e);
        }

        System.out.println();
        try
        {
            s.pop();
            s.display();
        }
        catch(StackUnderflowException e)
        {
            System.out.println(e);
        }

        System.out.println();
        try
        {
            s.pop();
            s.display();
        }
        catch(StackUnderflowException e)
        {
            System.out.println(e);
        }

        System.out.println();
        try
        {
            s.pop();
            s.display();
        }
        catch(StackUnderflowException e)
        {
            System.out.println(e);
        }

        //6th ele exception wala
        System.out.println();
        try
        {
            s.pop();
            s.display();
        }
        catch(StackUnderflowException e)
        {
            System.out.println(e);
        }



    }
}
