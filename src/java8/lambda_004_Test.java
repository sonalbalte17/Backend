package java8;

public
class lambda_004_Test {
    public static
    void main (String[] args) {
        Interf1 i = (a, b) -> System.out.println ("The Sum by lambda Expression:" + (a + b));
        i.add (10, 20);
        i.add (100, 200);

    }

    interface Interf1 {

        public
        void add (int a, int b);
    }

    class Demo1 implements Interf1 {
        public
        void add (int a, int b) {
            System.out.println ("The Sum:" + (a + b));
        }
    }
}