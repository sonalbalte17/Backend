package MultiThreading;

public
class ThreadDemo_Runnable {
    public static
    void main (String[] args) {
        MyRunnable r=new MyRunnable ();
        Thread t=new Thread (r);
        t.start ();
        for (int i=0;i<5;i++){
            System.out.println ("Main Thread");
        }

    }
}


class MyRunnable implements Runnable{
    @Override
    public
    void run () {
        for(int i=0;i<5;i++){
            System.out.println ("Child Thread");
        }
    }
}