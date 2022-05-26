package java8;
class myRunnanble implements Runnable{
    @Override
    public
    void run () {
        for (int i = 0; i <5 ; i++) {
            System.out.println ("Child Thread Execution without using Lambda Expression.");
        }
    }
}
public
class lambda_007_ThreadsDemo1 {
    public static
    void main (String[] args) {
Runnable r=new myRunnanble();
Thread t=new Thread (r);
t.start ();
        for (int i = 0; i <5 ; i++) {
            System.out.println ("Main Class");
        }
    }

}
