package OOps_concepts;

public abstract
class A {
    abstract void display();
}
abstract class B extends A{
    @Override
    void display () {
        System.out.println ("Class B extends A.");
    }

   void show () {
        System.out.println ("Concrete method.");
    }
    abstract void screen_show();
}
class C extends B{
    @Override
    void screen_show () {
        System.out.println ("screen_show demo extends B");
    }
}
class Abstract{
    public static
    void main (String[] args) {
        C c1 =new C ();
        c1.show ();
        c1.display ();
        c1.screen_show ();
    }
}