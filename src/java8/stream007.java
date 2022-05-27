package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//Sorted list in natural sorting order.Natural sorting order for string objects is alphabetical order.
//reverse sorting (s1,s2) using -s1.compareTo(s2)
//reverse sorting (s1,s2) using s2.compareTo(s1)
public
class stream007 {
    public static
    void main (String[] args) {
        ArrayList<String>l=new ArrayList<String> ();
        l.add ("among us");
        l.add ("danger");
        l.add ("siri");
        l.add ("google");
        l.add ("alexa");
        l.add ("iphone");
        System.out.println (l);
        List<String>l1=l.stream ().sorted ().collect(Collectors.toList());
        System.out.println ("Sorted list in natural sorting order:  "+l1);
        List<String>l2=l.stream ().sorted ((s1,s2)->-s1.compareTo (s2)).collect(Collectors.toList());
       System.out.println ("Sorted list in reverse sorting order:  "+l2);
       List<String>l3=l.stream ().sorted ((s1,s2)->s2.compareTo (s1)).collect(Collectors.toList());
     System.out.println ("Sorted list in reverse sorting order by exchanging s1 n s2 positions:  "+l3);

    }
}
