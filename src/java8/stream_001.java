package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public
class stream_001 {
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
        //without using stream(Until 1.7 version)
        List<Integer> l2 = new ArrayList<Integer> ();
        for (Integer i : l
        ) {
            if (i % 2 == 0) {
                l2.add (i);
            }
        }
        System.out.println ("Using Traditional foreach loop even nos:  " + l2);
        //using stream in 1.8 version
        List<Integer> l1 = l.stream ().filter (i -> i % 2 == 0).collect (Collectors.toList ());
        System.out.println ("Even no.s using Stream:  " + l1);
    }
}