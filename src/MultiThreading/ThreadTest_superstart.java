package MultiThreading;

public
class ThreadTest_superstart {

        public static
        void main (String[] args) {
            MyThread2 th2 =new MyThread2 ();
            th2.start ();
            System.out.println ("Main method");
                    }
    }

    class MyThread2 extends Thread
    {
        public void start()
        {
            super.start();
            System.out.println ("Start method");
        }
        public void run()
        {
            System.out.println ("run method");
        }
    }

