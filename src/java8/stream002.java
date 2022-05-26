package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public
class stream002 {
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
        //without using streams(Until 1.7 version)
        List<Integer>l1=new ArrayList<Integer> ();
        for (Integer i:l
             ) {
            l1.add (i*2);
        }
        System.out.println ("without suing Stream:  "+l1);
        //with using streams(From 1.8 version)
        List<Integer>l2=l.stream ().map (i->i*2).collect(Collectors.toList());
        System.out.println ("using stream:  "+l2);

    }
}
