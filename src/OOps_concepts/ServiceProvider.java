package OOps_concepts;

public
class ServiceProvider implements Interface {
    public void m1(){
        System.out.println ("m1");
    }


    public
    void m3 () {
        System.out.println ("m3");
    }

    public static
    void main (String[] args) {
        ServiceProvider sp=new ServiceProvider ();
        sp.m1 ();
        System.out.println (a);
        sp.m2 ();
        sp.m3 ();
    }
}
interface Interface{
    void m1();
    static int a=1;

    default
    void m2 () {
        System.out.println ("m2");
    }
    abstract void m3();
}