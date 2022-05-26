package MultiThreading;

public
class ThreadTest {
    public static
    void main (String[] args) {
        MyThread1 th1=new MyThread1 ();
      th1.start ();
      System.out.println ("Main method");
       th1.run ();
    }
}

class MyThread1 extends Thread
{
  public void start(){
     System.out.println ("Start method");
        }
            public void run()
            {
                System.out.println ("run method");
            }
}