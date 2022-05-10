package OOps_concepts;

public
class Polymorphism {
    public static
    void main (String[] args) {
        Polymorphism p1=new Polymorphism ();
        p1.sum (10,20);
p1.sum (10,20,30);
Subclass s1=new Subclass ();
s1.sum (15,20,30);
s1.sum (12,51);
    }
    public void sum(int a,int b){
        int sum=a+b;
        System.out.println ("sum with 2 args:  "+sum);

    }
    public void sum(int a,int b,int c){
        int sum=a+b+c;
        System.out.println ("sum with 3 args:  "+sum);

    }

}
class Subclass extends Polymorphism{
    @Override
    public
    void sum (int a, int b,int c) {
        int sum= a+b+c;
        System.out.println ("sum with overriding  :"+sum);
    }
  public void sum(int a,int b){
     int sum= a+b;
      System.out.println ("subclass with overriding              :"+sum); }
}