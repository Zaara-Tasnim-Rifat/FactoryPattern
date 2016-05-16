/**
 * Created by Zaara Tasnim Rifat on 5/14/2016.
 */
public class Stack {
   private int  [] stack;
    private int tos;
    //int n;
    //private boolean flag = false;

    public Stack(int n)
    {
        stack = new int[n];
        tos =0;
    }

    synchronized public void put(int n)
    {
        while (/*flag ||*/ tos >=20)
        {
            try
            {
               wait();
            }catch (InterruptedException e)
            {
                System.out.println("Interrupted Exception");
            }
        }
        stack[tos] = n;
        tos++;
        //this.n = n;
        //flag = true;
        System.out.println("put: "+ n);
        notify();
    }

    synchronized public int get()
    {
        while (/*!flag ||*/ tos <= 0)
        {
            try
            {
                wait();
            }catch (InterruptedException e)
            {
                System.out.println("Interrupted Exception");
            }

        }

        tos--;
        System.out.println("get: "+ stack[tos]);
        //System.out.println("got: "+ n);
        //flag = false;
        notify();
        return  stack[tos];

    }
}
