import java.util.Scanner;

/**
 * Created by Zaara Tasnim Rifat on 5/14/2016.
 */
public class Consumer implements Runnable {
    Stack ob;
    Thread t;
    String name;


    Consumer(Stack ob, String str)
    {
        name = str;
        this.ob = ob;
        t=new Thread(this,"Consumer");
        t.start();

    }

    @Override
    public void run() {
        while(true)
        {
            ob.get();
            System.out.println(name);
        }
    }
}
