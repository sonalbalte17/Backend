package MultiThreading;

public
class Mythread_overloading extends Thread
{
    @Override
    public
    void run () {
        System.out.println ("No-args run");
    }
public void run(int i){
        System.out.println ("int args run");
}
}
