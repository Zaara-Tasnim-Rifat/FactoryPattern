import java.util.Random;
import java.util.Scanner;

/**
 * Created by Zaara Tasnim Rifat on 5/14/2016.
 */
public class Producer implements Runnable{
    Stack ob;
    int n;
    Thread t;

    Producer(Stack ob)
    {
        this.ob = ob;
        t = new Thread(this,"Producer");
        t.start();
    }

    @Override
    public void run() {
        //Scanner in = new Scanner(System.in);
        //int i=0;
        Random rand = new Random();
        while(true)
        {

            n = rand.nextInt(100);
            ob.put(n);
            //ob.put(i++);
        }
    }
}
