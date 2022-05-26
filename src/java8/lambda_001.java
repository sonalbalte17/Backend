package java8;

public
class lambda_001 {
    public static
    void main (String[] args) {
       @FunctionalInterface
               interface P
       {
           public  void m1();
       }
       @FunctionalInterface
               interface C extends P{

       }
    }
}
