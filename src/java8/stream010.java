package java8;
//for each () method in streams
import java.util.ArrayList;
//import stmnt until subpackage level class and interfaces to make them available for usage
import java.util.function.Consumer;

public
class stream010 {
    public static
    void main (String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer> ();
        l.add (0);
        l.add (10);
        l.add (20);
        l.add (5);
        l.add (15);
        l.add (25);
        System.out.println (l);
        l.stream ().forEach (System.out::println);
        //user defined function using the Consumer Function Interface,Consumer does not return any value.
        Consumer<Integer> c=i->{
            System.out.println ("Square root of "+i+" is: "+(i*i));
        };
        l.stream ().forEach (c);
    }
}
