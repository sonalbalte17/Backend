package java8;

public
class lambda_005_Test {
    public static
    void main (String[] args) {
        Interf2 interf2=(s)->s.length ();
        System.out.println ("By Lambda Expression: "+interf2.getLength ("Hello"));
        System.out.println ("By Lambda Expression:  "+interf2.getLength ("By Lambda expression") );
    }
    interface Interf2 {
        public int getLength(String s);
    }
    class Demo3 implements Interf2{
        @Override
        public
        int getLength (String s) {
            return s.length ();
        }
    }
}
