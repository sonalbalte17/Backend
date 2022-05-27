package java8;

import java.util.ArrayList;
import java.util.stream.Stream;

//toArray() in Streams
public
class stream011 {
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
        Integer [] i=l.stream ().toArray (Integer[]::new);
Stream.of (i).forEach (System.out::println);//processing individual elements in an array using of() method

    }
}
