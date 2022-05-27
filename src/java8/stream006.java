package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//sorted list in descending order using the Comparator object(compare() method)
//customized sorting using compareTo() method too
public
class stream006 {
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
        List<Integer> sortedList=marks.stream ().sorted ((i1,i2)->((i1<i2)?1:(i1>i2)?-1:0)).collect(Collectors.toList());
        System.out.println ("Sorted in desc order:  "+sortedList);
        List<Integer> sortedList1=marks.stream ().sorted ((i1,i2)->-i1.compareTo (i2)).collect(Collectors.toList());
        System.out.println ("Sorted in desc order using compareTo () method:  "+sortedList1);
        List<Integer> sortedList2=marks.stream ().sorted ((i1,i2)->i2.compareTo (i1)).collect(Collectors.toList());
        System.out.println ("Sorted in desc order using compareTo () method by exchanging i1 n i2 positions:  "+sortedList2);


    }
}
