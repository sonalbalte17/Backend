package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//collect() & count() methods in streams
public
class stream004 {
    public static
    void main (String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer> ();
        marks.add (70);
        marks.add (45);
        marks.add (10);
        marks.add (65);
        marks.add (20);
        marks.add (25);
        System.out.println ("Original Marks:  "+marks);
        List noOfFailedStudents=marks.stream ().filter (i->i<35).collect(Collectors.toList());
        System.out.println (noOfFailedStudents);
       long noOfFailedStudent1=marks.stream ().filter (i->i<35).count ();
        System.out.println (noOfFailedStudent1);


    }
}
