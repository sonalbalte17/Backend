package java8;

public
class lambda_006_Test {
    public static
    void main (String[] args) {
      interf3 interf3=x->x*x;
        System.out.println (interf3.squareIt (4));
        System.out.println (interf3.squareIt (20));
    }
    interface interf3{
        public int squareIt(int x);
    }
    class Demo4 implements interf3{
        @Override
        public
        int squareIt (int x) {
            return x * x;
        }
    }
}
