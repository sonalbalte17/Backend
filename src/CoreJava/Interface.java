package CoreJava;

public
interface Interface {
    public void m1();
    public void m2();
    public void m3();
    final int a=10;
    static void display(){
        System.out.println ("static method is called without an object.");
    }
default void def1(){
        System.out.println ("Default method is implemented.");
}
}

