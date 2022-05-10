package CoreJava;

abstract
class ServiceProvider implements Interface {
    @Override
    public
    void m1 () {
        System.out.println ("m1 method is implemented.");
    }

    @Override
    public
    void m2 () {
        System.out.println ("m2 method is implemented.");
    }
}
class
SubServiceProvider extends ServiceProvider{
    @Override
    public
    void m3 () {
        System.out.println ("m3 method is implemented.");

    }


    public static
     void main (String[] args) {
    ServiceProvider sp=new SubServiceProvider ();
    sp.m1 ();
    sp.m3 ();
    System.out.println (a);
    Interface.display ();
    sp.def1 ();
    }
}
