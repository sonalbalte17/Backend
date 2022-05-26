package java8;
//without lambda expression
public
class lambda_002_Test {
    public static
    void main (String[] args) {
        Interf i=new Demo();
        i.m1 ();
    }
}

interface Interf {
    public void m1();
   // public void add(int a,int b);
}
class Demo implements Interf{
    public void m1(){
        System.out.println ("Normal implementation.");
    }
}

