/**
 * Created by Zaara Tasnim Rifat on 5/14/2016.
 */
public class PCFixed {
    public static void main(String [] args)
    {
        Stack ob = new Stack(20);
        Producer p1 =new Producer(ob);
        //Producer p2 =new Producer(ob);
        Consumer c1 =new Consumer(ob,"Consumer1");
        //Consumer c2 = new Consumer(ob,"Consumer2");

        try{
            p1.t.join();
            //p2.t.join();
            c1.t.join();
            //c2.t.join();
        }catch (InterruptedException e) {

            System.out.println("Terminating...");
        }
    }
}
