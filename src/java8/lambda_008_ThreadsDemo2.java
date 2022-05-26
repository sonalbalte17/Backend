package java8;

public
class lambda_008_ThreadsDemo2 {
    public static
    void main (String[] args) {
        Runnable r=()->{
            for (int i = 0; i <3 ; i++) {
                System.out.println ("Child Thread Execution Using Lambda Expression.");
            }};
        Thread t=new Thread (r);
        t.start ();
        for (int i = 0; i <3 ; i++) {
            System.out.println ("Main Thread Execution.");
        }
        }
    }


