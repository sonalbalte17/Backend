package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//sorted() in natural default order,ascending order
//default natural sorting order using Comparable object(compareTo()) method
public
class stream005 {
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
        List noOfFailedStudents=marks.stream ().sorted ().collect(Collectors.toList());
        System.out.println ("Sorted:  "+noOfFailedStudents);
        List<Integer> sortedList1=marks.stream ().sorted ((i1,i2)->i1.compareTo (i2)).collect(Collectors.toList());
        System.out.println ("Sorted in asc order using compareTo () method:  "+sortedList1);
    }
}
