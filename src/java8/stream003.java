package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public
class stream003 {
    public static
    void main (String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer> ();
        marks.add (0);
        marks.add (10);
        marks.add (20);
        marks.add (5);
        marks.add (15);
        marks.add (25);
        System.out.println ("Original Marks:  "+marks);
        //using stream() method from 1.8 ver
        List<Integer> updated_marks=marks.stream ().map (i->i+5).collect(Collectors.toList());
        System.out.println ("Updated marks increased by adding 5:  "+updated_marks);
    }
}
